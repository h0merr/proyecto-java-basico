/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SebastianRebolledo
 */
public class TipoCombustible {
    private int id_combustible;
    private String nombre_tipo;

    public TipoCombustible(int id_combustible, String nombre_tipo) {
        this.id_combustible = id_combustible;
        this.nombre_tipo = nombre_tipo;
    }

    public int getId_combustible() {
        return id_combustible;
    }

    public void setId_combustible(int id_combustible) {
        this.id_combustible = id_combustible;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
    
}
