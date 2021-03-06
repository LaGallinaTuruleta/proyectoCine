package abril18.proyectoCine.interfazes;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BackgroundImage extends JFrame {
	JButton b1;
	JLabel l1;

	public BackgroundImage() {
		setTitle("Background Color for JFrame");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		/*
		 * One way ----------------- setLayout(new BorderLayout()); JLabel
		 * background=new JLabel(new
		 * ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png"));
		 * add(background); background.setLayout(new FlowLayout()); l1=new
		 * JLabel("Here is a button"); b1=new JButton("I am a button");
		 * background.add(l1); background.add(b1);
		 */
		// Another way
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Blanes-PC\\Documents\\MEGA\\1DAW\\PROGRAMACIÓN\\3EVALUACION\\jacki.jpg")));
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Blanes-PC\\workspace\\Programación Repitiendo\\src\\abril18\\proyectoCine\\interfazes\\jackie.jpg")));
		
		
		setLayout(new FlowLayout());
		l1 = new JLabel("Here is a button");
		b1 = new JButton("I am a button");
		add(l1);
		add(b1);
		// Just for refresh :) Not optional!
		setSize(399, 399);
		setSize(400, 400);
	}
/*
	public static void main(String args[]) {
		new BackgroundImage();
	}
	*/
}