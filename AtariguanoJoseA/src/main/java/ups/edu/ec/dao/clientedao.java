package ups.edu.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ups.edu.ec.base.ControladorBase;
import ups.edu.ec.bean.ClaseBean;
import ups.edu.ec.modelo.Cliente;


public class clientedao {
	
	private ResultSet rs = null;
	private Statement st = null;
	private String sql;

	public void crearCliente(Cliente c) {
		
		

		try {
			ControladorBase.conectarBD();
			sql = "INSERT INTO public.cliente(\"cedula\", \"nombres\", \"apellidos\", \"fechanacimiento\")" + "VALUES (" + c.getCedula()
					+ "," + "'" + c.getNombres() + "','" + c.getApellidos() + "','" + c.getFechaN() + "');";

			System.out.println("Inertando en la base "+c.toString());

			Statement sta = ControladorBase.getCon().createStatement();
			sta.executeUpdate(sql);

		} catch (SQLException ex) {
			// Logger.getLogger(ControladorVehiculo.class.getName()).log(Level.SEVERE, null,
			// ex);

		}

	}
	

	public Cliente buscarCliente(String cedula) {

		Cliente c= new Cliente();
		sql = "SELECT * FROM cliente where cedula = '" + cedula + "';";
		ControladorBase.conectarBD();
		try {
			st = ControladorBase.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(sql);
			while (rs.next()) {
				c.setCedula(rs.getString("cedula"));
				c.setNombres(rs.getString("nombres"));
				c.setApellidos(rs.getString("apellidos"));
				c.setFechaN(rs.getString("fechanacimiento"));
				
			}
			
			System.out.println("Buscando Cliente "+c.toString());
			return c;

		} catch (SQLException ex) {
			// Logger.getLogger(ControladorVehiculo.class.getName()).log(Level.SEVERE, null,
			// ex);
		}
		return c;

	}
	
	public static void main (String args[]) {
		clientedao c = new clientedao();
		System.out.println(c.buscarCliente("111"));
	}
	
}
