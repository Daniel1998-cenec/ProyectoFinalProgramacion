package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import enumerations.GeneroAnime;
import enumerations.GeneroLibro;
import enumerations.GeneroManga;
import enumerations.GeneroPelicula;
import enumerations.GeneroSerie;
import enumerations.GeneroVideojuego;
import utils.DAO;

	//En esta clase solo va haber funciones

public class RuletaRusa {
	
	
	// Devuelve todo
	public ArrayList<Obra> devolverTodo() {

		return null;
	}

	// Devuelve Obras por separado

	public TreeSet<Libro> devolverLibros() {
		return null;
	}

	public TreeSet<Videojuego> devolvervideojuego() {
		return null;
	}

	public TreeSet<Manga> devolverManga() {
		return null;
	}

	public TreeSet<Pelicula> devolverPelicula() {
		return null;
	}

	public TreeSet<Anime> devolverAnime() {
		LinkedHashSet<String> columnas=new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("temporada");
		columnas.add("episodios");
		columnas.add("genero");	
		HashMap<String,Object> restricciones=new HashMap<String,Object>();
		try {
			ArrayList<Object> animes=DAO.consultar("anime", columnas, restricciones);
			//Te devuelve el valor de todas las columnas de todos los animes, con esas columnas, construye un 
			//treeset<Anime> y lo devuelves
			return null; //no es null, es el treeset<Anime>
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public TreeSet<Anime> devolverAnime(GeneroAnime ga) {
		LinkedHashSet<String> columnas=new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("temporada");
		columnas.add("episodios");
		columnas.add("genero");	
		HashMap<String,Object> restricciones=new HashMap<String,Object>();
		restricciones.put("genero", ga);
		try {
			ArrayList<Object> animes=DAO.consultar("anime", columnas, restricciones);
			
			//Te devuelve el valor de todas las columnas de todos los animes, con esas columnas, construye un 
			//treeset<Anime> y lo devuelves
			return null; //no es null, es el treeset<Anime>
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public TreeSet<Serie> devolverSerie() {
		return null;
	}

	// Devuelve genero de las Obras

	public TreeSet<GeneroLibro> devolverGeneroLibros() {
		return null;
	}

	public TreeSet<GeneroVideojuego> devolverGenerovideojuego() {
		return null;
	}

	public TreeSet<GeneroManga> devolverGeneroManga() {
		return null;
	}

	public TreeSet<GeneroPelicula> devolverGeneroPelicula() {
		return null;
	}

	public TreeSet<GeneroAnime> devolverGeneroAnime() {
		return null;
	}

	public TreeSet<GeneroSerie> devolverGeneroSerie() {
		return null;
	}
}
