/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.clases;

/**
 *
 * @author jfzzp
 */
public class Producto {
    private String idProducto;
    private String nombre;
    private float precio;
    private Categoria categoria;
    private Marca marca;
    private Talla talla;

    public Producto(String idProducto, String nombre, float precio, Categoria categoria, Marca marca, Talla talla) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.marca = marca;
        this.talla = talla;
    }

    
    
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return  nombre + "\t" + precio + "\t" + categoria + "\t" + marca + "\t" + talla;
    }
    
    
    
}
