package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sebastian
 */
public class ConexionBD {

    public Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/modelo_rentacar", "root", "");

            System.out.println("Conexion exitosa.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conexion;
    }
}
