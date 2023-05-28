package clases;

import enumerations.Streaming;

public class Direccion extends Estudio{
	
	private byte temporadas;
	private short episodios;
	
	public Direccion(String nombre, short duracion, Streaming streaming, byte temporadas, short episodios) {
		super(nombre, duracion, streaming);
		this.temporadas = temporadas;
		this.episodios = episodios;
	}

	public byte getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(byte temporadas) {
		this.temporadas = temporadas;
	}

	public short getEpisodios() {
		return episodios;
	}

	public void setEpisodios(short episodios) {
		this.episodios = episodios;
	}

	@Override
	public String toString() {
		return super.toString()+"\tTemporadas: " + temporadas + "\n\tEpisodios: " + episodios + "\n";
	}
	
	
}
