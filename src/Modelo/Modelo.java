/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SebastianRebolledo
 */
public class Modelo {

    private int id_modelo;
    private String nombre_modelo;
    private int id_marca;

    public Modelo(int id_modelo, String nombre_modelo, int id_marca) {
        this.id_modelo = id_modelo;
        this.nombre_modelo = nombre_modelo;
        this.id_marca = id_marca;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNombre_modelo() {
        return nombre_modelo;
    }

    public void setNombre_modelo(String nombre_modelo) {
        this.nombre_modelo = nombre_modelo;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

}
