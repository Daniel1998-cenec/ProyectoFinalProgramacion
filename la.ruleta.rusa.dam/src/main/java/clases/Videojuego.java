package clases;

import enumerations.GeneroVideojuego;
import enumerations.TiendaVideojuego;
import enumerations.TiendaVideojuegoDescuento;

public class Videojuego extends Obra{
	
	private String empresa;
	private GeneroVideojuego generoVidejuego;
	private short tiempoEstimado;
	private TiendaVideojuego tienda;
	private TiendaVideojuegoDescuento tiendaDescuento;
	private String plataforma;
	
	public Videojuego(String nombre, String empresa, GeneroVideojuego generoVidejuego, short tiempoEstimado,
			TiendaVideojuego tienda, TiendaVideojuegoDescuento tiendaDescuento, String plataforma ) {
		super(nombre);
		this.empresa = empresa;
		this.generoVidejuego = generoVidejuego;
		this.tiempoEstimado = tiempoEstimado;
		this.tienda = tienda;
		this.tiendaDescuento = tiendaDescuento;
		this.plataforma=plataforma;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public GeneroVideojuego getGeneroVidejuego() {
		return generoVidejuego;
	}

	public void setGeneroVidejuego(GeneroVideojuego generoVidejuego) {
		this.generoVidejuego = generoVidejuego;
	}

	public short getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(short tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public TiendaVideojuego getTienda() {
		return tienda;
	}

	public void setTienda(TiendaVideojuego tienda) {
		this.tienda = tienda;
	}

	public TiendaVideojuegoDescuento getTiendaDescuento() {
		return tiendaDescuento;
	}

	public void setTiendaDescuento(TiendaVideojuegoDescuento tiendaDescuento) {
		this.tiendaDescuento = tiendaDescuento;
	}
	
	public String getplataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\tEmpresa: " + empresa + "\n\tGenero: " + generoVidejuego + "\n\tDuracion: "
				+ tiempoEstimado + "\n\tTienda: " + tienda + "\n\tTienda con descuento: " + tiendaDescuento+
				"\n\tPlataforma: "+ plataforma;
	}
	
	
}
