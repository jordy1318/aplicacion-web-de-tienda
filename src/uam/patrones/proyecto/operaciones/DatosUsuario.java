/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.operaciones;

import uam.patrones.proyecto.compartido.Compartido;

/**
 *
 * @author elimanaseszacariasperez
 */
public class DatosUsuario {
    
    /*Regresa el nombre del usuario*/
    public void nombreUsuario(String usr){
        if(usr.compareTo("admin")==0){
            Compartido.nombreUsuario="Administrador del Sistema";
        }
        else if(usr.compareTo("usrA")==0){
            Compartido.nombreUsuario="Usuario A";
        }
        else if(usr.compareTo("usrB")==0){
            Compartido.nombreUsuario="Usuario B";
        }
    }
    
    public String descripcion(String usr){
        if(usr.compareTo("admin")==0){
            return "Selecciona la opción que deseas realizar";
        }else{
            return "Presiona el botón correspondiente para comenzar una prueba";
        }
    }
    
}
