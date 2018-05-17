package abril18.proyectoCine.objetos;

import java.util.Arrays;

public class Sala {
	private int codSala;
	private int tipoSala;
	private Butaca[] butacas;
	private int filas = 2;
	private int numAsientosXFila = 2;

	public Sala() {
		this.codSala = 0;
		this.filas = 0;
		this.numAsientosXFila = 0;
		this.tipoSala = 0;
		this.butacas = null;
	}

	public Sala(int codSala, int tipoSala, int filas, int numAsientosXFila) {
		try {
			this.codSala = codSala;
			this.tipoSala = tipoSala;
			this.filas = filas;
			this.numAsientosXFila = numAsientosXFila;
			this.butacas = new Butaca[filas * numAsientosXFila];

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta en la creación de salas creadas en el programa");
		}
		try {
			int x = 0;
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < numAsientosXFila; j++) {
					butacas[x] = new Butaca(Integer.parseInt(String.valueOf(getCodSala() + String.valueOf(x))), i, j);
					x++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta en la creación de butacas de la sala " + getCodSala());
		}

	}

	public Sala(int codSala, int tipoSala, String butacas, int filas, int numAsientosXFila) {
		try {
			this.codSala = codSala;
			this.tipoSala = tipoSala;
			this.filas = filas;
			this.numAsientosXFila = numAsientosXFila;
			String[] infoButacas = butacas.split("\\|");
			this.butacas = new Butaca[filas * numAsientosXFila];
			int x = 0;
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < numAsientosXFila; j++) {
					String ib[] = infoButacas[x].split(":");
					this.butacas[x] = new Butaca(Integer.parseInt(ib[0]), Integer.parseInt(ib[1]),
							Integer.parseInt(ib[2]), Boolean.valueOf(ib[2]));
					x++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta en la creación de salas de la extracicción de la BBDD");
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

	public Butaca[] getButacas() {
		return butacas;
	}

	public void setButacas(Butaca[] butacas) {
		this.butacas = butacas;
	}

	@Override
	public String toString() {
		return "Sala [codSala=" + codSala + ", tipoSala=" + tipoSala + ", butacas=" + getButacas().toString()
				+ ", filas=" + filas + ", numAsientosXFila=" + numAsientosXFila + "]";
	}

	public int getFilas() {
		return filas;
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
