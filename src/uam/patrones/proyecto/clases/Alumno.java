/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.clases;

/**
 *
 * @author elimanaseszacariasperez
 */
public class Alumno {
    private String matricula;
    private String nombre;
    private String escuela;
    private String puntaje;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return  "matricula=" + matricula + ", nombre=" + nombre + 
                ", escuela=" + escuela + ", puntaje=" + puntaje;
    }
    
    
    
  
    
}
