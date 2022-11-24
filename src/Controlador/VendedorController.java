/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConexionBD;
import Modelo.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SebastianRebolledo
 */
public class VendedorController {
    
    public int insertVendedor (Vendedor v){
        ConexionBD con = new ConexionBD();
        Connection link = con.conectar();
        
        try {
            ResultSet filas = null;
            PreparedStatement check = link.prepareStatement("SELECT VEN_RUN FROM VENDEDOR");
            filas = check.executeQuery();
            boolean clienteExiste = filas.next();

            if (clienteExiste) {
                return 2;
            } else {
                PreparedStatement query = link.prepareStatement(""
                        + "INSERT INTO CLIENTE VALUES (? , ? , ? , ? , ? , ? , ? , ? , ?)");

                query.setInt(1, v.getRut());
                query.setInt(2, v.getDv());
                query.setString(3, v.getPnombre());
                query.setString(4, v.getSnombre());
                query.setString(5, v.getApaterno());
                query.setString(6, v.getAmaterno());
                query.setString(7, v.getDireccion());
                query.setString(8, v.getCorreo());
                query.setInt(9, v.getTel_movil());
                query.executeUpdate();

                link.close();

                return 1;
            }
        } catch (SQLException ex){
//          Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return 0;
        }
    }
    
    public int deleteVendedor (Vendedor v){
        ConexionBD con = new ConexionBD();
        Connection link = con.conectar();
        
        try {
            PreparedStatement query = link.prepareStatement(""
                    + "DELETE FROM VENDEDOR WHERE VEN_RUT = ?");

                query.setInt(1, v.getRut());
                query.executeUpdate();

                link.close();

                return 1;
        } catch (SQLException ex) {
//          Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return 0;
        }
    }
}
