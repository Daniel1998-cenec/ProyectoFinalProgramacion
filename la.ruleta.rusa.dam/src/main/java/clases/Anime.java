package clases;

import enumerations.GeneroAnime;
import enumerations.Streaming;

public class Anime extends Direccion implements Comparable<String>{
	
	private GeneroAnime generoAnime;

	public Anime(String nombre, short duracion, Streaming streaming, byte temporadas, byte episodios,
			GeneroAnime genero) {
		super(nombre, duracion, streaming, temporadas, episodios);
		this.generoAnime = genero;
	}

	public GeneroAnime getGenero() {
		return generoAnime;
	}

	public void setGenero(GeneroAnime genero) {
		this.generoAnime = genero;
	}

	@Override
	public String toString() {
		return super.toString()+"\tGenero: " + generoAnime;
	}

	@Override
	public int compareTo(String o) {
		return this.getNombre().compareTo(o);
	}
	
	
}
