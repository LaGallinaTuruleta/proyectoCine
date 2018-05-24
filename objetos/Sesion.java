package abril18.proyectoCine.objetos;

public class Sesion {
	private int codSes;
	private int codPel;
	private int codSala;
	private String hora;
	private Butaca[] butacas;

	public Sesion() {
		this.codSes = 0;
		this.codPel = 0;
		this.codSala = 0;
		this.hora = "";
		this.butacas = null;
	}

	public Sesion(int codSes, int codPel, Sala s, String hora) {
		this.codSes = codSes;
		this.codPel = codPel;
		this.codSala = s.getCodSala();
		this.hora = hora;
		this.butacas = new Butaca[s.getFilas() * s.getNumAsientosXFila()];

		try {
			int x = 0;
			for (int i = 0; i < s.getFilas(); i++) {
				for (int j = 0; j < s.getNumAsientosXFila(); j++) {
					butacas[x] = new Butaca(Integer.parseInt(String.valueOf(getCodSala() + String.valueOf(x))), i, j);
					x++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta en la creación de butacas de la sala " + getCodSala());
		}
	}

	public Butaca[] getButacas() {
		return butacas;
	}

	public void setButacas(Butaca[] butacas) {
		this.butacas = butacas;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getCodSes() {
		return codSes;
	}

	public void setCodSes(int codSes) {
		this.codSes = codSes;
	}

	public int getCodPel() {
		return codPel;
	}

	public void setCodPel(int codPel) {
		this.codPel = codPel;
	}

	public int getCodSala() {
		return codSala;
	}

	public void setCodSala(int codSala) {
		this.codSala = codSala;
	}

	@Override
	public String toString() {
		return "Sesion [cod=" + codSes + ", p=" + codPel + ", s=" + codSala + ", hora=" + hora + ", butacas = "
				+ butacasToString() + "]";
	}

	public String butacasToString() {
		String resultado = "";
		for (int i = 0; i < getButacas().length; i++) {
			resultado = resultado + getButacas()[i].toString();
		}
		return resultado;
	}

}
