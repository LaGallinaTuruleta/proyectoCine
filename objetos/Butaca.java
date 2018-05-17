package abril18.proyectoCine.objetos;

public class Butaca {
	//El codigo de butacas no encuentro la manera de hacer un cod unico perfecto para todas las butacas
	private int codB;
	private int fila;
	private int asiento;
	private boolean ocupado;

	public Butaca() {
		this.codB = 0;
		this.fila = 0;
		this.asiento = 0;
		this.ocupado = false;
	}

	public Butaca(int codB, int fila, int asiento) {
		this.codB = codB;
		this.fila = fila;
		this.asiento = asiento;
		this.ocupado = false;
	}

	public Butaca(int codB, int fila, int asiento, boolean ocupado) {
		this.codB = 0;
		this.fila = fila;
		this.asiento = asiento;
		this.ocupado = ocupado;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public String getInfoBBDD() {
		String resultado = getFila() + ":" + getAsiento() + ":" + isOcupado();

		return resultado;
	}

	public int getCodB() {
		return codB;
	}

	public void setCodB(int codB) {
		this.codB = codB;
	}

	@Override
	public String toString() {
		return "Butaca [codB=" + codB + ", fila=" + fila + ", asiento=" + asiento + ", ocupado=" + ocupado + "]";
	}

}
