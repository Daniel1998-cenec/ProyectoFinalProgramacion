package interfaces;

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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	
	public PantallaPreguntas(Ventana v){
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
		
		JLabel LabelPregunta1 = new JLabel("¿Qué acción te apetece realizar?");
		LabelPregunta1.setBackground(new Color(240, 240, 240));
		LabelPregunta1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		LabelPregunta1.setToolTipText("");
		GridBagConstraints gbc_LabelPregunta1 = new GridBagConstraints();
		gbc_LabelPregunta1.gridwidth = 5;
		gbc_LabelPregunta1.insets = new Insets(0, 0, 5, 0);
		gbc_LabelPregunta1.gridx = 0;
		gbc_LabelPregunta1.gridy = 3;
		add(LabelPregunta1, gbc_LabelPregunta1);
		
		JButton buttonJugar = new JButton("Jugar Videojuego");
		buttonJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaVideojuego.class);
			}
		});
		buttonJugar.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonJugar = new GridBagConstraints();
		gbc_buttonJugar.insets = new Insets(0, 0, 5, 5);
		gbc_buttonJugar.gridx = 0;
		gbc_buttonJugar.gridy = 4;
		add(buttonJugar, gbc_buttonJugar);
		
		JButton buttonVerAnime = new JButton("Ver anime");
		buttonVerAnime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaAnime.class);
			}
		});
		buttonVerAnime.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonVerAnime = new GridBagConstraints();
		gbc_buttonVerAnime.insets = new Insets(0, 0, 5, 5);
		gbc_buttonVerAnime.gridx = 2;
		gbc_buttonVerAnime.gridy = 4;
		add(buttonVerAnime, gbc_buttonVerAnime);
		
		JButton buttonLeerLibro = new JButton("Leer libro");
		buttonLeerLibro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaLibro.class);
			}
		});
		buttonLeerLibro.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonLeerLibro = new GridBagConstraints();
		gbc_buttonLeerLibro.insets = new Insets(0, 0, 5, 0);
		gbc_buttonLeerLibro.gridx = 4;
		gbc_buttonLeerLibro.gridy = 4;
		add(buttonLeerLibro, gbc_buttonLeerLibro);
		
		JButton buttonLeerManga = new JButton("Leer manga");
		buttonLeerManga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaManga.class);
			}
		});
		buttonLeerManga.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonLeerManga = new GridBagConstraints();
		gbc_buttonLeerManga.insets = new Insets(0, 0, 5, 5);
		gbc_buttonLeerManga.gridx = 0;
		gbc_buttonLeerManga.gridy = 5;
		add(buttonLeerManga, gbc_buttonLeerManga);
		
		JButton buttonVerSerie = new JButton("Ver serie");
		buttonVerSerie.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonVerSerie = new GridBagConstraints();
		gbc_buttonVerSerie.insets = new Insets(0, 0, 5, 5);
		gbc_buttonVerSerie.gridx = 2;
		gbc_buttonVerSerie.gridy = 5;
		add(buttonVerSerie, gbc_buttonVerSerie);
		
		JButton buttonVerPelicula = new JButton("Ver película");
		buttonVerPelicula.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonVerPelicula = new GridBagConstraints();
		gbc_buttonVerPelicula.insets = new Insets(0, 0, 5, 0);
		gbc_buttonVerPelicula.gridx = 4;
		gbc_buttonVerPelicula.gridy = 5;
		add(buttonVerPelicula, gbc_buttonVerPelicula);
	}
}
