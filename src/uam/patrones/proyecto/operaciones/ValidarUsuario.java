/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import uam.patrones.proyecto.clases.Usuario;
import uam.patrones.proyecto.compartido.Compartido;
import static uam.patrones.proyecto.compartido.Compartido.listaUsuario;

/**
 *
 * @author elimanaseszacariasperez
 */
public class ValidarUsuario {
    public boolean validarUsuario(LinkedList listaUsr,String login, String pas){
        
        for(int i=0;i<listaUsuario.size();i++){
            
            Usuario usr =listaUsuario.get(i);
             
               
        if(usr.getLogin().compareTo(login)==0){
            if(usr.getPassword().compareTo(pas)==0){
                Compartido.login="admin";
                Compartido.tipoUsuario="admin";
                return true;
                
            }else{
                return false;
            }
        }
        
        }
        
        
               
        
       return false; 
    }
    
    
    
    
    
    
    
    
    
    
}
