package abril18.proyectoCine.objetos;

public class Pelicula {
	private int cod;
	private String nombre;
	private String rutaFoto;

	public Pelicula() {
		this.cod = 0;
		this.nombre = "";
		this.rutaFoto = "";
	}

	public Pelicula(String nombre) {
		this.cod = 0;
		this.nombre = nombre;
		this.rutaFoto = "";
	}

	public Pelicula(int cod, String nombre) {
		this.cod = cod;
		this.nombre = nombre;
		this.rutaFoto = "";
	}

	public Pelicula(int cod, String nombre, String rutaFoto) {
		this.cod = cod;
		this.nombre = nombre;
		this.rutaFoto = rutaFoto;
	}

	public String getRutaFoto() {
		return rutaFoto;
	}

	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pelicula [cod=" + cod + ", nombre=" + nombre + ", rutaFoto=" + rutaFoto + "]";
	}

}
