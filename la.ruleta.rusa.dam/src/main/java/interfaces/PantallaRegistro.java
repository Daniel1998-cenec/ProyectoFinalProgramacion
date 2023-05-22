package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import clases.Usuario;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;

public class PantallaRegistro extends JPanel {
	
	private Ventana ventana;
	private JTextField textEmail;
	private JTextField textNick;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField textPass;
	
	public PantallaRegistro(Ventana v) {
		setBackground(new Color(192, 192, 192));
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 116, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel registrate = new JLabel("Regístrate");
		registrate.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_registrate = new GridBagConstraints();
		gbc_registrate.insets = new Insets(0, 0, 5, 5);
		gbc_registrate.gridx = 5;
		gbc_registrate.gridy = 0;
		add(registrate, gbc_registrate);
		
		JLabel email_1 = new JLabel("Correo");
		GridBagConstraints gbc_email_1 = new GridBagConstraints();
		gbc_email_1.anchor = GridBagConstraints.EAST;
		gbc_email_1.insets = new Insets(0, 0, 5, 5);
		gbc_email_1.gridx = 3;
		gbc_email_1.gridy = 1;
		add(email_1, gbc_email_1);
		
		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 3;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 4;
		gbc_textEmail.gridy = 1;
		add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);
		
		JLabel nick_1 = new JLabel("Nombre");
		GridBagConstraints gbc_nick_1 = new GridBagConstraints();
		gbc_nick_1.anchor = GridBagConstraints.EAST;
		gbc_nick_1.insets = new Insets(0, 0, 5, 5);
		gbc_nick_1.gridx = 3;
		gbc_nick_1.gridy = 2;
		add(nick_1, gbc_nick_1);
		
		textNick = new JTextField();
		GridBagConstraints gbc_textNick = new GridBagConstraints();
		gbc_textNick.gridwidth = 3;
		gbc_textNick.insets = new Insets(0, 0, 5, 5);
		gbc_textNick.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNick.gridx = 4;
		gbc_textNick.gridy = 2;
		add(textNick, gbc_textNick);
		textNick.setColumns(10);
		
		JLabel pass_1 = new JLabel("Contraseña");
		GridBagConstraints gbc_pass_1 = new GridBagConstraints();
		gbc_pass_1.anchor = GridBagConstraints.EAST;
		gbc_pass_1.insets = new Insets(0, 0, 5, 5);
		gbc_pass_1.gridx = 3;
		gbc_pass_1.gridy = 3;
		add(pass_1, gbc_pass_1);
		
		textPass = new JPasswordField();
		GridBagConstraints gbc_textPass = new GridBagConstraints();
		gbc_textPass.gridwidth = 3;
		gbc_textPass.insets = new Insets(0, 0, 5, 5);
		gbc_textPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPass.gridx = 4;
		gbc_textPass.gridy = 3;
		add(textPass, gbc_textPass);
		
		JButton botonCancelar = new JButton("Cancelar");
		botonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaLogin.class);
			}
		});
		
		JLabel genero = new JLabel("Genero");
		GridBagConstraints gbc_genero = new GridBagConstraints();
		gbc_genero.insets = new Insets(0, 0, 5, 5);
		gbc_genero.gridx = 5;
		gbc_genero.gridy = 7;
		add(genero, gbc_genero);
		
		JRadioButton radioHombre = new JRadioButton("Hombre");
		buttonGroup.add(radioHombre);
		GridBagConstraints gbc_radioHombre = new GridBagConstraints();
		gbc_radioHombre.insets = new Insets(0, 0, 5, 5);
		gbc_radioHombre.gridx = 4;
		gbc_radioHombre.gridy = 8;
		add(radioHombre, gbc_radioHombre);
		
		JRadioButton radioMujer = new JRadioButton("Mujer");
		buttonGroup.add(radioMujer);
		GridBagConstraints gbc_radioMujer = new GridBagConstraints();
		gbc_radioMujer.insets = new Insets(0, 0, 5, 5);
		gbc_radioMujer.gridx = 5;
		gbc_radioMujer.gridy = 8;
		add(radioMujer, gbc_radioMujer);
		
		JRadioButton radioOtro = new JRadioButton("Otro");
		buttonGroup.add(radioOtro);
		GridBagConstraints gbc_radioOtro = new GridBagConstraints();
		gbc_radioOtro.insets = new Insets(0, 0, 5, 5);
		gbc_radioOtro.gridx = 6;
		gbc_radioOtro.gridy = 8;
		add(radioOtro, gbc_radioOtro);
		GridBagConstraints gbc_botonCancelar = new GridBagConstraints();
		gbc_botonCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_botonCancelar.gridx = 2;
		gbc_botonCancelar.gridy = 9;
		add(botonCancelar, gbc_botonCancelar);
		
		JButton botonRegistrarse = new JButton("Registrar");
		botonRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					String email=textEmail.getText().toString();
					String pass=new String(textPass.getPassword());
					String nick=textNick.getText();
					
					new Usuario(email, nick, pass);
					JOptionPane.showMessageDialog(ventana, "Registrado correctamente", "Éxito",JOptionPane.INFORMATION_MESSAGE);
				ventana.cambiarPantalla(PantallaLogin.class);
				} catch (SQLIntegrityConstraintViolationException e2) {
					JOptionPane.showMessageDialog(ventana,"El email ya existe", "No se pudo registrar", JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "No se puede conectar a la BD", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_botonRegistrarse = new GridBagConstraints();
		gbc_botonRegistrarse.insets = new Insets(0, 0, 0, 5);
		gbc_botonRegistrarse.gridx = 5;
		gbc_botonRegistrarse.gridy = 9;
		add(botonRegistrarse, gbc_botonRegistrarse);
		
		JButton botonLimpiarDatos = new JButton("Limpiar datos");
		botonLimpiarDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textEmail.setText("");
				textNick.setText("");
				textPass.setText("");
				buttonGroup.clearSelection();
			}
		});
		GridBagConstraints gbc_botonLimpiarDatos = new GridBagConstraints();
		gbc_botonLimpiarDatos.gridx = 7;
		gbc_botonLimpiarDatos.gridy = 9;
		add(botonLimpiarDatos, gbc_botonLimpiarDatos);
	}
}
