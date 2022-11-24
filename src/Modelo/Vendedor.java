/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sebastian
 */
public class Vendedor extends Persona {
    private String direccion;
    private String correo;
    private int tel_movil;

    public Vendedor(int rut, int dv, String pnombre, String snombre, String apaterno, String amaterno, String direccion, String correo, int tel_movil) {
        super(rut, dv, pnombre, snombre, apaterno, amaterno);
        this.direccion = direccion;
        this.correo = correo;
        this.tel_movil = tel_movil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTel_movil() {
        return tel_movil;
    }

    public void setTel_movil(int tel_movil) {
        this.tel_movil = tel_movil;
    }
    
}
