package ups.edu.ec.base;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agustin
 */
public class ControladorBase {
      private static Connection con;

    public static void conectarBD() {

        try {
            //Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/joseatariguano",
                    "postgres", "12345");
            
            System.out.println("conexxion a base de datos Libros");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de conexion");
       // } catch (ClassNotFoundException ex) {
       //     Logger.getLogger(ContoladorBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void cerrarBD() {

        try {
            if (!con.isClosed()) {
                con.close();
                System.out.println("Se cerro la base ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al cerrar de la conexion");
        }
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        ControladorBase.con = con;
    }
    
    public static void main (String [] arg) {
    	
    	ControladorBase co = new ControladorBase();
    	co.conectarBD();
    }

	
}