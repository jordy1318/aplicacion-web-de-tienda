/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.operaciones;

import java.util.LinkedList;

/**
 *
 * @author elimanaseszacariasperez
 */
public class LlenadoListas {
    
    public LinkedList<String>llenarLista(){
        LinkedList<String>lista = new LinkedList();
        lista.clear();
       
            String opcion = "1. Buscar por código";
            String opcion1 = "2. Buscar por Nombre del producto";
            String opcion2 = "3. Buscar por Categoria";
            String opcion3 = "4. Buscar por Marca";
            String opcion4 = "5. Ver todos los productos";
            
            lista.add(opcion);
            lista.add(opcion1);
            lista.add(opcion2);
            lista.add(opcion3);
            lista.add(opcion4);
            
        
        return lista;
    }
    
    
    
        
    
}
