package interfaces;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import enumerations.GeneroLibro;
import enumerations.Streaming;

public class InformacionLibro extends JPanel {
	private JLabel labelEscritor;
	public InformacionLibro(String nombre, String escritor,String editorial,GeneroLibro genero,byte saga, short capitulo, short pagina) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelNombre = new JLabel("Nombre: "+ nombre);
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 1;
		add(labelNombre, gbc_labelNombre);
		
		labelEscritor = new JLabel("Escritor: "+ escritor);
		GridBagConstraints gbc_labelEscritor = new GridBagConstraints();
		gbc_labelEscritor.insets = new Insets(0, 0, 5, 5);
		gbc_labelEscritor.gridx = 1;
		gbc_labelEscritor.gridy = 2;
		add(labelEscritor, gbc_labelEscritor);
		
		JLabel labelEditorial = new JLabel("Editorial: " + editorial);
		GridBagConstraints gbc_labelEditorial = new GridBagConstraints();
		gbc_labelEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_labelEditorial.gridx = 1;
		gbc_labelEditorial.gridy = 3;
		add(labelEditorial, gbc_labelEditorial);
		
		JLabel labelGenero = new JLabel("Genero: " + genero);
		GridBagConstraints gbc_labelGenero = new GridBagConstraints();
		gbc_labelGenero.insets = new Insets(0, 0, 5, 5);
		gbc_labelGenero.gridx = 1;
		gbc_labelGenero.gridy = 4;
		add(labelGenero, gbc_labelGenero);
		
		JLabel labelSaga = new JLabel("Saga " + saga);
		GridBagConstraints gbc_labelSaga = new GridBagConstraints();
		gbc_labelSaga.insets = new Insets(0, 0, 5, 5);
		gbc_labelSaga.gridx = 1;
		gbc_labelSaga.gridy = 5;
		add(labelSaga, gbc_labelSaga);
		
		JLabel labelCapitulo = new JLabel("Capitulo:"+ capitulo);
		GridBagConstraints gbc_labelCapitulo = new GridBagConstraints();
		gbc_labelCapitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelCapitulo.gridx = 1;
		gbc_labelCapitulo.gridy = 6;
		add(labelCapitulo, gbc_labelCapitulo);
		
		JLabel labelPagina = new JLabel("Pagina:" + pagina );
		GridBagConstraints gbc_labelPagina = new GridBagConstraints();
		gbc_labelPagina.insets = new Insets(0, 0, 0, 5);
		gbc_labelPagina.gridx = 1;
		gbc_labelPagina.gridy = 7;
		add(labelPagina, gbc_labelPagina);
		
		
		
	}	
		
	}