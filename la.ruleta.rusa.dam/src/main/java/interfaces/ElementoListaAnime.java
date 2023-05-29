package interfaces;

import javax.swing.JPanel;

import clases.Anime;
import clases.RuletaRusa;
import clases.Usuario;
import excepciones.AnimeException;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ElementoListaAnime extends JPanel{
	
	Ventana ventana;
	
	public ElementoListaAnime(Ventana v, String nombre) {
		this.ventana=v;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelnombre = new JLabel(nombre);
		GridBagConstraints gbc_labelnombre = new GridBagConstraints();
		gbc_labelnombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelnombre.gridx = 1;
		gbc_labelnombre.gridy = 0;
		add(labelnombre, gbc_labelnombre);
		
		ventana=v;

		
		//ArrayList <Anime> anime= RuletaRusa.devolverAnime();
		
	}
	
}