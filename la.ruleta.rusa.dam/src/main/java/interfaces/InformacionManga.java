package interfaces;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import enumerations.GeneroLibro;
import enumerations.GeneroManga;

public class InformacionManga extends JPanel {
	private JLabel labelEscritor;
	public InformacionManga(String nombre, String autor,GeneroManga generoManga,byte tomos, short capitulo, String enCurso) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelNombre = new JLabel("Nombre: "+ nombre);
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 1;
		add(labelNombre, gbc_labelNombre);
		
		JLabel labelAutor = new JLabel("Autor: "+autor);
		GridBagConstraints gbc_labelEscritor = new GridBagConstraints();
		gbc_labelEscritor.insets = new Insets(0, 0, 5, 5);
		gbc_labelEscritor.gridx = 1;
		gbc_labelEscritor.gridy = 2;
		add(labelAutor, gbc_labelEscritor);
		
		JLabel labelGenero = new JLabel("Genero: " + generoManga);
		GridBagConstraints gbc_labelGenero = new GridBagConstraints();
		gbc_labelGenero.insets = new Insets(0, 0, 5, 5);
		gbc_labelGenero.gridx = 1;
		gbc_labelGenero.gridy = 3;
		add(labelGenero, gbc_labelGenero);
		
		JLabel labelTomo = new JLabel("Saga: " + tomos);
		GridBagConstraints gbc_labelSaga = new GridBagConstraints();
		gbc_labelSaga.insets = new Insets(0, 0, 5, 5);
		gbc_labelSaga.gridx = 1;
		gbc_labelSaga.gridy = 4;
		add(labelTomo, gbc_labelSaga);
		
		JLabel labelCapitulo = new JLabel("Capitulo: "+capitulo);
		GridBagConstraints gbc_labelCapitulo = new GridBagConstraints();
		gbc_labelCapitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelCapitulo.gridx = 1;
		gbc_labelCapitulo.gridy = 5;
		add(labelCapitulo, gbc_labelCapitulo);
		
		JLabel labelEnCurso = new JLabel("En curso:" +enCurso );
		GridBagConstraints gbc_labelPagina = new GridBagConstraints();
		gbc_labelPagina.insets = new Insets(0, 0, 0, 5);
		gbc_labelPagina.gridx = 1;
		gbc_labelPagina.gridy = 6;
		add(labelEnCurso, gbc_labelPagina);
	
		
	}
		

}
