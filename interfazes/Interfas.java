package abril18.proyectoCine.interfazes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import abril18.proyectoCine.objetos.Pelicula;
import abril18.proyectoCine.objetos.Sala;
import abril18.proyectoCine.objetos.Sesion;

import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Interfas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfas frame = new Interfas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfas() {
		setTitle("CineMAx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 419);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(20);
		contentPane.add(panel, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		contentPane.add(panel_2, BorderLayout.WEST);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.MAGENTA);
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GREEN);
		contentPane.add(panel_4, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setVgap(140);
		flowLayout_1.setHgap(80);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.DARK_GRAY);
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setVgap(140);
		flowLayout_2.setHgap(80);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.RED);
		FlowLayout flowLayout_3 = (FlowLayout) panel_7.getLayout();
		flowLayout_3.setVgap(140);
		flowLayout_3.setHgap(80);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		panel_4.add(panel_5);
		panel_4.add(panel_6);
		panel_4.add(panel_7);

		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_8.getLayout();
		flowLayout_4.setVgap(140);
		flowLayout_4.setHgap(80);
		panel_8.setBackground(Color.RED);
		panel_4.add(panel_8);

		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_9.getLayout();
		flowLayout_5.setVgap(140);
		flowLayout_5.setHgap(80);
		panel_9.setBackground(Color.RED);
		panel_4.add(panel_9);

		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_10.getLayout();
		flowLayout_6.setVgap(140);
		flowLayout_6.setHgap(80);
		panel_10.setBackground(Color.LIGHT_GRAY);
		panel_4.add(panel_10);
	}

	public Interfas(ArrayList<Pelicula> peliculas, ArrayList<Sesion> sesiones, ArrayList<Sala> salas) {
		BackgroundImageJFrame bi1 = new BackgroundImageJFrame();
		setTitle("CineMAx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 419);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(20);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		contentPane.add(panel_2, BorderLayout.WEST);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.MAGENTA);
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GREEN);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Blanes-PC\\Documents\\MEGA\\1DAW\\PROGRAMACIÓN\\3EVALUACION\\jacki.jpg")));
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("Here is a button");
		JButton b1 = new JButton("I am a button");
		contentPane.add(panel_4, BorderLayout.CENTER);
		
		ArrayList<JPanel> panelesPeliculas = new ArrayList<JPanel>();
		FlowLayout flowLayout_paneles;
		for (Pelicula pelicula : peliculas) {
			JPanel jp = new JPanel();

			//jp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			flowLayout_paneles = (FlowLayout) jp.getLayout();
			flowLayout_paneles.setVgap(140);
			flowLayout_paneles.setHgap(80);
			JLabel jb = new JLabel();

			panelesPeliculas.add(jp);
			//ImageIcon img = new ImageIcon(pelicula.getRutaFoto());
			//Icon poster2 = new ImageIcon(img.getImage().getScaledInstance(70, 130, Image.SCALE_DEFAULT));

			jb.setHorizontalAlignment(SwingConstants.CENTER);
			jb.setVerticalAlignment(SwingConstants.TOP);
			jb.setText(pelicula.getNombre());

			jb.setIcon(new ImageIcon(pelicula.getRutaFoto()));

			jp.add(jb);
			panelesPeliculas.add(jp);
			System.out.println(pelicula.toString());
		}

		for (JPanel jPanel : panelesPeliculas) {
			panel_4.add(jPanel);
		}

	}
}
