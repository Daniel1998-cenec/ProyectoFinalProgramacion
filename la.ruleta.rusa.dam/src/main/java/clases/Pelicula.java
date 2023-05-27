package clases;

import enumerations.GeneroPelicula;
import enumerations.Streaming;

public class Pelicula extends Estudio implements Comparable<String>{
	
	private String director;
	private GeneroPelicula generoPelicula;
	private byte parte;
	
	public Pelicula(String nombre, short duracion, Streaming streaming, String director, GeneroPelicula generoPelicula,
			byte parte) {
		super(nombre, duracion, streaming);
		this.director = director;
		this.generoPelicula = generoPelicula;
		this.parte = parte;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public GeneroPelicula getGeneroPelicula() {
		return generoPelicula;
	}

	public void setGeneroPelicula(GeneroPelicula generoPelicula) {
		this.generoPelicula = generoPelicula;
	}

	public byte getParte() {
		return parte;
	}

	public void setParte(byte parte) {
		this.parte = parte;
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+"\tDirector: " + director + "\n\tGenero: " + generoPelicula + "\n\tParte: " + parte + "\n";
	}

	@Override
	public int compareTo(String o) {
		return this.getNombre().compareTo(o);
	}
	
	
}

