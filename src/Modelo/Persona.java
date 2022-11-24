/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sebastian
 */
public class Persona {

    protected int rut;
    protected int dv;
    protected String pnombre;
    protected String snombre;
    protected String apaterno;
    protected String amaterno;

    public Persona(int rut, int dv, String pnombre, String snombre, String apaterno, String amaterno) {
        this.rut = rut;
        this.dv = dv;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
    }
    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

}
