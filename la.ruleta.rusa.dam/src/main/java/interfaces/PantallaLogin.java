package interfaces;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import clases.Usuario;
import excepciones.ContraseñaInvalidaException;
import excepciones.UsuarioNoExisteException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Button;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.BoxLayout;
import javax.swing.JPasswordField;

public class PantallaLogin extends JPanel {
	private JTextField textLogin;
	private JPasswordField passwordField;
	private Ventana ventana;

	public PantallaLogin(Ventana v) {
		this.ventana = v;
		setBackground(Color.LIGHT_GRAY);
		setForeground(new Color(216, 191, 216));
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel LabelPantallaRegistro = new JLabel("PantallaRegistro");
		LabelPantallaRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPantallaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(LabelPantallaRegistro);
		
		JLabel labelDescripcion = new JLabel("Disfruta de la experiencia, la\"Ruleta Rusa\"");
		labelDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(labelDescripcion);
		
		JLabel LabelEmail = new JLabel("Correo");
		LabelEmail.setBackground(new Color(255, 128, 128));
		LabelEmail.setForeground(Color.MAGENTA);
		LabelEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(LabelEmail);

		textLogin = new JTextField();
		add(textLogin);
		textLogin.setColumns(10);
		
		JLabel LabelPass = new JLabel("Contraseña");
		LabelPass.setBackground(Color.MAGENTA);
		LabelPass.setForeground(Color.MAGENTA);
		LabelPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(LabelPass);

		passwordField = new JPasswordField();
		add(passwordField);

		JButton Registro = new JButton("Registro");
		Registro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRegistro.class);
			}
		});
		
				JButton ButtonAceptar = new JButton("Aceptar");
				ButtonAceptar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String usuario=textLogin.getText();
						String contraseña=new String(passwordField.getPassword());
						System.out.println(usuario+ " : "+contraseña);
						try {
							ventana.usuarioLogado=new Usuario(usuario, contraseña);
							JOptionPane.showMessageDialog(ventana,"Bienvenid@, "
									+ventana.usuarioLogado.getNick(), "Inicio de sesión exitoso",
									JOptionPane.INFORMATION_MESSAGE);
							ventana.cambiarPantalla(PantallaRuletaRusa.class);
						} catch (UsuarioNoExisteException e1) {
							JOptionPane.showMessageDialog(ventana,e1.getMessage(), "Login fallido",
							JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						} catch (SQLException e1) {
							JOptionPane.showMessageDialog(ventana,"El cliente no existe","Login fallido",
									JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						} catch (ContraseñaInvalidaException e1) {
							JOptionPane.showMessageDialog(ventana,"La contraseña no es correcta", "Login fallido",
									JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}
					}
				});
				ButtonAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
				add(ButtonAceptar);
		Registro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(Registro);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
