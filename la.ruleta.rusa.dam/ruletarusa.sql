create database ruletarusadam;

use ruletarusadam;

create table pelicula (
nombre varchar (150),
duracion int,
streaming varchar(150),
director varchar(150),
genero varchar(150),
parte int,
primary key(nombre, director)
);

insert into pelicula values("Guardianes de la galaxia volumen 3","150","DISNEYPLUS", "James Gunn", "ACCION", "3");
insert into pelicula values("El circulo","110","NETFLIX", "James Ponsoldt", "THRILLER", "1");
insert into pelicula values("Los juegos del hambre","123","AMAZONPRIME", "Francis Lawrence", "ACCION", "4");
insert into pelicula values("El sueño de Iván","93","AMAZONPRIME", "Roberto Santiago", "DEPORTE", "1");
insert into pelicula values("Your name","112","CRUNCHYROLL", "Makoto Shinkai", "ROMANCE", "2");

create table anime (
nombre varchar (150) primary key,
duracion int,
streaming varchar(150),
temporada int,
episodios int,
genero varchar(150)
);

insert into anime values("Haikyu","24","ANIMEFLV", "4", "110", "DEPORTE");
insert into anime values("Hajime no ippo","23","CRUNCHYROLL", "3", "126", "DEPORTE");
insert into anime values("One piece","24","CRUNCHYROLL", "9", "1061", "AVENTURA");
insert into anime values("My Hero Academia","22","CRUNCHYROLL", "7", "137", "SHOUNEN");
insert into anime values("Inuyasha","21","ANIMEFLV", "6", "167", "AVENTURA");

create table serie (
nombre varchar (150) primary key,
duracion int,
streaming varchar(150),
temporada int,
episodios int,
genero varchar(150)
);

insert into serie values("Lucifer","50","NETFLIX", "6", "93", "POLICIACA");
insert into serie values("Castle","43","DISNEYPLUS", "8", "173", "POLICIACA");
insert into serie values("Aguila roja","60","AMAZONPRIME", "9", "116", "ACCIONYAVENTURA");
insert into serie values("Suits","42","NETFLIX", "9", "134", "DRAMA");
insert into serie values("Peaky Blinders","65","NETFLIX", "6", "36", "DRAMA");

create table videojuego (
nombre varchar (150) primary key,
empresa varchar (150),
genero varchar(150),
tiempoEstimado int,
tienda varchar(150),
tiendaDescuento varchar(150),
plataforma varchar(150)
);

insert into videojuego values("Ori and the Blind","Moon Studios","PlATAFORMA", "531", "STEAM", "KINGUIN", "Switch");
insert into videojuego values("Don't Starve Together","Klei","ESTRATEGIA", "10054", "STEAM", "GAMIVO", "Pc");
insert into videojuego values("Digimon Cyber Sleuth","NAMCO","RPG", "9000", "STEAM", "KINGUIN", "SteamDeck");
insert into videojuego values("MediEvil","SCE","AVENTURA", "544", "GAME", "G2A", "Ps4");
insert into videojuego values("Monster Hunter World Iceborne","Capcom","AVENTURA", "3000", "STEAM","GAMIVO", "Pc");

create table manga(
nombre varchar (150) primary key,
autor varchar (150),
genero varchar(150),
tomos int,
capitulos int,
enCurso varchar(5)
);

insert into manga values("Monster Hunter Flash","Shin Yamamoto", "FANTASIA", "10", "100", "true");
insert into manga values("Zatch Bell","Makoto Raiku", "COMEDIA", "33", "323", "true");
insert into manga values("Black Clover","Yūki Tabata", "SHOUNEN", "34", "358", "false");
insert into manga values("Jujutsu Kaisen","Gege Akutami", "SHOUNEN", "22", "222", "false");
insert into manga values("Chainsaw Man","Tatsuki Fujimoto", "SHOUNEN", "12", "129", "false");

create table libro (
  nombre varchar(150),
  escritor varchar(150),
  editorial varchar(150),
  genero varchar(150),
  saga int,
  capitulos int,
  pagina int,
  primary key(nombre, escritor)
);

insert into libro values("El árbol de la ciencia", "Pío Baroja", "catedra","NOVELA","2","53","272" );
insert into libro values("El mundo de sofía", "Jostein Gaarder", "Siruela","CULTO","0", "35","638");
insert into libro values("La joven de las naranjas", "Jostein Gaarder","SIRUELA","FICCION", "0","18","192" );
insert into libro values("Los juegos del hambre", "Suzanne Collins", "MOLINO", "SUSPENSE", "4","19","374");
insert into libro values("Harry potter y la piedra filosofal", "J. K. Rowling", "Salamandra", "AVENTURA", "7", "17","309");

create table user(
 email varchar(150) primary key,
 pass varchar(50),
 nick varchar(50)
);

/*drop database if exists ruletarusadam;*/