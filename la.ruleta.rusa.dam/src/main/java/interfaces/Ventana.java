package interfaces;

import javax.swing.JFrame;

import clases.Usuario;

public class Ventana extends JFrame {

	protected Usuario usuarioLogado;
	
	public Ventana() {
		this.setSize(600,500);
		this.setTitle("Proyecto Final Ruleta Rusa");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaLogin(this));
		this.setVisible(true);
	}
	
	public void cambiarPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if(clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if (clase.equals(PantallaRuletaRusa.class)) {
			this.setContentPane(new PantallaPreguntas(this));
		}
		if (clase.equals(PantallaListado.class)) {
			this.setContentPane(new PantallaListado(this));
		}
		if (clase.equals(PantallaPreguntas.class)) {
			this.setContentPane(new PantallaRuletaRusa(this));
		}
		if (clase.equals(PantallaAnime.class)) {
			this.setContentPane(new PantallaAnime(this));
		}
		this.getContentPane().setVisible(true);
	}
	
}
