package abril18.proyectoCine.interfazes;

import javax.swing.JLabel;

import abril18.proyectoCine.objetos.Pelicula;

public class JLabelLJ extends JLabel {

	private Pelicula p;

	public JLabelLJ(Pelicula p) {
		setP(p);
	}

	public Pelicula getP() {
		return p;
	}

	public void setP(Pelicula p) {
		this.p = p;
	}

}
