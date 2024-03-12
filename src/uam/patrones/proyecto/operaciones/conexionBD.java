/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.operaciones;
import java.sql.*;
/**
 *
 * @author ELI ZACARIAS
 */
public class conexionBD {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
        System.out.println("se hizo la conexion, agregar");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    Statement createStatement(){
    
        throw new UnsupportedOperationException("No soportado");
    }

    
}
