package abril18.proyectoCine.objetos;

import java.util.Arrays;

public class Sala {
	private int codSala;
	private String tipoSala;
	private int filas;
	private int asientosXFila;

	public Sala() {
		this.codSala = 0;
		this.filas = 0;
		this.asientosXFila = 0;
		this.tipoSala = "";

	}

	public Sala(int codSala, String tipoSala, int filas, int numAsientosXFila) {
		try {
			this.codSala = codSala;
			this.tipoSala = tipoSala;
			this.filas = filas;
			this.asientosXFila = numAsientosXFila;

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

	public String getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	public int getFilas() {
		return filas;
	}

	@Override
	public String toString() {
		return "Sala [codSala=" + codSala + ", tipoSala=" + tipoSala + ", filas=" + filas + ", numAsientosXFila="
				+ asientosXFila + "]";
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getNumAsientosXFila() {
		return asientosXFila;
	}

	public void setNumAsientosXFila(int numAsientosXFila) {
		this.asientosXFila = numAsientosXFila;
	}

}
