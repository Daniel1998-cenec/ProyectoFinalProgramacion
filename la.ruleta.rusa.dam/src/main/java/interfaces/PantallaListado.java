package interfaces;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import clases.Anime;
import clases.RuletaRusa;
import excepciones.AnimeException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;

public class PantallaListado extends JPanel {

	private Ventana ventana;
	
	public PantallaListado(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JLabel claveBienvenido = new JLabel("Bienvenido@, "+ventana.usuarioLogado.getNick()+", listado de anime");
		claveBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		claveBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(claveBienvenido, BorderLayout.NORTH);
		JButton botonCancelar=new JButton("Cancelar");
		botonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.cambiarPantalla(PantallaRuletaRusa.class);
			}
		});
		add(botonCancelar, BorderLayout.SOUTH);
		JScrollPane lista = new JScrollPane();
		add(lista, BorderLayout.CENTER);
		
		JPanel contenedorPanel = new JPanel();
		lista.setViewportView(contenedorPanel);
		ArrayList<Anime> anime = null;
		try {
			anime = RuletaRusa.devolverAnime();
		} catch (AnimeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		contenedorPanel.setLayout(new BoxLayout(contenedorPanel, BoxLayout.X_AXIS));
		
		ElementoListaAnime elementoListaAnime = new ElementoListaAnime(v, anime.get(0).getNombre());
		GridBagLayout gridBagLayout = (GridBagLayout) elementoListaAnime.getLayout();
		gridBagLayout.rowHeights = new int[]{157, 0, 0, 0, 0};
		gridBagLayout.columnWidths = new int[]{157, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
		contenedorPanel.add(elementoListaAnime);
		
		JButton buttonVerDetalle = new JButton("Ver Detalle");
		buttonVerDetalle.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				ArrayList<Anime> a = null;
				try {
					a = RuletaRusa.devolverAnime();
				} catch (AnimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(v, new InformacionAnime(a.get(0).getNombre(),a.get(0).getGenero(), (short)a.get(0).getDuracion(), a.get(0).getStreaming(), 
						(byte)a.get(0).getTemporadas(),(short) a.get(0).getEpisodios()),"Informacion del anime",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		JLabel lbaelImg = new JLabel("");
		lbaelImg.setIcon(new ImageIcon(".\\img\\haikyu2.jpeg"));
		GridBagConstraints gbc_lbaelImg = new GridBagConstraints();
		gbc_lbaelImg.insets = new Insets(0, 0, 5, 5);
		gbc_lbaelImg.gridx = 0;
		gbc_lbaelImg.gridy = 0;
		elementoListaAnime.add(lbaelImg, gbc_lbaelImg);
		GridBagConstraints gbc_buttonVerDetalle = new GridBagConstraints();
		gbc_buttonVerDetalle.insets = new Insets(0, 0, 5, 0);
		gbc_buttonVerDetalle.gridx = 2;
		gbc_buttonVerDetalle.gridy = 0;
		elementoListaAnime.add(buttonVerDetalle, gbc_buttonVerDetalle);
		
		JLabel LabelImg2 = new JLabel("");
		LabelImg2.setIcon(new ImageIcon(".\\img\\ippo2.jpeg"));
		GridBagConstraints gbc_LabelImg2 = new GridBagConstraints();
		gbc_LabelImg2.insets = new Insets(0, 0, 5, 5);
		gbc_LabelImg2.gridx = 0;
		gbc_LabelImg2.gridy = 1;
		elementoListaAnime.add(LabelImg2, gbc_LabelImg2);
		ElementoListaAnime elementoListaAnime_4 = new ElementoListaAnime(v, anime.get(1).getNombre());
		GridBagConstraints gbc_elementoListaAnime_4 = new GridBagConstraints();
		gbc_elementoListaAnime_4.insets = new Insets(0, 0, 5, 5);
		gbc_elementoListaAnime_4.gridx = 1;
		gbc_elementoListaAnime_4.gridy = 1;
		elementoListaAnime.add(elementoListaAnime_4, gbc_elementoListaAnime_4);
		
		JButton buttonVerDetalle1 = new JButton("Ver detalle");
		buttonVerDetalle1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Anime> a = null;
				try {
					a = RuletaRusa.devolverAnime();
				} catch (AnimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(v, new InformacionAnime(a.get(1).getNombre(),a.get(1).getGenero(), (short)a.get(1).getDuracion(), a.get(1).getStreaming(), 
						(byte)a.get(1).getTemporadas(),(short) a.get(1).getEpisodios()),"Informacion del anime",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		GridBagConstraints gbc_buttonVerDetalle1 = new GridBagConstraints();
		gbc_buttonVerDetalle1.insets = new Insets(0, 0, 5, 0);
		gbc_buttonVerDetalle1.gridx = 2;
		gbc_buttonVerDetalle1.gridy = 1;
		elementoListaAnime.add(buttonVerDetalle1, gbc_buttonVerDetalle1);
		
		JLabel labelImg3 = new JLabel("");
		labelImg3.setIcon(new ImageIcon(".\\img\\inuyahsa.jpeg"));
		GridBagConstraints gbc_labelImg3 = new GridBagConstraints();
		gbc_labelImg3.insets = new Insets(0, 0, 5, 5);
		gbc_labelImg3.gridx = 0;
		gbc_labelImg3.gridy = 2;
		elementoListaAnime.add(labelImg3, gbc_labelImg3);
		ElementoListaAnime elementoListaAnime_3 = new ElementoListaAnime(v, anime.get(2).getNombre());
		GridBagConstraints gbc_elementoListaAnime_3 = new GridBagConstraints();
		gbc_elementoListaAnime_3.insets = new Insets(0, 0, 5, 5);
		gbc_elementoListaAnime_3.gridx = 1;
		gbc_elementoListaAnime_3.gridy = 2;
		elementoListaAnime.add(elementoListaAnime_3, gbc_elementoListaAnime_3);
		
		JButton buttonVerDetalle2 = new JButton("Ver detalle");
		buttonVerDetalle2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Anime> a = null;
				try {
					a = RuletaRusa.devolverAnime();
				} catch (AnimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(v, new InformacionAnime(a.get(2).getNombre(),a.get(2).getGenero(), (short)a.get(2).getDuracion(), a.get(2).getStreaming(), 
						(byte)a.get(2).getTemporadas(),(short) a.get(2).getEpisodios()),"Informacion del anime",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		GridBagConstraints gbc_buttonVerDetalle2 = new GridBagConstraints();
		gbc_buttonVerDetalle2.insets = new Insets(0, 0, 5, 0);
		gbc_buttonVerDetalle2.gridx = 2;
		gbc_buttonVerDetalle2.gridy = 2;
		elementoListaAnime.add(buttonVerDetalle2, gbc_buttonVerDetalle2);
		
		JLabel labelImg4 = new JLabel("");
		labelImg4.setIcon(new ImageIcon(".\\img\\deku.jpeg"));
		GridBagConstraints gbc_labelImg4 = new GridBagConstraints();
		gbc_labelImg4.insets = new Insets(0, 0, 5, 5);
		gbc_labelImg4.gridx = 0;
		gbc_labelImg4.gridy = 3;
		elementoListaAnime.add(labelImg4, gbc_labelImg4);
		ElementoListaAnime elementoListaAnime_2 = new ElementoListaAnime(v, anime.get(3).getNombre());
		GridBagConstraints gbc_elementoListaAnime_2 = new GridBagConstraints();
		gbc_elementoListaAnime_2.insets = new Insets(0, 0, 5, 5);
		gbc_elementoListaAnime_2.gridx = 1;
		gbc_elementoListaAnime_2.gridy = 3;
		elementoListaAnime.add(elementoListaAnime_2, gbc_elementoListaAnime_2);
		
		JButton buttonVerDetalle3 = new JButton("Ver Detalle");
		buttonVerDetalle3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Anime> a = null;
				try {
					a = RuletaRusa.devolverAnime();
				} catch (AnimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(v, new InformacionAnime(a.get(3).getNombre(),a.get(3).getGenero(), (short)a.get(3).getDuracion(), a.get(3).getStreaming(), 
						(byte)a.get(3).getTemporadas(),(short) a.get(3).getEpisodios()),"Informacion del anime",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		GridBagConstraints gbc_buttonVerDetalle3 = new GridBagConstraints();
		gbc_buttonVerDetalle3.insets = new Insets(0, 0, 5, 0);
		gbc_buttonVerDetalle3.gridx = 2;
		gbc_buttonVerDetalle3.gridy = 3;
		elementoListaAnime.add(buttonVerDetalle3, gbc_buttonVerDetalle3);
		
		JLabel labelImg5 = new JLabel("");
		labelImg5.setIcon(new ImageIcon(".\\img\\chopper.jpeg"));
		GridBagConstraints gbc_labelImg5 = new GridBagConstraints();
		gbc_labelImg5.insets = new Insets(0, 0, 0, 5);
		gbc_labelImg5.gridx = 0;
		gbc_labelImg5.gridy = 4;
		elementoListaAnime.add(labelImg5, gbc_labelImg5);
		ElementoListaAnime elementoListaAnime_1 = new ElementoListaAnime(v, anime.get(4).getNombre());
		GridBagConstraints gbc_elementoListaAnime_1 = new GridBagConstraints();
		gbc_elementoListaAnime_1.insets = new Insets(0, 0, 0, 5);
		gbc_elementoListaAnime_1.gridx = 1;
		gbc_elementoListaAnime_1.gridy = 4;
		elementoListaAnime.add(elementoListaAnime_1, gbc_elementoListaAnime_1);
		
		JButton buttonVerDetalle4 = new JButton("Ver Detalle");
		buttonVerDetalle4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Anime> a = null;
				try {
					a = RuletaRusa.devolverAnime();
				} catch (AnimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(v, new InformacionAnime(a.get(4).getNombre(),a.get(4).getGenero(), (short)a.get(4).getDuracion(), a.get(4).getStreaming(), 
						(byte)a.get(4).getTemporadas(),(short) a.get(4).getEpisodios()),"Informacion del anime",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		GridBagConstraints gbc_buttonVerDetalle4 = new GridBagConstraints();
		gbc_buttonVerDetalle4.gridx = 2;
		gbc_buttonVerDetalle4.gridy = 4;
		elementoListaAnime.add(buttonVerDetalle4, gbc_buttonVerDetalle4);
		

	}
}
