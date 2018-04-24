package abril18.proyectoCine.guardadoDatos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import abril18.proyectoCine.objetos.Sesion;
import marzo18.Hotel.alojamiento.Hotel;

public class BBDD {
	private Path file;
	private Charset charset;

	public BBDD() {
		Path file;
		Charset charset;
	}

	public void guardarSesionesEnBBDD(ArrayList<Sesion> sesiones) {
		String eDriver = "com.mysql.jdbc.Driver";
		String eURL = "jdbc:mysql://localhost:3306/cine";
		PreparedStatement stmt = null;
		Connection con = null;
		for (Sesion sesion : sesiones) {
			try {
				Class.forName(eDriver).newInstance();
				con = DriverManager.getConnection(eURL, "root", "");
				stmt = con.prepareStatement("INSERT INTO SESIONES VALUES(" + sesion.getCod() + "," + sesion.getP() + ","
						+ sesion.getButacasBBDD() + "," + sesion.getHora());
			} catch (SQLException io) {

				System.err.format("IOExceptio: %s%n", io);
				System.out.println(io.toString());
			}
		}
	}
}