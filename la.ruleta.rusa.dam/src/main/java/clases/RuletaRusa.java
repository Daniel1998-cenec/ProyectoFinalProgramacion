package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import enumerations.GeneroAnime;
import enumerations.GeneroLibro;
import enumerations.GeneroManga;
import enumerations.GeneroPelicula;
import enumerations.GeneroSerie;
import enumerations.GeneroVideojuego;
import enumerations.Streaming;
import enumerations.TiendaVideojuego;
import enumerations.TiendaVideojuegoDescuento;
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
import utils.DAO;

//En esta clase solo va haber funciones

public class RuletaRusa {

	// Devuelve todo
	public static ArrayList<Obra> devolverTodo() {
		
		
		 TreeSet<Obra> coleccionObras= new TreeSet <Obra>();
		 
			/*try {
				coleccionObras.addAll(devolverLibros());
				coleccionObras.addAll(devolvervideojuego());
				coleccionObras.addAll(devolverManga());
				coleccionObras.addAll(devolverPelicula());
				coleccionObras.addAll(devolverAnime());
				coleccionObras.addAll(devolverSerie());
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			ArrayList<Obra> todo=new ArrayList<Obra>(coleccionObras);
			//for (byte i = 0; i < coleccionObras.size(); i++) {}
		return todo;*/
		return null;
	}

	// Devuelve Obras por separado

	public static ArrayList<Libro> devolverLibros() throws LibroException {

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
			//Si uso el TreeSet me peta
			//TreeSet<Libro> l = new TreeSet<Libro>();
			//Si uso ArrayList no me peta.
			ArrayList<Libro> l2 = new ArrayList<Libro>();
			for (byte i = 0; i < libros.size(); i+=7) {
				
			Libro a=new Libro(libros.get(i) + "",libros.get(i+1)+ "",
					libros.get(i+2) + "", GeneroLibro.valueOf(libros.get(i+3) + ""),
					 Byte.parseByte(libros.get(i+4) + ""),Short.parseShort(libros.get(i+5) + ""),Short.parseShort(libros.get(i+6) + ""));
			
				l2.add(a);
			}
			return l2;
		} catch (SQLException e) {
			throw new LibroException("Error al consultar con los libros");
		}
	}

	public static ArrayList<Videojuego> devolverVideojuego() throws VidejuegoException {
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
			ArrayList<Videojuego> v = new ArrayList<Videojuego>();
			for (byte i = 0; i < videojuegos.size(); i+=7) {
				Videojuego juegos= new Videojuego(videojuegos.get(i)+"",videojuegos.get(i+1)+"",GeneroVideojuego.valueOf(videojuegos.get(i+2)+"") ,Short.parseShort(videojuegos.get(i+3)+""), 
						TiendaVideojuego.valueOf(videojuegos.get(i+4)+""),TiendaVideojuegoDescuento.valueOf(videojuegos.get(i+5)+""), videojuegos.get(i+6)+"");
				
				v.add(juegos);
			}
			return v;
		} catch (SQLException e) {
			throw new VidejuegoException("Error al consultar los videojuegos");
		}
	}

	public static ArrayList<Manga> devolverManga() throws MangaException {
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
			ArrayList<Manga> m = new ArrayList<Manga>();
			for (byte i = 0; i < mangas.size(); i+=6) {
				Manga mn= new Manga(mangas.get(i)+"", mangas.get(i+1)+"", GeneroManga.valueOf(mangas.get(i+2)+""), Byte.parseByte(mangas.get(i+3)+""), 
						Short.parseShort(mangas.get(i+4)+""), mangas.get(i+5)+"");	
				m.add(mn);
			}
			return m;
		} catch (SQLException e) {
			throw new MangaException("Error al consultar los mangas");
		}
	}

	public static ArrayList<Pelicula> devolverPelicula() throws PeliculaException {
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
			ArrayList<Pelicula> p = new ArrayList<Pelicula>();
			for (byte i = 0; i < peliculas.size(); i+=6) {
				Pelicula pl=new Pelicula(peliculas.get(i)+"", Short.parseShort(peliculas.get(i+1)+""), Streaming.valueOf(peliculas.get(i+2)+""),
						peliculas.get(i+3)+"", GeneroPelicula.valueOf(peliculas.get(i+4)+""), Byte.parseByte(peliculas.get(i+5)+""));
				p.add(pl);
			}
			return p;
		} catch (SQLException e) {
			throw new PeliculaException("Error al consultar las peliculas");
		}
		
	}

	public static TreeSet<Anime> devolverAnime() throws AnimeException {
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

	public static TreeSet<Serie> devolverSerie() throws SerieException{
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

	public static ArrayList<Anime> devolverGeneroAnime(GeneroAnime ga) throws GeneroAnimeException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("temporada");
		columnas.add("episodios");
		columnas.add("genero");

		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", ga.toString());

		try {
			ArrayList<Object> animes = DAO.consultar("anime", columnas, restricciones);
			ArrayList<Anime> generoAnime = new ArrayList<Anime>();
			for (byte i = 0; i < animes.size(); i+=6) {
				generoAnime.add((Anime) animes.get(5));
			}
			return generoAnime;

		} catch (SQLException e) {
			throw new GeneroAnimeException("Error al consultar los géneros del anime");
		}
	}
	
	public static TreeSet<Libro> devolverGeneroLibros(GeneroLibro gl) throws GeneroLibroException{
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("escritor");
		columnas.add("editorial");
		columnas.add("genero");
		columnas.add("saga");
		columnas.add("capitulos");
		columnas.add("pagina");
		
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gl.toString());
		
		try {
			ArrayList<Object> libros = DAO.consultar("libro", columnas, restricciones);
			TreeSet<Libro> generoLibros = new TreeSet<Libro>();
			for (byte i = 0; i < libros.size(); i++) {
				generoLibros.add((Libro) libros.get(3));
			}
			return generoLibros;
		} catch (SQLException e) {
			throw new GeneroLibroException("Error al consultar los géneros de los libros");
		}
	}

	public static TreeSet<Videojuego> devolverGenerovideojuego(GeneroVideojuego gv) throws GeneroVideojuegoException{
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("empresa");
		columnas.add("genero");
		columnas.add("tiempoEstimado");
		columnas.add("tienda");
		columnas.add("tiendaDescuento");
		columnas.add("plataforma");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gv.toString());
		
		try {
			ArrayList<Object> videojuegos = DAO.consultar("videojuego", columnas, restricciones);
			TreeSet<Videojuego> generoVideojuego = new TreeSet<Videojuego>();
			for (byte i = 0; i < videojuegos.size(); i++) {
				generoVideojuego.add((Videojuego) videojuegos.get(2));
			}
			return generoVideojuego;
		} catch (SQLException e) {
			throw new GeneroVideojuegoException("Error al consultar los géneros de los videojuegos");
		}
	}

	public static TreeSet<Manga> devolverGeneroManga(GeneroManga gm) throws GeneroMangaException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("autor");
		columnas.add("genero");
		columnas.add("tomos");
		columnas.add("capitulos");
		columnas.add("enCurso");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gm.toString());
		
		try {
			ArrayList<Object> mangas = DAO.consultar("manga", columnas, restricciones);
			TreeSet<Manga> generoManga = new TreeSet<Manga>();
			for (byte i = 0; i < mangas.size(); i++) {
				generoManga.add((Manga) mangas.get(2));
			}
			return generoManga;
		} catch (SQLException e) {
			throw new GeneroMangaException("Error al consultar los géneros de los mangas");
		}
	}

	public static TreeSet<Pelicula> devolverGeneroPelicula(GeneroPelicula gp) throws GeneroPeliculaException {
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("director");
		columnas.add("genero");
		columnas.add("parte");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gp.toString());
		
		try {
			ArrayList<Object> peliculas = DAO.consultar("pelicula", columnas, restricciones);
			TreeSet<Pelicula> generoPelicula = new TreeSet<Pelicula>();
			for (byte i = 0; i < peliculas.size(); i++) {
				generoPelicula.add((Pelicula) peliculas.get(4));
			}
			return generoPelicula;
		} catch (SQLException e) {
			throw new GeneroPeliculaException("Error al consultar los géneros de las peliculas");
		}
	}

	public static ArrayList<Serie> devolverGeneroSerie(GeneroSerie gs) throws GeneroSerieException{
		LinkedHashSet<String> columnas = new LinkedHashSet<String>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("streaming");
		columnas.add("temporada");
		columnas.add("episodios");
		columnas.add("genero");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("genero", gs.toString());
		
		try {
			ArrayList<Object> series = DAO.consultar("serie", columnas, restricciones);
			ArrayList<Serie> generoSerie = new ArrayList<Serie>();
			for (byte i = 0; i < series.size(); i+=7) {
				Serie s=new Serie(series.get(i) + "",Short.parseShort(series.get(i+1)+ ""),
						Streaming.valueOf(series.get(i+2) + ""), Byte.parseByte(series.get(i+3) + ""),
						 Byte.parseByte(series.get(i+4) + ""),GeneroSerie.valueOf(series.get(i+5)+""));
				
				generoSerie.add(s);
			}
			return generoSerie;
			
		} catch (SQLException e) {
			throw new GeneroSerieException("Error al consultar los géneros de las series");
		}
	}
}
