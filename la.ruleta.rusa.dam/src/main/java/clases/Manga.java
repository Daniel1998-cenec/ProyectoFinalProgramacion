package clases;

import enumerations.GeneroManga;

public class Manga extends Obra implements Comparable<String>{
	
	private GeneroManga generoManga;
	private byte numeroTomos;
	private String autor;
	private short capitulos;
	private boolean enCurso;
	
	public Manga(String nombre, String autor, GeneroManga generoManga, byte numeroTomos, short capitulos, boolean enCurso) {
		super(nombre);
		this.generoManga = generoManga;
		this.numeroTomos = numeroTomos;
		this.autor=autor;
		this.capitulos=capitulos;
		this.enCurso=enCurso;
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
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public short getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(short capitulos) {
		this.capitulos = capitulos;
	}
	
	public boolean isEnCurso() {
		return enCurso;
	}

	public void setEnCurso(boolean enCurso) {
		this.enCurso = enCurso;
	}

	@Override
	public String toString() {
		return super.toString()+"\n\tAutor: "+autor+"\tGenero: " + generoManga + "\n\tNumero de tomos: " + numeroTomos+
				"\n\tCapitulos: "+capitulos+"\n\tEn curso: "+enCurso;
	}

	@Override
	public int compareTo(String o) {
		return this.getNombre().compareTo(o);
	}
	
	
}
