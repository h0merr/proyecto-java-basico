/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sebastian
 */
public class Cliente extends Persona {

    private String fecha_nac;
    private String direccion;
    private String correo;
    private int tel_movil;

    public Cliente(int rut, int dv, String pnombre, String snombre, String apaterno, String amaterno, String fecha_nac, String direccion, String correo, int tel_movil) {
        super(rut, dv, pnombre, snombre, apaterno, amaterno);
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.correo = correo;
        this.tel_movil = tel_movil;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
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
