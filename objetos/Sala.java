package abril18.proyectoCine.objetos;

import java.util.Arrays;

public class Sala {
	private int codSala;
	private int tipoSala;
	private int filas;
	private int numAsientosXFila;

	public Sala() {
		this.codSala = 0;
		this.filas = 0;
		this.numAsientosXFila = 0;
		this.tipoSala = 0;

	}

	public Sala(int codSala, int tipoSala, int filas, int numAsientosXFila) {
		try {
			this.codSala = codSala;
			this.tipoSala = tipoSala;
			this.filas = filas;
			this.numAsientosXFila = numAsientosXFila;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta en la creación de salas creadas en el programa");
		}

	}

	public int getCodSala() {
		return codSala;
	}

	public void setCodSala(int codSala) {
		this.codSala = codSala;
	}

	public int getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(int tipoSala) {
		this.tipoSala = tipoSala;
	}

	public int getFilas() {
		return filas;
	}

	@Override
	public String toString() {
		return "Sala [codSala=" + codSala + ", tipoSala=" + tipoSala + ", filas=" + filas + ", numAsientosXFila="
				+ numAsientosXFila + "]";
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getNumAsientosXFila() {
		return numAsientosXFila;
	}

	public void setNumAsientosXFila(int numAsientosXFila) {
		this.numAsientosXFila = numAsientosXFila;
	}

}
