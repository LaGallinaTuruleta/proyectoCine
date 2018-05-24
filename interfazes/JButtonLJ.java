package abril18.proyectoCine.interfazes;

import javax.swing.JButton;

public class JButtonLJ extends JButton {
	private int codSes;
	
	public JButtonLJ(int codSes) {
		setCodSes(codSes);
	}

	public int getCodSes() {
		return codSes;
	}

	public void setCodSes(int codSes) {
		this.codSes = codSes;
	}
	
	
}
