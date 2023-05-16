/*create database ruletarusadam;

use ruletarusadam;

create table pelicula (
nombre varchar (150) primary key,
duracion int,
streaming varchar(150),
director varchar(150),
genero varchar(150),
parte int
);

insert into pelicula values("Guardianes de la galaxia volumen 3","150","DisneyPlus", "James Gunn", "Accion", "3");
insert into pelicula values("El circulo","110","Netflix", "	James Ponsoldt", "Thriller", "1");
insert into pelicula values("Los juegos del hambre","123","AmazonPrime", "Francis Lawrence", "Accion", "4");
insert into pelicula values("El sueño de Iván","93","AmazonPrime", "Roberto Santiago", "Deporte", "1");
insert into pelicula values("Your name","112","Crunchyroll", "Makoto Shinkai", "Romance", "2");

create table anime (
nombre varchar (150) primary key,
duracion int,
streaming varchar(150),
temporada int,
episodios int,
genero varchar(150)
);

insert into anime values("Haikyu","24","AnimeFlv", "4", "110", "Deporte");
insert into anime values("Hajime no ippo","23","Crunchyroll", "3", "126", "Deporte");
insert into anime values("One piece","24","Crunchyroll", "9", "1061", "Aventura");
insert into anime values("My Hero Academia","22","Crunchyroll", "7", "137", "Shounen");
insert into anime values("Inuyasha","21","AnimeFlv", "6", "167", "Aventura");

create table serie (
nombre varchar (150) primary key,
duracion int,
streaming varchar(150),
temporada int,
episodios int,
genero varchar(150)
);

insert into serie values("Lucifer","50","Netflix", "6", "93", "Policiaca");
insert into serie values("Castle","43","DisneyPlus", "8", "173", "Policiaca");
insert into serie values("Aguila roja","60","AmazonPrime", "9", "116", "AccionYAventura");
insert into serie values("Suits","42","Netflix", "9", "134", "Drama");
insert into serie values("Peaky Blinders","65","Netflix", "6", "36", "Drama");*/

create table videojuego (
nombre varchar (150) primary key,
empresa varchar (150),
genero varchar(150),
tiempoEstimado int,
tienda varchar(150),
tiendaDescuento varchar(150)
);

insert into serie values("Ori and the Blind","Moon Studios","Plataforma", "531", "Steam", "Instagaming");
insert into serie values("Lucifer","Klei","Estrategia", "10054", "Steam", "Gamivo");
insert into serie values("digimon cyber sleuth","NAMCO","RPG", "9000", "Steam", "Instagaming");
insert into serie values("MediEvil","NAMCO","RPG", "9000", "Steam", "Instagaming");

/*drop database if exists ruletarusadam;*/