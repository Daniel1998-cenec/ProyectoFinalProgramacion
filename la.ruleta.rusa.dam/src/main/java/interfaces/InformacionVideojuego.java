package interfaces;

import javax.swing.JPanel;

import enumerations.GeneroPelicula;
import enumerations.GeneroVideojuego;
import enumerations.Streaming;
import enumerations.TiendaVideojuego;
import enumerations.TiendaVideojuegoDescuento;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class InformacionVideojuego extends JPanel {
	public InformacionVideojuego(String nombre, String empresa, GeneroVideojuego genero, short tiempoEstimado,
			TiendaVideojuego tienda, TiendaVideojuegoDescuento tiendaDescuento, String plataforma) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelNombre = new JLabel("Nombre: "+nombre);
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 1;
		add(labelNombre, gbc_labelNombre);
		
		JLabel labelEmpresa = new JLabel("Empresa: "+empresa);
		GridBagConstraints gbc_labelEmpresa = new GridBagConstraints();
		gbc_labelEmpresa.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmpresa.gridx = 1;
		gbc_labelEmpresa.gridy = 2;
		add(labelEmpresa, gbc_labelEmpresa);
		
		JLabel labelGenero = new JLabel("Genero: "+genero);
		GridBagConstraints gbc_labelGenero = new GridBagConstraints();
		gbc_labelGenero.insets = new Insets(0, 0, 5, 5);
		gbc_labelGenero.gridx = 1;
		gbc_labelGenero.gridy = 3;
		add(labelGenero, gbc_labelGenero);
		
		JLabel labelTiempoEstimado = new JLabel("Duracion: "+tiempoEstimado);
		GridBagConstraints gbc_labelTiempoEstimado = new GridBagConstraints();
		gbc_labelTiempoEstimado.insets = new Insets(0, 0, 5, 5);
		gbc_labelTiempoEstimado.gridx = 1;
		gbc_labelTiempoEstimado.gridy = 4;
		add(labelTiempoEstimado, gbc_labelTiempoEstimado);
		
		JLabel labelTienda = new JLabel("Tienda: "+tienda);
		GridBagConstraints gbc_labelTienda = new GridBagConstraints();
		gbc_labelTienda.insets = new Insets(0, 0, 5, 5);
		gbc_labelTienda.gridx = 1;
		gbc_labelTienda.gridy = 5;
		add(labelTienda, gbc_labelTienda);
		
		JLabel labelTiendaDescuento = new JLabel("Tienda con descuento: "+ tiendaDescuento);
		GridBagConstraints gbc_labelTiendaDescuento = new GridBagConstraints();
		gbc_labelTiendaDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_labelTiendaDescuento.gridx = 1;
		gbc_labelTiendaDescuento.gridy = 6;
		add(labelTiendaDescuento, gbc_labelTiendaDescuento);
		
		JLabel labelPlataforma = new JLabel("Plataforma: "+plataforma);
		GridBagConstraints gbc_labelPlataforma = new GridBagConstraints();
		gbc_labelPlataforma.insets = new Insets(0, 0, 0, 5);
		gbc_labelPlataforma.gridx = 1;
		gbc_labelPlataforma.gridy = 7;
		add(labelPlataforma, gbc_labelPlataforma);

	}
}