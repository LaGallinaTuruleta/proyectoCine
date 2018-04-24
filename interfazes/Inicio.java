package abril18.proyectoCine.interfazes;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Inicio extends JFrame {
	private JFrame panelJFrame;

	public Inicio() {
		super();
		configurarVentana();
		inicioComponentes();
	}

	public void configurarVentana() {
		/*
		 * panelJFrame = new JFrame(); panelJFrame.setBounds(450, 450, 450,
		 * 450); //panelJFrame.setBorder(new EmptyBorder(15, 5, 25, 5));
		 * panelJFrame.setBackground(Color.YELLOW); setLayout(new GridLayout(2,
		 * 6, 25, 1)); //setContentPane(panelJFrame); 
		 */
		this.setBounds(450, 450, 450, 450);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("CineMax");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
	}

	public void inicioComponentes() {

	}
}
