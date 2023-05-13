package clases;

import enumerations.Streaming;

public class Estudio extends Obra {
	
	private short duracion;
	private Streaming streaming;
	
	public Estudio(String nombre, short duracion, Streaming streaming) {
		super(nombre);
		this.duracion = duracion;
		this.streaming = streaming;
	}

	public short getDuracion() {
		return duracion;
	}

	public void setDuracion(short duracion) {
		this.duracion = duracion;
	}

	public Streaming getStreaming() {
		return streaming;
	}

	public void setStreaming(Streaming streaming) {
		this.streaming = streaming;
	}

	@Override
	public String toString() {
		return super.toString()+"\tDuracion: " + duracion + "\n\t¿Donde ver?: " + streaming +"\n";
	}
	
	
}
