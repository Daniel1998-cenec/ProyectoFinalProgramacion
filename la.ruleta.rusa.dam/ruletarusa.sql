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
insert into serie values("Peaky Blinders","65","Netflix", "6", "36", "Drama");

create table videojuego (
nombre varchar (150) primary key,
empresa varchar (150),
genero varchar(150),
tiempoEstimado int,
tienda varchar(150),
tiendaDescuento varchar(150),
plataforma varchar(150)
);

insert into videojuego values("Ori and the Blind","Moon Studios","Plataforma", "531", "Steam", "Instagaming", "Switch");
insert into videojuego values("Don't Starve Together","Klei","Estrategia", "10054", "Steam", "Gamivo", "Pc");
insert into videojuego values("Digimon Cyber Sleuth","NAMCO","RPG", "9000", "Steam", "Instagaming", "SteamDeck");
insert into videojuego values("MediEvil","SCE","Aventura", "544", "Game", "G2A", "Ps4");
insert into videojuego values("Monster Hunter World Iceborne","Capcom","Aventura", "3000", "Steam","Gamivo", "Pc");

create table manga(
nombre varchar (150) primary key,
autor varchar (150),
genero varchar(150),
tomos int,
capitulos int,
enCurso varchar(5)
);

insert into manga values("Monster Hunter Flash","Shin Yamamoto", "Fantasia", "10", "100", "true");
insert into manga values("Zatch Bell","Makoto Raiku", "Comedia", "33", "323", "true");
insert into manga values("Black Clover","Yūki Tabata", "Shounen", "34", "358", "false");
insert into manga values("Jujutsu Kaisen","Gege Akutami", "Shounen", "22", "222", "false");
insert into manga values("Chainsaw Man","Tatsuki Fujimoto", "Shounen", "12", "129", "false");*/

create table libro(
nombre varchar (150) primary key,
saga int,
escritor varchar(150),
capitulos int,
pagina int
);

/*drop database if exists ruletarusadam;*/