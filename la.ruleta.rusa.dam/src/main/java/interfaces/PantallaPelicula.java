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

import clases.Manga;
import clases.Pelicula;
import clases.RuletaRusa;
import enumerations.GeneroManga;
import enumerations.GeneroPelicula;
import excepciones.GeneroMangaException;
import excepciones.GeneroPeliculaException;

public class PantallaPelicula extends JPanel {
	
	private Ventana ventana;
	
	public PantallaPelicula(Ventana v){
		setBackground(new Color(192, 192, 192));
		this.ventana=v;
		JLabel labelText = new JLabel("");
		labelText.setFont(new Font("Tahoma", Font.PLAIN, 21));
		labelText.setForeground(SystemColor.textHighlight);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 116, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel LabelIntroduccion = new JLabel("Bienvenido a la Beta de la app de la Ruleta Rusa");
		LabelIntroduccion.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 21));
		GridBagConstraints gbc_LabelIntroduccion = new GridBagConstraints();
		gbc_LabelIntroduccion.gridwidth = 3;
		gbc_LabelIntroduccion.insets = new Insets(0, 0, 5, 5);
		gbc_LabelIntroduccion.gridx = 1;
		gbc_LabelIntroduccion.gridy = 0;
		add(LabelIntroduccion, gbc_LabelIntroduccion);
		
		JButton btbuttonObraVista = new JButton("Obra vista");
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
		
		JLabel LabelIntroducción2 = new JLabel("A continuación se te harán dos preguntas, sino quieres responder, le pudes dar al boton omitir, y listo.");
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
		buttonOmitir.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonOmitir = new GridBagConstraints();
		gbc_buttonOmitir.insets = new Insets(0, 0, 5, 5);
		gbc_buttonOmitir.gridx = 2;
		gbc_buttonOmitir.gridy = 2;
		add(buttonOmitir, gbc_buttonOmitir);
		
		JLabel LabelPregunta2 = new JLabel("¿Qué género te apetece hacer?");
		LabelPregunta2.setBackground(new Color(240, 240, 240));
		LabelPregunta2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		LabelPregunta2.setToolTipText("");
		GridBagConstraints gbc_LabelPregunta2 = new GridBagConstraints();
		gbc_LabelPregunta2.gridwidth = 5;
		gbc_LabelPregunta2.insets = new Insets(0, 0, 5, 0);
		gbc_LabelPregunta2.gridx = 0;
		gbc_LabelPregunta2.gridy = 3;
		add(LabelPregunta2, gbc_LabelPregunta2);
		
		JButton buttonThriller = new JButton("Thriller");
		buttonThriller.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Pelicula> todo=new ArrayList<Pelicula>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroPelicula(GeneroPelicula.THRILLER);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroPeliculaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonThriller.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonThriller = new GridBagConstraints();
		gbc_buttonThriller.insets = new Insets(0, 0, 5, 5);
		gbc_buttonThriller.gridx = 0;
		gbc_buttonThriller.gridy = 4;
		add(buttonThriller, gbc_buttonThriller);
		
		JButton buttonDeporte = new JButton("Deporte");
		buttonDeporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Pelicula> todo=new ArrayList<Pelicula>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroPelicula(GeneroPelicula.DEPORTE);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroPeliculaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonDeporte.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonDeporte = new GridBagConstraints();
		gbc_buttonDeporte.insets = new Insets(0, 0, 5, 5);
		gbc_buttonDeporte.gridx = 2;
		gbc_buttonDeporte.gridy = 4;
		add(buttonDeporte, gbc_buttonDeporte);
		
		JButton buttonAccion = new JButton("Accion");
		buttonAccion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Pelicula> todo=new ArrayList<Pelicula>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroPelicula(GeneroPelicula.ACCION);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroPeliculaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonAccion.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonAccion = new GridBagConstraints();
		gbc_buttonAccion.insets = new Insets(0, 0, 5, 0);
		gbc_buttonAccion.gridx = 4;
		gbc_buttonAccion.gridy = 4;
		add(buttonAccion, gbc_buttonAccion);
		
		JButton buttonRomance = new JButton("Romance");
		buttonRomance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Pelicula> todo=new ArrayList<Pelicula>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroPelicula(GeneroPelicula.ROMANCE);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroPeliculaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonRomance.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonRomance = new GridBagConstraints();
		gbc_buttonRomance.insets = new Insets(0, 0, 5, 5);
		gbc_buttonRomance.gridx = 0;
		gbc_buttonRomance.gridy = 5;
		add(buttonRomance, gbc_buttonRomance);
		GridBagConstraints gbc_labelText = new GridBagConstraints();
		gbc_labelText.gridwidth = 5;
		gbc_labelText.insets = new Insets(0, 0, 5, 0);
		gbc_labelText.gridx = 0;
		gbc_labelText.gridy = 6;
		add(labelText, gbc_labelText);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBackground(SystemColor.activeCaption);
		buttonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRuletaRusa.class);
			}
		});
		GridBagConstraints gbc_buttonCancelar = new GridBagConstraints();
		gbc_buttonCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_buttonCancelar.gridx = 2;
		gbc_buttonCancelar.gridy = 7;
		add(buttonCancelar, gbc_buttonCancelar);
		
		
	}
}