package abril18.proyectoCine.objetos;

public class Pelicula {
	private int codP;
	private String nombre;
	private String rutaFoto;

	public Pelicula() {
		this.codP = 0;
		this.nombre = "";
		this.rutaFoto = "";
	}

	public Pelicula(String nombre) {
		this.codP = 0;
		this.nombre = nombre;
		this.rutaFoto = "";
	}

	public Pelicula(int cod, String nombre) {
		this.codP = cod;
		this.nombre = nombre;
		this.rutaFoto = "";
	}

	public Pelicula(int cod, String nombre, String rutaFoto) {
		this.codP = cod;
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
		return codP;
	}

	public void setCod(int cod) {
		this.codP = cod;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pelicula [cod=" + codP + ", nombre=" + nombre + ", rutaFoto=" + rutaFoto + "]";
	}

	public int compareTo(Pelicula p) {
		int resultado = -1;
		if ((Integer.toString(this.getCod()).equals(Integer.toString(p.getCod()))) && this.getNombre().equals(p.getNombre())
				&& this.getRutaFoto().equals(p.getRutaFoto())) {
			resultado = 0;
		}
		return resultado;
	}

}
