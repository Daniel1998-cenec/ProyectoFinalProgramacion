package interfaces;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaListado extends JPanel {

	private Ventana ventana;
	
	public PantallaListado(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JLabel claveBienvenido = new JLabel("Bienvenido@, "+ventana.usuarioLogado.getNick());
		claveBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		claveBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(claveBienvenido, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton ButtonCancelar = new JButton("Cancelar");
		ButtonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRuletaRusa.class);
			}
		});
		panel.add(ButtonCancelar);
		
		JButton buttonAceptar = new JButton("Aceptar");
		panel.add(buttonAceptar);
		
		JScrollPane lista = new JScrollPane();
		add(lista, BorderLayout.CENTER);
		
		JPanel contenedorElemento = new JPanel();
		lista.setViewportView(contenedorElemento);
		contenedorElemento.setLayout(new BoxLayout(contenedorElemento, BoxLayout.Y_AXIS));
		
		for(byte i=0;i<100;i++) {
			contenedorElemento.add(new ElementoListaUsuario(ventana, ventana.usuarioLogado));
		}
	}
}
