package clases;

import enumerations.GeneroSerie;
import enumerations.Streaming;

public class Serie extends Direccion implements Comparable<String>{
	
	private GeneroSerie generoSerie;

	public Serie(String nombre, short duracion, Streaming streaming, byte temporadas, byte episodios,
			GeneroSerie generoSerie) {
		super(nombre, duracion, streaming, temporadas, episodios);
		this.generoSerie = generoSerie;
	}

	public GeneroSerie getGeneroSerie() {
		return generoSerie;
	}

	public void setGeneroSerie(GeneroSerie generoSerie) {
		this.generoSerie = generoSerie;
	}

	@Override
	public String toString() {
		return super.toString()+"\tGenero: " + generoSerie;
	}

	@Override
	public int compareTo(String o) {
		return this.getNombre().compareTo(o);
	}
	
	
}
