package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

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
import excepciones.GeneroVideojuegoException;
import excepciones.LibroException;
import excepciones.MangaException;
import excepciones.PeliculaException;
import excepciones.SerieException;
import excepciones.VidejuegoException;
import utils.DAO;

//En esta clase solo va haber funciones

public class RuletaRusa {

	// Devuelve todo
	public ArrayList<Obra> devolverTodo() {
		
		return null;
	}

	// Devuelve Obras por separado

	public TreeSet<Libro> devolverLibros() throws LibroException {

		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("escritor");
		columnas.add("editorial");
		columnas.add("genero");
		columnas.add("saga");
		columnas.add("capitulos");
		columnas.add("pagina");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();

		try {
			ArrayList<Object> libros = DAO.consultar("libro", columnas, restricciones);
			TreeSet<Libro> l = new TreeSet<Libro>();
			for (byte i = 0; i < libros.size(); i++) {
				l.add((Libro) libros.get(i));
			}
			return l;
		} catch (SQLException e) {
			throw new LibroException("Error al consultar con los libros");
		}
	}

	public TreeSet<Videojuego> devolvervideojuego() throws VidejuegoException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("empresa");
		columnas.add("genero");
		columnas.add("tiempoEstimado");
		columnas.add("tienda");
		columnas.add("tiendaDescuento");
		columnas.add("plataforma");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();

		try {
			ArrayList<Object> videojuegos = DAO.consultar("videojuego", columnas, restricciones);
			TreeSet<Videojuego> v = new TreeSet<Videojuego>();
			for (byte i = 0; i < videojuegos.size(); i++) {
				v.add((Videojuego) videojuegos.get(i));
			}
			return v;
		} catch (SQLException e) {
			throw new VidejuegoException("Error al consultar los videojuegos");
		}
	}

	public TreeSet<Manga> devolverManga() throws MangaException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("autor");
		columnas.add("genero");
		columnas.add("tomos");
		columnas.add("capitulos");
		columnas.add("enCurso");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();

		try {
			ArrayList<Object> mangas = DAO.consultar("manga", columnas, restricciones);
			TreeSet<Manga> m = new TreeSet<Manga>();
			for (byte i = 0; i < mangas.size(); i++) {
				m.add((Manga) mangas.get(i));
			}
			return m;
		} catch (SQLException e) {
			throw new MangaException("Error al consultar los mangas");
		}
	}

	public TreeSet<Pelicula> devolverPelicula() throws PeliculaException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("director");
		columnas.add("genero");
		columnas.add("parte");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		try {
			ArrayList<Object> peliculas = DAO.consultar("pelicula", columnas, restricciones);
			TreeSet<Pelicula> p = new TreeSet<Pelicula>();
			for (byte i = 0; i < peliculas.size(); i++) {
				p.add((Pelicula) peliculas.get(i));
			}
			return p;
		} catch (SQLException e) {
			throw new PeliculaException("Error al consultar las peliculas");
		}
		
	}

	public TreeSet<Anime> devolverAnime() throws AnimeException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("temporada");
		columnas.add("episodios");
		columnas.add("genero");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();

		try {
			ArrayList<Object> animes = DAO.consultar("anime", columnas, restricciones);
			TreeSet<Anime> a = new TreeSet<Anime>();
			for (byte i = 0; i < animes.size(); i++) {
				a.add((Anime) animes.get(i));
			}
			return a;
		} catch (SQLException e) {
			throw new AnimeException("Error al consultar los animes");
		}
	}

	public TreeSet<Serie> devolverSerie() throws SerieException{
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("temporada");
		columnas.add("episodios");
		columnas.add("genero");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		
		try {
			ArrayList<Object> series = DAO.consultar("serie", columnas, restricciones);
			TreeSet<Serie> s = new TreeSet<Serie>();
			for (byte i = 0; i < series.size(); i++) {
				s.add((Serie) series.get(i));
			}
			return s;
		} catch (SQLException e) {
			throw new SerieException("Error al consultar las series");
		}
	}

	// Devuelve genero de las Obras

	public TreeSet<Anime> devolverGeneroAnime(GeneroAnime ga) throws GeneroAnimeException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("temporada");
		columnas.add("episodios");
		columnas.add("genero");

		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", ga);

		try {
			ArrayList<Object> animes = DAO.consultar("anime", columnas, restricciones);
			TreeSet<Anime> generoAnime = new TreeSet<Anime>();
			for (byte i = 0; i < animes.size(); i++) {
				generoAnime.add((Anime) animes.get(5));
			}
			return generoAnime;

		} catch (SQLException e) {
			throw new GeneroAnimeException("Error al consultar los géneros del anime");
		}
	}
	
	public TreeSet<Libro> devolverGeneroLibros(GeneroLibro gl) throws GeneroLibroException{
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("escritor");
		columnas.add("editorial");
		columnas.add("genero");
		columnas.add("saga");
		columnas.add("capitulos");
		columnas.add("pagina");
		
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gl);
		
		try {
			ArrayList<Object> libros = DAO.consultar("anime", columnas, restricciones);
			TreeSet<Libro> generoLibros = new TreeSet<Libro>();
			for (byte i = 0; i < libros.size(); i++) {
				generoLibros.add((Libro) libros.get(3));
			}
			return generoLibros;
		} catch (SQLException e) {
			throw new GeneroLibroException("Error al consultar los géneros de los libros");
		}
	}

	public TreeSet<Videojuego> devolverGenerovideojuego(GeneroVideojuego gv) throws GeneroVideojuegoException{
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("empresa");
		columnas.add("genero");
		columnas.add("tiempoEstimado");
		columnas.add("tienda");
		columnas.add("tiendaDescuento");
		columnas.add("plataforma");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gv);
		
		try {
			ArrayList<Object> videojuegos = DAO.consultar("Videojuego", columnas, restricciones);
			TreeSet<Videojuego> generoVideojuego = new TreeSet<Videojuego>();
			for (byte i = 0; i < videojuegos.size(); i++) {
				generoVideojuego.add((Videojuego) videojuegos.get(2));
			}
			return generoVideojuego;
		} catch (SQLException e) {
			throw new GeneroVideojuegoException("Error al consultar los géneros de los videojuegos");
		}
	}

	public TreeSet<Manga> devolverGeneroManga(GeneroManga gm) throws GeneroMangaException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("autor");
		columnas.add("genero");
		columnas.add("tomos");
		columnas.add("capitulos");
		columnas.add("enCurso");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gm);
		
		try {
			ArrayList<Object> mangas = DAO.consultar("Manga", columnas, restricciones);
			TreeSet<Manga> generoManga = new TreeSet<Manga>();
			for (byte i = 0; i < mangas.size(); i++) {
				generoManga.add((Manga) mangas.get(2));
			}
			return generoManga;
		} catch (SQLException e) {
			throw new GeneroMangaException("Error al consultar los géneros de los mangas");
		}
	}

	public TreeSet<Pelicula> devolverGeneroPelicula() {
		return null;
	}

	public TreeSet<Anime> devolverGeneroAnime() {
		return null;
	}

	public TreeSet<Serie> devolverGeneroSerie() {
		return null;
	}
}
