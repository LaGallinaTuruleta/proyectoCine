package abril18.proyectoCine.objetos;

public class Butaca {
	private int fila;
	private int asiento;
	private String sitio;
	private boolean ocupado;

	public String getSitio() {
		return sitio;
	}

	public void setSitio(String sitio) {
		this.sitio = sitio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

}
