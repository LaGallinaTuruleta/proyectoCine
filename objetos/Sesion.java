package abril18.proyectoCine.objetos;

public class Sesion {
	private int codSes;
	private int codPel;
	private int codSala;
	private String hora;

	public Sesion() {
		this.codSes = 0;
		this.codPel = 0;
		this.codSala = 0;
		this.hora = "";
	}

	public Sesion(int codSes, int codPel, int codSala, String hora) {
		this.codSes = codSes;
		this.codPel = codPel;
		this.codSala = codSala;
		this.hora = hora;
	}

	public Sesion(int codPel, int codSala, String hora) {
		this.codSes = 0;
		this.codPel = codPel;
		this.codSala = codSala;
		this.hora = hora;
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
		return "Sesion [cod=" + codSes + ", p=" + codPel + ", s=" + codSala + ", hora=" + hora + "]";
	}

}
