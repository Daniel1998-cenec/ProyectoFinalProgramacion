package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Anime;
import clases.Libro;
import clases.Manga;
import clases.Obra;
import clases.Pelicula;
import clases.RuletaRusa;
import clases.Serie;
import clases.Videojuego;
import enumerations.GeneroPelicula;
import excepciones.GeneroPeliculaException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class PantallaDevolverTodo extends JPanel {
	
	private Ventana ventana;
	
	public PantallaDevolverTodo(Ventana v){
		setBackground(new Color(192, 192, 192));
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{61, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 64, 0, 116, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelIntroduccion = new JLabel("Bienvenido a la Beta de la app de la Ruleta Rusa");
		labelIntroduccion.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 21));
		GridBagConstraints gbc_labelIntroduccion = new GridBagConstraints();
		gbc_labelIntroduccion.gridwidth = 3;
		gbc_labelIntroduccion.insets = new Insets(0, 0, 5, 5);
		gbc_labelIntroduccion.gridx = 1;
		gbc_labelIntroduccion.gridy = 0;
		add(labelIntroduccion, gbc_labelIntroduccion);
		
		JButton btbuttonObraVista = new JButton("Mi lista");
		btbuttonObraVista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaListado.class);
			}
		});
		btbuttonObraVista.setForeground(SystemColor.activeCaption);
		btbuttonObraVista.setBackground(Color.DARK_GRAY);
		btbuttonObraVista.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_btbuttonObraVista = new GridBagConstraints();
		gbc_btbuttonObraVista.insets = new Insets(0, 0, 5, 0);
		gbc_btbuttonObraVista.gridx = 4;
		gbc_btbuttonObraVista.gridy = 0;
		add(btbuttonObraVista, gbc_btbuttonObraVista);
		
		JLabel LabelIntroducción2 = new JLabel("Dale al botón enseñar todo, y verás la magia.");
		LabelIntroducción2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_LabelIntroducción2 = new GridBagConstraints();
		gbc_LabelIntroducción2.gridwidth = 5;
		gbc_LabelIntroducción2.insets = new Insets(0, 0, 5, 0);
		gbc_LabelIntroducción2.gridx = 0;
		gbc_LabelIntroducción2.gridy = 1;
		add(LabelIntroducción2, gbc_LabelIntroducción2);
		
		JButton buttonOmitir = new JButton("Omitir");
		buttonOmitir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaPreguntas.class);
			}
		});
		JScrollPane scrollPane = new JScrollPane();
		JPanel contenedorPanel = new JPanel();
		contenedorPanel.setBackground(Color.LIGHT_GRAY);
		JButton buttonEnseñarTodo = new JButton("Enseñar todo");
		buttonEnseñarTodo.setBackground(SystemColor.activeCaption);
		buttonEnseñarTodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Obra> todo=new ArrayList<Obra>();
				try {
					todo=RuletaRusa.devolverTodo();
					for (byte i=0;i<todo.size();i++) {
						if(todo.get(i).getClass()==Anime.class) {
							contenedorPanel.add(new InformacionAnime(((Anime)todo.get(i)).getNombre(),((Anime)todo.get(i)).getGenero(), (short)((Anime)todo.get(i)).getDuracion(), ((Anime)todo.get(i)).getStreaming(), 
						(byte)((Anime)todo.get(i)).getTemporadas(),(short)((Anime)todo.get(i)).getEpisodios()));
						}else if(todo.get(i).getClass()==Libro.class) {
							contenedorPanel.add(new InformacionLibro(((Libro)todo.get(i)).getNombre(),((Libro)todo.get(i)).getEscritor(),
									((Libro)todo.get(i)).getEditorial(),((Libro)todo.get(i)).getGenero(),((Libro)todo.get(i)).getnumeroSaga(),
									((Libro)todo.get(i)).getCapitulo(),((Libro)todo.get(i)).getPaginas()));
						}else if(todo.get(i).getClass()==Manga.class) {
							contenedorPanel.add(new InformacionManga(((Manga)todo.get(i)).getNombre(), ((Manga)todo.get(i)).getAutor(), ((Manga)todo.get(i)).getGeneroManga(),
									((Manga)todo.get(i)).getNumeroTomos(), ((Manga)todo.get(i)).getCapitulos(),((Manga)todo.get(i)).getEnCurso()));
						}else if(todo.get(i).getClass()==Pelicula.class) {
							contenedorPanel.add(new InformacionPelicula(((Pelicula)todo.get(i)).getNombre(),((Pelicula)todo.get(i)).getDuracion(),
									((Pelicula)todo.get(i)).getStreaming(),((Pelicula)todo.get(i)).getDirector(),((Pelicula)todo.get(i)).getGeneroPelicula(),
									((Pelicula)todo.get(i)).getParte()));
						}else if(todo.get(i).getClass()==Serie.class) {
							contenedorPanel.add(new InformacionSerie(((Serie)todo.get(i)).getNombre(),((Serie)todo.get(i)).getDuracion(),
									((Serie)todo.get(i)).getStreaming(),((Serie)todo.get(i)).getTemporadas(),((Serie)todo.get(i)).getEpisodios(),
									((Serie)todo.get(i)).getGeneroSerie()));
						}else if(todo.get(i).getClass()==Videojuego.class) {
							contenedorPanel.add(new InformacionVideojuego(((Videojuego)todo.get(i)).getNombre(), ((Videojuego)todo.get(i)).getEmpresa(),
									((Videojuego)todo.get(i)).getGeneroVidejuego(),((Videojuego)todo.get(i)).getTiempoEstimado(),((Videojuego)todo.get(i)).getTienda(),
									((Videojuego)todo.get(i)).getTiendaDescuento(),((Videojuego)todo.get(i)).getPlataforma()));
						}
					}
					scrollPane.setViewportView(contenedorPanel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_buttonEnseñarTodo = new GridBagConstraints();
		gbc_buttonEnseñarTodo.insets = new Insets(0, 0, 5, 5);
		gbc_buttonEnseñarTodo.gridx = 1;
		gbc_buttonEnseñarTodo.gridy = 2;
		add(buttonEnseñarTodo, gbc_buttonEnseñarTodo);
		buttonOmitir.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonOmitir = new GridBagConstraints();
		gbc_buttonOmitir.insets = new Insets(0, 0, 5, 5);
		gbc_buttonOmitir.gridx = 3;
		gbc_buttonOmitir.gridy = 2;
		add(buttonOmitir, gbc_buttonOmitir);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRuletaRusa.class);
			}
		});
		
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);
		
		
		scrollPane.setViewportView(contenedorPanel);
		buttonCancelar.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonCancelar = new GridBagConstraints();
		gbc_buttonCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_buttonCancelar.gridx = 2;
		gbc_buttonCancelar.gridy = 7;
		add(buttonCancelar, gbc_buttonCancelar);
	}
}