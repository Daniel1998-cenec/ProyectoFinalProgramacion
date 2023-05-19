package clases;

import enumerations.GeneroLibro;

public class Libro extends Obra implements Comparable<String>{
	
	private GeneroLibro genero;
	private byte numeroSaga;
	private String escritor;
	private String editorial;
	private short capitulo;
	private short paginas;
	
	public Libro(String nombre, GeneroLibro genero, byte numeroSaga, String escritor, short capitulo, short paginas,String editorial) {
		super(nombre);
		this.genero = genero;
		this.numeroSaga = numeroSaga;
		this.escritor = escritor;
		this.capitulo = capitulo;
		this.paginas = paginas;
		this.editorial=editorial;
	}

	public GeneroLibro getGenero() {
		return genero;
	}

	public void setGenero(GeneroLibro genero) {
		this.genero = genero;
	}

	public byte getnumeroSaga() {
		return numeroSaga;
	}

	public void setSaga(byte numeroSaga) {
		this.numeroSaga = numeroSaga;
	}

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public short getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(short capitulo) {
		this.capitulo = capitulo;
	}

	public short getPaginas() {
		return paginas;
	}

	public void setPaginas(short paginas) {
		this.paginas = paginas;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial){
		this.editorial = editorial;	
	}

	@Override
	public String toString() {
		return super.toString()+"\n\tEscritor: " + escritor+"\n\tEditorial: "+editorial+"\tGenero: " + genero +"\n\tNumero de saga: " + numeroSaga  + "\n\tCapitulo: " + capitulo
				+ "\n\tPaginas totales:" + paginas;
	}
	
	@Override
	public int compareTo(String o) {
		return this.getNombre().compareTo(o);
	}
}
