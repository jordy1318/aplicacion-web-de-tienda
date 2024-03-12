/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.operaciones;

import java.util.LinkedList;
import uam.patrones.proyecto.clases.Usuario;

/**
 *
 * @author elimanaseszacariasperez
 */
public class OperacionesLista {
    
    
        
     
     
    public Usuario regresarUsuario (LinkedList listaUsuario, int posicion){
    
        Usuario al = (Usuario) listaUsuario.get(posicion);
        return al;
    }
    
    
    public int buscarUsuario(LinkedList listaUsr, String login, String pas){
    int posicion= -1;
    
    for(int i=0;i<listaUsr.size();i++){
           Usuario al = (Usuario)listaUsr.get(i);
           if(al.getLogin().compareTo(login)==0 && al.getPassword().compareTo(pas)==0){
           posicion=i;
           break;
           }
        }
    
    return posicion;
    
    
    }
    
    
    
    
    
}
