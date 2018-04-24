package abril18.proyectoCine.objetos;

public class Sesion {
	private int cod;
	private Pelicula p;
	private Butaca[] butacas;
	private String hora;

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Pelicula getP() {
		return p;
	}

	public void setP(Pelicula p) {
		this.p = p;
	}

	public Butaca[] getButacas() {
		return butacas;
	}
	public String getButacasBBDD() {
		String butacasBBDD="";
		
		return butacasBBDD;
	}


	public void setButacas(Butaca[] butacas) {
		this.butacas = butacas;
	}

}
