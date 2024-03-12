/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.patrones.proyecto.operaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import uam.patrones.proyecto.clases.LineaDeVenta;
import uam.patrones.proyecto.clases.Producto;

/**
 *
 * @author ELI ZACARIAS
 */
public class Venta {
    Float total = 500f;
    private ArrayList<LineaDeVenta> lineasDeVenta;
    private EstrategiaPreciosVenta pricingStrategy;

    public Venta(EstrategiaPreciosVenta pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        lineasDeVenta = new ArrayList();
    }
    
    public void ingresarLineaDeVenta (int cantidad, Producto unaDescripcion, float subtotal){
        LineaDeVenta unaLineaDeVenta = new LineaDeVenta(cantidad, unaDescripcion,subtotal);
        lineasDeVenta.add(unaLineaDeVenta);
    }
    
    
    
    
    public static Float recuperaProducto(){
        List <Float> listaPrecios = new LinkedList<Float>();
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select precio from Producto ");
                //desplegar info
                while(tablaResultados.next()){
                    String precio = tablaResultados.getString("precio");
                    float Preciof = Float.valueOf(precio);
                    
                    
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return 0f;
    }
    
    
    public Float obtenerTotalAntesDesc(){
        // Pedir los subtotales a cada línea de venta
                total = 0.0f;
                List <Float> listaPrecios = new LinkedList<Float>();
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select p.precio,l.cantidad from Producto as p, LineaVenta as l where l.Producto_idProducto = p.idProducto ");
                //desplegar info
                while(tablaResultados.next()){
                    String precio = tablaResultados.getString("precio");
                    String cantidad = tablaResultados.getString("cantidad");
                    int cantidadi = Integer.valueOf(cantidad);
                    float Preciof = Float.valueOf(precio);
                    
                    float sub = ((Float)Preciof)*cantidadi;
                    listaPrecios.add((Float)sub);
                    total += (Float)sub;
                }
                
                System.out.println(listaPrecios);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }

        for (LineaDeVenta unaLinea:lineasDeVenta){
            total += unaLinea.obtenerSubtotal();
            
            
            
            
        }
        return total;
    }
    
    public Float obtenerTotal(){
        return pricingStrategy.obtenerTotal(this);
    }

    @Override
    public String toString() {
        return "Sale{" + "total=" + total + ", pricingStrategy=" + pricingStrategy + '}';
    }
    
    
}


