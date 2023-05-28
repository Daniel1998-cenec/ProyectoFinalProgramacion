package la.ruleta.rusa.dam;

import java.util.ArrayList;
import java.util.TreeSet;

import clases.Anime;
import clases.Libro;
import clases.Manga;
import clases.Obra;
import clases.Pelicula;
import clases.RuletaRusa;
import clases.Serie;
import clases.Videojuego;
import enumerations.GeneroAnime;
import enumerations.GeneroLibro;
import enumerations.GeneroManga;
import enumerations.GeneroPelicula;
import enumerations.GeneroSerie;
import enumerations.GeneroVideojuego;
import excepciones.AnimeException;
import excepciones.GeneroAnimeException;
import excepciones.GeneroLibroException;
import excepciones.GeneroMangaException;
import excepciones.GeneroPeliculaException;
import excepciones.GeneroSerieException;
import excepciones.GeneroVideojuegoException;
import excepciones.LibroException;
import excepciones.MangaException;
import excepciones.PeliculaException;
import excepciones.SerieException;
import excepciones.VidejuegoException;
import interfaces.Ventana;

public class Principal {

	public static void main(String[] args) throws GeneroSerieException {
		Ventana v=new Ventana();
		
		//Pruebas!!!
		/*ArrayList<Obra> todo=new ArrayList<Obra>();
		try {
			todo=RuletaRusa.devolverTodo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*ArrayList<Serie> todo=new ArrayList<Serie>();
		try {
			todo=RuletaRusa.devolverSerie();
		} catch (SerieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println(v);
	}
}
