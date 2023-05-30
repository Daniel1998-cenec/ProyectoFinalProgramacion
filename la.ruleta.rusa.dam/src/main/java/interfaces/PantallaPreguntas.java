package interfaces;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import clases.Usuario;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPreguntas extends JPanel {
	
	private Ventana ventana;
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\img\\Circo.jpeg"));
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(),new Color(0,0,0),null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public PantallaPreguntas(Ventana v){
		setBackground(new Color(192, 192, 192));
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 116, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
		
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelIntroduccion = new JLabel("Bienvenido a la Beta de la app de la Ruleta Rusa");
		labelIntroduccion.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 21));
		GridBagConstraints gbc_labelIntroduccion = new GridBagConstraints();
		gbc_labelIntroduccion.gridwidth = 3;
		gbc_labelIntroduccion.insets = new Insets(0, 0, 5, 5);
		gbc_labelIntroduccion.gridx = 1;
		gbc_labelIntroduccion.gridy = 0;
		add(labelIntroduccion, gbc_labelIntroduccion);
		
		JButton buttonMiLista = new JButton("Mi Lista");
		buttonMiLista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaListado.class);
			}
		});
		buttonMiLista.setForeground(SystemColor.activeCaption);
		buttonMiLista.setBackground(Color.DARK_GRAY);
		buttonMiLista.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_buttonMiLista = new GridBagConstraints();
		gbc_buttonMiLista.insets = new Insets(0, 0, 5, 0);
		gbc_buttonMiLista.gridx = 4;
		gbc_buttonMiLista.gridy = 0;
		add(buttonMiLista, gbc_buttonMiLista);
		
		JLabel LabelIntroducción2 = new JLabel("A continuación se te harán dos preguntas, sino quieres responder, le pudes dar al boton saltar pregunta, y listo.");
		LabelIntroducción2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_LabelIntroducción2 = new GridBagConstraints();
		gbc_LabelIntroducción2.gridwidth = 5;
		gbc_LabelIntroducción2.insets = new Insets(0, 0, 5, 0);
		gbc_LabelIntroducción2.gridx = 0;
		gbc_LabelIntroducción2.gridy = 1;
		add(LabelIntroducción2, gbc_LabelIntroducción2);
		
		JButton buttonLeerManga = new JButton("Leer manga");
		buttonLeerManga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaManga.class);
			}
		});
		
		JButton buttonLeerLibro = new JButton("Leer libro");
		buttonLeerLibro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaLibro.class);
			}
		});
		
		JButton buttonVerAnime = new JButton("Ver anime");
		buttonVerAnime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaAnime.class);
			}
		});
		
		JButton buttonJugar = new JButton("Jugar Videojuego");
		buttonJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaVideojuego.class);
			}
		});
		
		JButton buttonOmitir = new JButton("Omitir");
		buttonOmitir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaPreguntas.class);
			}
		});
		
		JLabel labelIntroductorio3 = new JLabel("El botón omitir solo te lleva a una ruleta.");
		labelIntroductorio3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_labelIntroductorio3 = new GridBagConstraints();
		gbc_labelIntroductorio3.gridwidth = 5;
		gbc_labelIntroductorio3.insets = new Insets(0, 0, 5, 5);
		gbc_labelIntroductorio3.gridx = 0;
		gbc_labelIntroductorio3.gridy = 2;
		add(labelIntroductorio3, gbc_labelIntroductorio3);
		
		JButton buttonSaltarPregunta = new JButton("Saltar Preguntas");
		buttonSaltarPregunta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaDevolverTodo.class);
			}
		});
		buttonSaltarPregunta.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonSaltarPregunta = new GridBagConstraints();
		gbc_buttonSaltarPregunta.insets = new Insets(0, 0, 5, 5);
		gbc_buttonSaltarPregunta.gridx = 1;
		gbc_buttonSaltarPregunta.gridy = 3;
		add(buttonSaltarPregunta, gbc_buttonSaltarPregunta);
		buttonOmitir.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonOmitir = new GridBagConstraints();
		gbc_buttonOmitir.insets = new Insets(0, 0, 5, 5);
		gbc_buttonOmitir.gridx = 3;
		gbc_buttonOmitir.gridy = 3;
		add(buttonOmitir, gbc_buttonOmitir);
		
		JLabel LabelPregunta1 = new JLabel("¿Qué acción te apetece realizar?");
		LabelPregunta1.setBackground(new Color(240, 240, 240));
		LabelPregunta1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		LabelPregunta1.setToolTipText("");
		GridBagConstraints gbc_LabelPregunta1 = new GridBagConstraints();
		gbc_LabelPregunta1.insets = new Insets(0, 0, 5, 5);
		gbc_LabelPregunta1.gridx = 2;
		gbc_LabelPregunta1.gridy = 4;
		add(LabelPregunta1, gbc_LabelPregunta1);
		buttonJugar.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonJugar = new GridBagConstraints();
		gbc_buttonJugar.insets = new Insets(0, 0, 5, 5);
		gbc_buttonJugar.gridx = 0;
		gbc_buttonJugar.gridy = 5;
		add(buttonJugar, gbc_buttonJugar);
		buttonVerAnime.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonVerAnime = new GridBagConstraints();
		gbc_buttonVerAnime.insets = new Insets(0, 0, 5, 5);
		gbc_buttonVerAnime.gridx = 2;
		gbc_buttonVerAnime.gridy = 5;
		add(buttonVerAnime, gbc_buttonVerAnime);
		buttonLeerLibro.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonLeerLibro = new GridBagConstraints();
		gbc_buttonLeerLibro.insets = new Insets(0, 0, 5, 0);
		gbc_buttonLeerLibro.gridx = 4;
		gbc_buttonLeerLibro.gridy = 5;
		add(buttonLeerLibro, gbc_buttonLeerLibro);
		buttonLeerManga.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonLeerManga = new GridBagConstraints();
		gbc_buttonLeerManga.insets = new Insets(0, 0, 5, 5);
		gbc_buttonLeerManga.gridx = 0;
		gbc_buttonLeerManga.gridy = 6;
		add(buttonLeerManga, gbc_buttonLeerManga);
		
		JButton buttonVerSerie = new JButton("Ver serie");
		buttonVerSerie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaSerie.class);
			}
		});
		buttonVerSerie.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonVerSerie = new GridBagConstraints();
		gbc_buttonVerSerie.insets = new Insets(0, 0, 5, 5);
		gbc_buttonVerSerie.gridx = 2;
		gbc_buttonVerSerie.gridy = 6;
		add(buttonVerSerie, gbc_buttonVerSerie);
		
		JButton buttonVerPelicula = new JButton("Ver película");
		buttonVerPelicula.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaPelicula.class);
			}
		});
		buttonVerPelicula.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonVerPelicula = new GridBagConstraints();
		gbc_buttonVerPelicula.insets = new Insets(0, 0, 5, 0);
		gbc_buttonVerPelicula.gridx = 4;
		gbc_buttonVerPelicula.gridy = 6;
		add(buttonVerPelicula, gbc_buttonVerPelicula);
	}
}
