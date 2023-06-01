package interfaces;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import enumerations.GeneroPelicula;
import enumerations.Streaming;

public class InformacionPelicula extends JPanel {
	public InformacionPelicula (String nombre, short duracion,Streaming streaming,String director,GeneroPelicula genero, byte parte ) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelNombreListado = new JLabel("Nombre: "+ nombre);
		GridBagConstraints gbc_labelGeneroListado = new GridBagConstraints();
		gbc_labelGeneroListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelGeneroListado.gridx = 1;
		gbc_labelGeneroListado.gridy = 1;
		add(labelNombreListado, gbc_labelGeneroListado);
		
		JLabel labelDuracionListado = new JLabel("Duracion: "+duracion);
		GridBagConstraints gbc_labelDuracionListado = new GridBagConstraints();
		gbc_labelDuracionListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelDuracionListado.gridx = 1;
		gbc_labelDuracionListado.gridy = 2;
		add(labelDuracionListado, gbc_labelDuracionListado);
		
		JLabel labelStreamingListado = new JLabel("¿Donde ver?:"+ streaming);
		GridBagConstraints gbc_labelStreamingListado = new GridBagConstraints();
		gbc_labelStreamingListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelStreamingListado.gridx = 1;
		gbc_labelStreamingListado.gridy = 3;
		add(labelStreamingListado, gbc_labelStreamingListado);
		
		JLabel labelDirectorListado = new JLabel("Director: "+ director);
		GridBagConstraints gbc_labelTemporadaListado = new GridBagConstraints();
		gbc_labelTemporadaListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelTemporadaListado.gridx = 1;
		gbc_labelTemporadaListado.gridy = 4;
		add(labelDirectorListado, gbc_labelTemporadaListado);
		
		JLabel labelGeneroListado = new JLabel("Genero:" + genero);
		GridBagConstraints gbc_labelEspisodio = new GridBagConstraints();
		gbc_labelEspisodio.insets = new Insets(0, 0, 5, 5);
		gbc_labelEspisodio.gridx = 1;
		gbc_labelEspisodio.gridy = 5;
		add(labelGeneroListado, gbc_labelEspisodio);
		
		JLabel labelparteListado = new JLabel("Parte: "+parte);
		GridBagConstraints gbc_labelEpisodio = new GridBagConstraints();
		gbc_labelEpisodio.insets = new Insets(0, 0, 0, 5);
		gbc_labelEpisodio.gridx = 1;
		gbc_labelEpisodio.gridy = 6;
		add(labelparteListado, gbc_labelEpisodio);
		
		
		
	}
}
