package la.ruleta.rusa.dam;

import java.util.ArrayList;
import java.util.TreeSet;

import clases.Libro;
import clases.Manga;
import clases.Obra;
import clases.Pelicula;
import clases.RuletaRusa;
import clases.Serie;
import clases.Videojuego;
import enumerations.GeneroSerie;
import excepciones.GeneroSerieException;
import excepciones.LibroException;
import excepciones.MangaException;
import excepciones.PeliculaException;
import excepciones.SerieException;
import excepciones.VidejuegoException;
import interfaces.Ventana;

public class Principal {

	public static void main(String[] args) {
		/*Ventana v=new Ventana();*/
		
		
		/*ArrayList<Libro> todo=new ArrayList<Libro>();
		try {
			todo=RuletaRusa.devolverLibros();
		} catch (LibroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		ArrayList<Pelicula> todo=new ArrayList<Pelicula>();
		try {
			todo=RuletaRusa.devolverPelicula();
		} catch (PeliculaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(todo);
	}
}
