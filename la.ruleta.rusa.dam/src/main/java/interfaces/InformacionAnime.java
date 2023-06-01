package interfaces;

import javax.swing.JPanel;

import enumerations.GeneroAnime;
import enumerations.Streaming;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class InformacionAnime extends JPanel {
	public InformacionAnime(String nombre,GeneroAnime genero, short duracion,Streaming streaming,byte temporada,short episodio ) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel labelNombre1 = new JLabel("Nombre: ");
		GridBagConstraints gbc_labelNombre1 = new GridBagConstraints();
		gbc_labelNombre1.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre1.gridx = 1;
		gbc_labelNombre1.gridy = 1;
		add(labelNombre1, gbc_labelNombre1);
		
		JLabel labelNombre2 = new JLabel(nombre+"");
		GridBagConstraints gbc_labelNombre2 = new GridBagConstraints();
		gbc_labelNombre2.insets = new Insets(0, 0, 5, 0);
		gbc_labelNombre2.gridx = 2;
		gbc_labelNombre2.gridy = 1;
		add(labelNombre2, gbc_labelNombre2);
		
		JLabel labelGeneroListado = new JLabel("Genero:");
		GridBagConstraints gbc_labelGeneroListado = new GridBagConstraints();
		gbc_labelGeneroListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelGeneroListado.gridx = 1;
		gbc_labelGeneroListado.gridy = 2;
		add(labelGeneroListado, gbc_labelGeneroListado);
		
		JLabel labelListadoNombre = new JLabel(genero+"");
		GridBagConstraints gbc_labelListadoAnime = new GridBagConstraints();
		gbc_labelListadoAnime.insets = new Insets(0, 0, 5, 0);
		gbc_labelListadoAnime.gridx = 2;
		gbc_labelListadoAnime.gridy = 2;
		add(labelListadoNombre, gbc_labelListadoAnime);
		
		JLabel labelDuracionListado = new JLabel("Duracion:");
		GridBagConstraints gbc_labelDuracionListado = new GridBagConstraints();
		gbc_labelDuracionListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelDuracionListado.gridx = 1;
		gbc_labelDuracionListado.gridy = 3;
		add(labelDuracionListado, gbc_labelDuracionListado);
		
		JLabel labelDuracion = new JLabel(duracion+"");
		GridBagConstraints gbc_labelDuracion = new GridBagConstraints();
		gbc_labelDuracion.insets = new Insets(0, 0, 5, 0);
		gbc_labelDuracion.gridx = 2;
		gbc_labelDuracion.gridy = 3;
		add(labelDuracion, gbc_labelDuracion);
		
		JLabel labelStreamingListado = new JLabel("¿Donde ver?:");
		GridBagConstraints gbc_labelStreamingListado = new GridBagConstraints();
		gbc_labelStreamingListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelStreamingListado.gridx = 1;
		gbc_labelStreamingListado.gridy = 4;
		add(labelStreamingListado, gbc_labelStreamingListado);
		
		JLabel labelStreaming = new JLabel(streaming+"");
		GridBagConstraints gbc_labelStreaming = new GridBagConstraints();
		gbc_labelStreaming.insets = new Insets(0, 0, 5, 0);
		gbc_labelStreaming.gridx = 2;
		gbc_labelStreaming.gridy = 4;
		add(labelStreaming, gbc_labelStreaming);
		
		JLabel labelTemporadaListado = new JLabel("Temporada:");
		GridBagConstraints gbc_labelTemporadaListado = new GridBagConstraints();
		gbc_labelTemporadaListado.insets = new Insets(0, 0, 5, 5);
		gbc_labelTemporadaListado.gridx = 1;
		gbc_labelTemporadaListado.gridy = 5;
		add(labelTemporadaListado, gbc_labelTemporadaListado);
		
		JLabel labelTemporada = new JLabel(temporada+"");
		GridBagConstraints gbc_labelTemporada = new GridBagConstraints();
		gbc_labelTemporada.insets = new Insets(0, 0, 5, 0);
		gbc_labelTemporada.gridx = 2;
		gbc_labelTemporada.gridy = 5;
		add(labelTemporada, gbc_labelTemporada);
		
		JLabel labelEspisodio = new JLabel("Episodio:");
		GridBagConstraints gbc_labelEspisodio = new GridBagConstraints();
		gbc_labelEspisodio.insets = new Insets(0, 0, 0, 5);
		gbc_labelEspisodio.gridx = 1;
		gbc_labelEspisodio.gridy = 6;
		add(labelEspisodio, gbc_labelEspisodio);
		
		JLabel labelEpisodio = new JLabel(episodio+"");
		GridBagConstraints gbc_labelEpisodio = new GridBagConstraints();
		gbc_labelEpisodio.gridx = 2;
		gbc_labelEpisodio.gridy = 6;
		add(labelEpisodio, gbc_labelEpisodio);
		
		
		
	}
	
}
