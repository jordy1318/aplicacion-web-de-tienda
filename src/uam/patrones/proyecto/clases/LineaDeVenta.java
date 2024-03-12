/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.clases;

/**
 *
 * @author ELI ZACARIAS
 */
public class LineaDeVenta {
    private int cantidad;
    private Producto unaDescripcion;
    private float subtotal;

    public LineaDeVenta(int cantidad, Producto unaDescripcion, float subtotal) {
        this.cantidad = cantidad;
        this.unaDescripcion = unaDescripcion;
        this.subtotal = subtotal;
    }
     
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
      public Producto getProducto() {
        return unaDescripcion;
    }

    public void setProducto(Producto cantidad) {
        this.unaDescripcion = unaDescripcion;
    }
    
    public float obtenerSubtotal (){
        return (cantidad * unaDescripcion.getPrecio());
    }
    
    
    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
    public String toString(){
String cadena = "";
cadena =  unaDescripcion + "\t \t"+cantidad +" \t \t "+subtotal;
return cadena;
}
}
