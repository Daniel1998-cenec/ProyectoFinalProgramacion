package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Obra;
import clases.Pelicula;
import clases.RuletaRusa;
import enumerations.GeneroPelicula;
import excepciones.GeneroPeliculaException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaDevolverTodo extends JPanel {
	
	private Ventana ventana;
	
	public PantallaDevolverTodo(Ventana v){
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
		
		JLabel LabelIntroducción2 = new JLabel("Dale al botón enseñar todo, y verás la magia.");
		LabelIntroducción2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_LabelIntroducción2 = new GridBagConstraints();
		gbc_LabelIntroducción2.gridwidth = 5;
		gbc_LabelIntroducción2.insets = new Insets(0, 0, 5, 0);
		gbc_LabelIntroducción2.gridx = 0;
		gbc_LabelIntroducción2.gridy = 1;
		add(LabelIntroducción2, gbc_LabelIntroducción2);
		
		JLabel labelText = new JLabel("");
		labelText.addMouseListener(new MouseAdapter() {
			
		});
		
		JButton buttonOmitir = new JButton("Omitir");
		buttonOmitir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaPreguntas.class);
			}
		});
		
		JButton buttonEnseñarTodo = new JButton("Enseñar todo");
		buttonEnseñarTodo.setBackground(SystemColor.activeCaption);
		buttonEnseñarTodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Obra> todo=new ArrayList<Obra>();
				String aux="<html>";
				try {
					todo=RuletaRusa.devolverTodo();
					for(byte i=0;i<todo.size();i++) {
						aux+="<p>"+todo.get(i)+"</p>";
					}
					aux+="</html>";
					labelText.setText(aux);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_buttonEnseñarTodo = new GridBagConstraints();
		gbc_buttonEnseñarTodo.insets = new Insets(0, 0, 5, 5);
		gbc_buttonEnseñarTodo.gridx = 1;
		gbc_buttonEnseñarTodo.gridy = 2;
		add(buttonEnseñarTodo, gbc_buttonEnseñarTodo);
		buttonOmitir.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonOmitir = new GridBagConstraints();
		gbc_buttonOmitir.insets = new Insets(0, 0, 5, 5);
		gbc_buttonOmitir.gridx = 3;
		gbc_buttonOmitir.gridy = 2;
		add(buttonOmitir, gbc_buttonOmitir);
		labelText.setForeground(SystemColor.textHighlight);
		labelText.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_labelText = new GridBagConstraints();
		gbc_labelText.gridheight = 4;
		gbc_labelText.gridwidth = 5;
		gbc_labelText.insets = new Insets(0, 0, 5, 0);
		gbc_labelText.gridx = 0;
		gbc_labelText.gridy = 3;
		add(labelText, gbc_labelText);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRuletaRusa.class);
			}
		});
		buttonCancelar.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_buttonCancelar = new GridBagConstraints();
		gbc_buttonCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_buttonCancelar.gridx = 2;
		gbc_buttonCancelar.gridy = 7;
		add(buttonCancelar, gbc_buttonCancelar);
	}
}