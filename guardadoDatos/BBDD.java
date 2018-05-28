package abril18.proyectoCine.guardadoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import abril18.proyectoCine.objetos.Butaca;
import abril18.proyectoCine.objetos.Pelicula;
import abril18.proyectoCine.objetos.Sala;
import abril18.proyectoCine.objetos.Sesion;

public class BBDD {
	private String eDriver;
	private String eURL;
	private PreparedStatement stmt;
	private Connection con;

	public BBDD() {
		eDriver = "com.mysql.jdbc.Driver";
		eURL = "jdbc:mysql://localhost:3306/cine";
		stmt = null;
		con = null;
	}

	public void guardarSesionesEnBBDD(ArrayList<Sesion> sesiones) {

		try {
			Class.forName(eDriver).newInstance();
			con = DriverManager.getConnection(eURL, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (Sesion sesion : sesiones) {
			try {
				stmt = con.prepareStatement("INSERT INTO SESIONES VALUES(?,?,?,?)");
				stmt.setInt(1, sesion.getCodSes());
				stmt.setInt(2, sesion.getCodPel());
				stmt.setInt(3, sesion.getCodSala());
				stmt.setString(4, sesion.getHora());
				stmt.executeUpdate();

				Butaca[] butacas = sesion.getButacas();
				for (int i = 0; i < butacas.length; i++) {
					stmt = con.prepareStatement("INSERT INTO BUTACAS VALUES(?,?,?,?)");
					stmt.setInt(1, butacas[i].getCodB());
					stmt.setInt(2, butacas[i].getFila());
					stmt.setInt(3, butacas[i].getAsiento());
					stmt.setBoolean(4, butacas[i].isOcupado());
					stmt.executeUpdate();
					stmt = con.prepareStatement("INSERT INTO rel_butacas_sesiones VALUES(?,?)");
					stmt.setInt(1, sesion.getCodSes());
					stmt.setInt(2, i);
					stmt.executeUpdate();
				}

				// Esto de abajo se supone que es lo mismo pero no funciona :D
				//stmt = con.prepareStatement(
				//		"INSERT INTO SESIONES VALUES(" + sesion.getCod() + "," + sesion.getP().getNombre() + ","
				//				+ sesion.getS().getButacasBBDD() + "," + sesion.getHora() + ");");
				//stmt.executeUpdate();

			} catch (SQLException io) {
				System.out.println("Peta a la hora de guardar las sessiones en la base de datos");
				System.out.println(io.toString());
				System.out.println(stmt.toString());
			}
		}
	}

	public void guardarSalasEnBBDD(ArrayList<Sala> salas) {

		try {
			Class.forName(eDriver).newInstance();
			con = DriverManager.getConnection(eURL, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (Sala sala : salas) {
			try {
				stmt = con.prepareStatement("INSERT INTO SALAS VALUES(?,?,?,?)");
				stmt.setInt(1, sala.getCodSala());
				stmt.setString(2, sala.getTipoSala());
				stmt.setInt(3, sala.getFilas());
				stmt.setInt(4, sala.getNumAsientosXFila());
				stmt.executeUpdate();

			} catch (SQLException io) {
				System.out.println("Peta a la hora de guardar las salas en la base de datos");
				System.out.println(io.toString());
				System.out.println(stmt.toString());
			}
		}
	}

	public void guardarPeliculasEnBBDD(ArrayList<Pelicula> peliculas) {
		try {
			Class.forName(eDriver).newInstance();
			con = DriverManager.getConnection(eURL, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
		}
		for (Pelicula pelicula : peliculas) {
			try {
				stmt = con.prepareStatement("INSERT INTO PELICULAS VALUES(?,?,?)");
				stmt.setInt(1, pelicula.getCod());
				stmt.setString(2, pelicula.getNombre());
				stmt.setString(3, pelicula.getRutaFoto());
				stmt.executeUpdate();
			} catch (SQLException io) {
				System.out.println("Peta a la hora de guardar las peliculas en la base de datos");
				System.out.println(io.toString());
				System.out.println(stmt.toString());
			}
		}
	}

	public ArrayList<Pelicula> extraerPeliculasDeBBDD() {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		try {
			Class.forName(eDriver).newInstance();
			con = DriverManager.getConnection(eURL, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			stmt = con.prepareStatement("SELECT * FROM PELICULAS");
			ResultSet rs = stmt.executeQuery();

			//error llega al maximo
			while (rs.next()) {
				peliculas.add(new Pelicula(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta a la hora de extraer las peliculas de la base de datos");
			System.out.println(e.toString());
			System.out.println(stmt.toString());
		}
		return peliculas;
	}

	public ArrayList<Sesion> extraerSesionesDeBBDD() {
		ArrayList<Sesion> sesiones = new ArrayList<Sesion>();
		try {
			Class.forName(eDriver).newInstance();
			con = DriverManager.getConnection(eURL, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta en la conexión de acceso a la BBDD desde extraerSesionesDeBBDD");
		}

		try {
			PreparedStatement stmtse = con.prepareStatement("SELECT * FROM SESIONES");
			ResultSet rsse = stmtse.executeQuery();

			//error llega al maximo
			while (rsse.next()) {
				PreparedStatement stmtsa = con.prepareStatement(
						"SELECT * FROM rel_butacas_sesiones WHERE COD_SESION='" + rsse.getInt(1) + "%'");
				ResultSet rssa = stmtsa.executeQuery();
				while (rssa.next()) {

					PreparedStatement stmtbu = con
							.prepareStatement("SELECT * FROM BUTACAS WHERE COD_BUTACA ='" + rssa.getInt(1) + "%'");
					ResultSet rsb = stmtbu.executeQuery();
					Butaca[] butacas = new Butaca[rsb.getInt(3) * rsb.getInt(4)];
					int i = 0;
					while (rsb.next()) {
						butacas[i] = new Butaca(rsb.getInt(1), rsb.getInt(2), rsb.getInt(3), rsb.getBoolean(4));
					}

					sesiones.add(new Sesion(rsse.getInt(1), rsse.getInt(2),
							new Sala(rssa.getInt(1), rssa.getString(2), rssa.getInt(3), rssa.getInt(4)),
							rssa.getString(4)));
				}

			}
		} catch (Exception e) {
			System.out.println("Peta a la hora de extraer las sesiones de la base de datos");
			System.out.println(e.toString());
			e.printStackTrace();
			// TODO: handle exception
		}
		return sesiones;
	}

	public ArrayList<Sala> extraerSalasBBDD() {
		ArrayList<Sala> salas = new ArrayList<Sala>();
		try {
			Class.forName(eDriver).newInstance();
			con = DriverManager.getConnection(eURL, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			stmt = con.prepareStatement("SELECT * FROM SALAS");
			ResultSet rs = stmt.executeQuery();
			salas.add(new Sala(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		} catch (Exception e) {
			System.out.println("Peta a la hora de extraer las salas de la base de datos");
			System.out.println(e.toString());
		}
		/*
		 * try { stmt = con.prepareStatement("SELECT * FROM BUTACAS"); ResultSet
		 * rs = stmt.executeQuery();
		 * 
		 * //error llega al maximo while (rs.next()) { //butacas.add(new
		 * Butaca(rs.getString(1), rs.getInt(2), rs.getInt(3),
		 * rs.getBoolean(4))); }
		 * 
		 * } catch (Exception e) { // TODO: handle exception System.out.
		 * println("Peta a la hora de extraer las butacas de la base de datos");
		 * System.out.println(e.toString());
		 * System.out.println(stmt.toString()); }
		 */

		return salas;
	}

	public void borrarTODOBBDD() {
		try {
			Class.forName(eDriver).newInstance();
			con = DriverManager.getConnection(eURL, "root", "");
		} catch (Exception e) {
			System.out.println("Peta a la hora de borrar la BBDD");
			System.out.println(e.toString());
			e.printStackTrace();
		}

		try {
			stmt = con.prepareStatement("DELETE FROM PELICULAS");
			stmt.executeUpdate();
			stmt = con.prepareStatement("DELETE FROM BUTACAS");
			stmt.executeUpdate();
			stmt = con.prepareStatement("DELETE FROM rel_butacas_sesiones");
			stmt.executeUpdate();
			stmt = con.prepareStatement("DELETE FROM SALAS");
			stmt.executeUpdate();
			stmt = con.prepareStatement("DELETE FROM SESIONES");
			stmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta a la hora de borrar todo de la bbdd");
			System.out.println(e.toString());
			System.out.println(stmt.toString());
		}

	}
}