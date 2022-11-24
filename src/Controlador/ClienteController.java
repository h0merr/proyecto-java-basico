/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConexionBD;
import Modelo.Cliente;
import Vista.IngresoCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class ClienteController {

    public int insertCliente(Cliente c) {
        ConexionBD con = new ConexionBD();
        Connection link = con.conectar();
        try {
            ResultSet filas = null;
            PreparedStatement check = link.prepareStatement("SELECT CLI_RUN FROM CLIENTE WHERE CLI_RUN = " + c.getRut());
            filas = check.executeQuery();
            boolean clienteExiste = filas.next();

            if (clienteExiste) {
                return 2;
            } else {
                PreparedStatement query = link.prepareStatement(""
                        + "INSERT INTO CLIENTE VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ?)");

                query.setInt(1, c.getRut());
                query.setInt(2, c.getDv());
                query.setString(3, c.getPnombre());
                query.setString(4, c.getSnombre());
                query.setString(5, c.getApaterno());
                query.setString(6, c.getAmaterno());
                query.setString(7, c.getFecha_nac());
                query.setString(8, c.getDireccion());
                query.setString(9, c.getCorreo());
                query.setInt(10, c.getTel_movil());
                query.executeUpdate();

                link.close();

                return 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int deleteCliente (Cliente c) {
        ConexionBD con = new ConexionBD();
        Connection link = con.conectar();
        
        try {
            PreparedStatement query = link.prepareStatement(""
                    + "DELETE FROM CLIENTE WHERE CLI_RUT = ?");

                query.setInt(1, c.getRut());
                query.executeUpdate();

                link.close();

                return 1;
        } catch (SQLException ex) {
//          Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return 0;
        }
    }
    
    public static ResultSet listarClientes (String consulta){
        ConexionBD con = new ConexionBD();
        Connection link = con.conectar();
        PreparedStatement query;
        ResultSet rs = null;
        System.out.println(consulta);
        try{
            query = link.prepareStatement(consulta);
            rs = query.executeQuery(consulta);
        }catch(SQLException ex){
//          Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return rs;
    }
}
