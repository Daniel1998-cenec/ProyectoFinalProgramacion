package clases;

public class Obra {
	
	private String nombre;

	public Obra(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre +"\n";
	}
	
	
}
