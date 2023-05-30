package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Manga;
import clases.RuletaRusa;
import clases.Serie;
import enumerations.GeneroManga;
import enumerations.GeneroSerie;
import excepciones.GeneroMangaException;
import excepciones.GeneroSerieException;
import javax.swing.JTextArea;

public class PantallaSerie extends JPanel {
	
	private Ventana ventana;
	
	/*protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\img\\fondo4.jpg"));
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(),new Color(0,0,0),null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public PantallaSerie(Ventana v) {
		setBackground(new Color(192, 192, 192));
		this.ventana=v;
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
		
		JTextArea labelText = new JTextArea();
		
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
		
		JButton buttonAccionYAventura = new JButton("Accion y Aventura");
		buttonAccionYAventura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Serie> todo=new ArrayList<Serie>();
				String aux="";
				try {
					todo=RuletaRusa.devolverGeneroSerie(GeneroSerie.ACCIONYAVENTURA);
					for(byte i=0;i<todo.size();i++) {
						aux+=todo.get(i);
					}
					labelText.setText(aux);
				} catch (GeneroSerieException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonAccionYAventura.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonAccionYAventura = new GridBagConstraints();
		gbc_buttonAccionYAventura.insets = new Insets(0, 0, 5, 5);
		gbc_buttonAccionYAventura.gridx = 0;
		gbc_buttonAccionYAventura.gridy = 4;
		add(buttonAccionYAventura, gbc_buttonAccionYAventura);
		
		JButton buttonPoliciaca = new JButton("Policiaca");
		buttonPoliciaca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Serie> todo=new ArrayList<Serie>();
				String aux="";
				try {
					todo=RuletaRusa.devolverGeneroSerie(GeneroSerie.POLICIACA);
					for(byte i=0;i<todo.size();i++) {
						aux+=todo.get(i);
					}
					
					labelText.setText(aux);
				} catch (GeneroSerieException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonPoliciaca.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonPoliciaca = new GridBagConstraints();
		gbc_buttonPoliciaca.insets = new Insets(0, 0, 5, 5);
		gbc_buttonPoliciaca.gridx = 2;
		gbc_buttonPoliciaca.gridy = 4;
		add(buttonPoliciaca, gbc_buttonPoliciaca);
		
		JButton buttonDrama = new JButton("Drama");
		buttonDrama.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Serie> todo=new ArrayList<Serie>();
				String aux="";
				try {
					todo=RuletaRusa.devolverGeneroSerie(GeneroSerie.DRAMA);
					for(byte i=0;i<todo.size();i++) {
						aux+=todo.get(i);
					}
					labelText.setText(aux);
				} catch (GeneroSerieException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonDrama.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonDrama = new GridBagConstraints();
		gbc_buttonDrama.insets = new Insets(0, 0, 5, 0);
		gbc_buttonDrama.gridx = 4;
		gbc_buttonDrama.gridy = 4;
		add(buttonDrama, gbc_buttonDrama);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBackground(SystemColor.activeCaption);
		buttonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRuletaRusa.class);
			}
		});
		
		
		labelText.setBackground(Color.LIGHT_GRAY);
		labelText.setEditable(false);
		GridBagConstraints gbc_labelText = new GridBagConstraints();
		gbc_labelText.gridheight = 2;
		gbc_labelText.insets = new Insets(0, 0, 5, 5);
		gbc_labelText.fill = GridBagConstraints.BOTH;
		gbc_labelText.gridx = 2;
		gbc_labelText.gridy = 5;
		add(labelText, gbc_labelText);
		GridBagConstraints gbc_buttonCancelar = new GridBagConstraints();
		gbc_buttonCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_buttonCancelar.gridx = 2;
		gbc_buttonCancelar.gridy = 7;
		add(buttonCancelar, gbc_buttonCancelar);
		
		
	}
}