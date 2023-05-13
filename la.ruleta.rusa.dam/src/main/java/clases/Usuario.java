package clases;

import java.time.LocalDate;
import java.util.TreeSet;

public class Usuario {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private String correo;
	private String contraseña;
	private TreeSet<ObraVista> obraVistas= new TreeSet<ObraVista>();
	
	public Usuario(String nombre, LocalDate fechaNacimiento, String correo, String contraseña,
			TreeSet<ObraVista> obraVistas) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.contraseña = contraseña;
		this.obraVistas = obraVistas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public TreeSet<ObraVista> getObraVistas() {
		return obraVistas;
	}

	public void setObraVistas(TreeSet<ObraVista> obraVistas) {
		this.obraVistas = obraVistas;
	}

	@Override
	public String toString() {
		return "\tNombre: " + nombre + "\n\tFechaNacimiento: " + fechaNacimiento + "\n\tCorreo: " + correo
				+ "\n\tContraseña: " + contraseña + "\n\tobra Vistas: " + obraVistas;
	}
	
	
	
}
