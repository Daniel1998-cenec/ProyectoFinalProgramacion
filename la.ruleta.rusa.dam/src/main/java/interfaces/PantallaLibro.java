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

import clases.Anime;
import clases.Libro;
import clases.RuletaRusa;
import enumerations.GeneroAnime;
import enumerations.GeneroLibro;
import excepciones.GeneroAnimeException;
import excepciones.GeneroLibroException;

public class PantallaLibro extends JPanel {
	
	private Ventana ventana;
	
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\img\\fondo.jpeg"));
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(),new Color(0,0,0),null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PantallaLibro (Ventana v) {
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
		
		JButton buttonNovela = new JButton("Novela");
		buttonNovela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Libro> todo=new ArrayList<Libro>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroLibros(GeneroLibro.NOVELA);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroLibroException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonNovela.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonNovela = new GridBagConstraints();
		gbc_buttonNovela.insets = new Insets(0, 0, 5, 5);
		gbc_buttonNovela.gridx = 0;
		gbc_buttonNovela.gridy = 4;
		add(buttonNovela, gbc_buttonNovela);
		
		JButton buttonCulto = new JButton("Culto");
		buttonCulto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Libro> todo=new ArrayList<Libro>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroLibros(GeneroLibro.CULTO);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroLibroException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonCulto.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonCulto = new GridBagConstraints();
		gbc_buttonCulto.insets = new Insets(0, 0, 5, 5);
		gbc_buttonCulto.gridx = 2;
		gbc_buttonCulto.gridy = 4;
		add(buttonCulto, gbc_buttonCulto);
		
		JButton buttonAventura = new JButton("Aventura");
		buttonAventura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Libro> todo=new ArrayList<Libro>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroLibros(GeneroLibro.AVENTURA);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroLibroException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonAventura.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonAventura = new GridBagConstraints();
		gbc_buttonAventura.insets = new Insets(0, 0, 5, 0);
		gbc_buttonAventura.gridx = 4;
		gbc_buttonAventura.gridy = 4;
		add(buttonAventura, gbc_buttonAventura);
		
		JButton buttonFiccion = new JButton("Ficcion");
		buttonFiccion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Libro> todo=new ArrayList<Libro>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroLibros(GeneroLibro.FICCION);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroLibroException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonFiccion.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonFiccion = new GridBagConstraints();
		gbc_buttonFiccion.insets = new Insets(0, 0, 5, 5);
		gbc_buttonFiccion.gridx = 0;
		gbc_buttonFiccion.gridy = 5;
		add(buttonFiccion, gbc_buttonFiccion);
		
		JButton buttonSuspense = new JButton("Suspense");
		buttonSuspense.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Libro> todo=new ArrayList<Libro>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverGeneroLibros(GeneroLibro.SUSPENSE);
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (GeneroLibroException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonSuspense.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonSuspense = new GridBagConstraints();
		gbc_buttonSuspense.insets = new Insets(0, 0, 5, 5);
		gbc_buttonSuspense.gridx = 2;
		gbc_buttonSuspense.gridy = 5;
		add(buttonSuspense, gbc_buttonSuspense);
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