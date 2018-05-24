package abril18.proyectoCine.interfazes;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import abril18.proyectoCine.guardadoDatos.BBDD;
import abril18.proyectoCine.objetos.Pelicula;
import abril18.proyectoCine.objetos.Sala;
import abril18.proyectoCine.objetos.Sesion;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import javax.swing.ScrollPaneConstants;
import java.awt.CardLayout;

public class Interfas {
	private BBDD bbdd;
	private JFrame frame;
	ArrayList<Sesion> sesiones;
	ArrayList<Pelicula> peliculas;
	ArrayList<Sala> salas;
	private JPanel panel1_peliculas;
	private JPanel panel2_sesiones;
	private JPanel panel3_butacas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Interfas window = new Interfas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfas() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		bbdd = new BBDD();
		sesiones = new ArrayList<Sesion>();
		peliculas = new ArrayList<Pelicula>();
		salas = new ArrayList<Sala>();

		peliculas.addAll(bbdd.extraerPeliculasDeBBDD());
		sesiones.addAll(bbdd.extraerSesionesDeBBDD());
		salas.addAll(bbdd.extraerSalasBBDD());

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panel1_peliculas = new JPanel();
		frame.getContentPane().add(panel1_peliculas, "name_142425102264885");
		panel1_peliculas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cambioVentanaSesiones(1);
			}
		});
		panel1_peliculas.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Blanes-PC\\workspace\\Programación Repitiendo\\src\\abril18\\proyectoCine\\interfazes\\avatar.jpg"));
		lblNewLabel.setSize(80, 140);

		JLabel lblNewLabel1 = new JLabel();
		panel1_peliculas.add(lblNewLabel1);
		lblNewLabel1.setIcon(new ImageIcon(
				"C:\\Users\\Blanes-PC\\workspace\\Programación Repitiendo\\src\\abril18\\proyectoCine\\interfazes\\avatar.jpg"));
		lblNewLabel1.setSize(80, 140);

		JScrollPane scrollPane = new JScrollPane();
		panel1_peliculas.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(new Rectangle(0, 0, 10, 70));
		scrollPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane.setToolTipText("yr\r\n");

		panel2_sesiones = new JPanel();
		frame.getContentPane().add(panel2_sesiones, "panel_sesiones");

		panel3_butacas = new JPanel();
		frame.getContentPane().add(panel3_butacas, "panel_butacas");

		ArrayList<JLabelLJ> arraysJLabelLJs = new ArrayList<JLabelLJ>();
		for (Pelicula pelicula : peliculas) {
			JLabelLJ label_pelicula = new JLabelLJ(pelicula);
			label_pelicula.setIcon(new ImageIcon(pelicula.getRutaFoto()));
			label_pelicula.setSize(80, 140);
			label_pelicula.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					cambioVentanaSesiones(label_pelicula.getP().getCod());
				}
			});
			arraysJLabelLJs.add(label_pelicula);
		}
		for (JLabelLJ jLabelLJ : arraysJLabelLJs) {
			panel1_peliculas.add(jLabelLJ);
		}
		/*
		 * JLabel label_peliculaj = new JLabel(); label_peliculaj.setIcon(new
		 * ImageIcon(pelicula.getRutaFoto())); label_peliculaj.setSize(80, 140);
		 * label_peliculaj.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent arg0) {
		 * cambioVentanaSesiones(1); } }); panel.add(label_peliculaj);
		 */
		//panel.add(jp.add(new JLabel().setIcon(new ImageIcon(pelicula.getRutaFoto()))));
		//panelesPeliculas.add(new JPanel().add(new JLabel().setIcon(new ImageIcon(pelicula.getRutaFoto()))));
		//jp.add();
		//jp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		//panelesPeliculas.add(jp);
		//ImageIcon img = new ImageIcon(pelicula.getRutaFoto());
		//Icon poster2 = new ImageIcon(img.getImage().getScaledInstance(70, 130, Image.SCALE_DEFAULT));
		/*
		 * jb.setHorizontalAlignment(SwingConstants.CENTER);
		 * jb.setVerticalAlignment(SwingConstants.TOP);
		 * jb.setText(pelicula.getNombre());
		 * 
		 * jb.setIcon(new ImageIcon(pelicula.getRutaFoto()));
		 * 
		 * jp.add(jb); panelesPeliculas.add(jp);
		 */

	}

	public void cambioVentanaSesiones(int idPelicula) {
		panel1_peliculas.removeAll();
		for (Sesion sesion : sesiones) {
			if (sesion.getCodPel() == idPelicula) {
				JButtonLJ jbuton_sesion = new JButtonLJ(2);
				jbuton_sesion.setSize(80, 140);
				jbuton_sesion.addActionListener(null);
			}

		}
	}
}
