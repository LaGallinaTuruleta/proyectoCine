package abril18.proyectoCine.control;

import java.util.ArrayList;

import abril18.proyectoCine.guardadoDatos.BBDD;
import abril18.proyectoCine.interfazes.Inicio;
import abril18.proyectoCine.objetos.Pelicula;
import abril18.proyectoCine.objetos.Sala;
import abril18.proyectoCine.objetos.Sesion;
import abril18.proyectoCine.interfazes.Interfas;

public class PpaControl {
	private Interfas interfas;

	public PpaControl() {
		Interfas interfas;
	}

	public static void main(String[] args) {
		BBDD bbdd = new BBDD();
		ArrayList<Sesion> sesiones = new ArrayList<Sesion>();
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Sala> salas = new ArrayList<Sala>();
		PpaControl p = new PpaControl();
		
		
		peliculas.addAll(bbdd.extraerPeliculasDeBBDD());
		sesiones.addAll(bbdd.extraerSesionesDeBBDD());
		salas.addAll(bbdd.extraerSalasBBDD());
		p.interfas = new Interfas(peliculas,sesiones,salas);
		p.interfas.setVisible(true);

		//bbdd.borrarTODOBBDD();

		/*
		 * peliculas.add(new Pelicula("Jacki Chan en accion"));
		 * peliculas.add(new Pelicula(4, "El gran lebowski", "C:xq.png"));
		 * 
		 * salas.add(new Sala(salas.size()+1, 1, 4, 4)); salas.add(new
		 * Sala(salas.size()+1, 1, 1, 4)); salas.add(new Sala(salas.size()+1, 2,
		 * 2, 2)); salas.add(new Sala(salas.size()+1, 3, 3, 3)); salas.add(new
		 * Sala(salas.size()+1, 3, 5, 5));
		 * 
		 * sesiones.add(new Sesion(sesiones.size(), 4, 3, "14:19"));
		 * sesiones.add(new Sesion(sesiones.size(), 4, 1, "23:31"));
		 * sesiones.add(new Sesion(sesiones.size(), 1, 2, "11:31"));
		 * sesiones.add(new Sesion(sesiones.size(), 1, 3, "12:31"));
		 * sesiones.add(new Sesion(sesiones.size(), 1, 4, "13:31"));
		 * sesiones.add(new Sesion(sesiones.size(), 1, 5, "14:31"));
		 * sesiones.add(new Sesion(sesiones.size(), 1, 1, "15:31"));
		 */
		System.out.println("Salas : ");
		for (Sala sala : salas) {
			System.out.println(sala.toString());
			for (int i = 0; i < sala.getButacas().length; i++) {
				System.out.println(sala.getButacas()[i].toString());
			}
		}
		System.out.println("Sesiones : ");
		for (Sesion sesion : sesiones) {
			System.out.println(sesion.toString());
		}
		System.out.println("Peliculas : ");
		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula.toString());
		}

		/*
		 * bbdd.guardarPeliculasEnBBDD(peliculas);
		 * bbdd.guardarSalasEnBBDD(salas); bbdd.guardarSesionesEnBBDD(sesiones);
		 */
		//bbdd.guardarSesionesEnBBDD(sesiones);

		//peliculas.addAll(bbdd.extraerPeliculasDeBBDD());
	}

}
