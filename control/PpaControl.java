package abril18.proyectoCine.control;

import java.util.ArrayList;
import abril18.proyectoCine.interfazes.Inicio;
import abril18.proyectoCine.objetos.Pelicula;
import abril18.proyectoCine.objetos.Sesion;

public class PpaControl {
	private Inicio i;
	private ArrayList<Sesion> sesiones;
	private ArrayList<Pelicula> peliculas;

	public PpaControl() {
		i = new Inicio();
		i.setVisible(true);
	}

	public static void main(String[] args) {
		PpaControl p = new PpaControl();
	}

	public Inicio getI() {
		return i;
	}

	public void setI(Inicio i) {
		this.i = i;
	}

	public ArrayList<Sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(ArrayList<Sesion> sesiones) {
		this.sesiones = sesiones;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

}
