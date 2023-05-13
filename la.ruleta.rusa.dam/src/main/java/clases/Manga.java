package clases;

import enumerations.GeneroManga;

public class Manga extends Obra{
	
	private GeneroManga generoManga;
	private byte numeroTomos;
	
	public Manga(String nombre, GeneroManga generoManga, byte numeroTomos) {
		super(nombre);
		this.generoManga = generoManga;
		this.numeroTomos = numeroTomos;
	}

	public GeneroManga getGeneroManga() {
		return generoManga;
	}

	public void setGeneroManga(GeneroManga generoManga) {
		this.generoManga = generoManga;
	}

	public byte getNumeroTomos() {
		return numeroTomos;
	}

	public void setNumeroTomos(byte numeroTomos) {
		this.numeroTomos = numeroTomos;
	}

	@Override
	public String toString() {
		return super.toString()+"\tGenero: " + generoManga + "\n\tNumero de tomos: " + numeroTomos;
	}
	
	
}
