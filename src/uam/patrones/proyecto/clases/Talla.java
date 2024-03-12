/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.clases;

/**
 *
 * @author jfzzp
 */
public class Talla {
    private String idTalla;
    private String nombre;

    public Talla(String idTalla, String nombre) {
        this.idTalla = idTalla;
        this.nombre = nombre;
    }

    
    public String getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(String idTalla) {
        this.idTalla = idTalla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
