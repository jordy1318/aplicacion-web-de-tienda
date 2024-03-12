/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.operaciones;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import uam.patrones.proyecto.clases.Categoria;
import uam.patrones.proyecto.clases.LineaDeVenta;
import uam.patrones.proyecto.clases.Marca;
import uam.patrones.proyecto.clases.Producto;
import uam.patrones.proyecto.clases.Talla;
/**
 *
 * @author ELI ZACARIAS
 */


public class UtileriaLineaVenta {
    Float total = 500f;
    public static List<LineaDeVenta> recuperaLineaVenta(){
        List <LineaDeVenta> lista = new LinkedList<LineaDeVenta>();
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select * from LineaVenta as L,Producto as P, Marca as M, Categoria as C, Talla as T where L.Producto_idProducto = P.idProducto  and P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca");
                //desplegar info
                while(tablaResultados.next()){
                    String nombre = tablaResultados.getString("P.Nombre");
                    String marcaid = tablaResultados.getString("idMarca");
                    String marcanom = tablaResultados.getString("M.Nombre");
                    String categoriaid = tablaResultados.getString("idCategoria");
                    String categorianom = tablaResultados.getString("C.Nombre");
                    String tallaid = tablaResultados.getString("idTalla");
                    String tallanom = tablaResultados.getString("T.Nombre");
                    String precio = tablaResultados.getString("precio");
                    float Preciof = Float.valueOf(precio);
                    String cantidad = tablaResultados.getString("cantidad");
                    int cantidadi = Integer.valueOf(cantidad);
                    String idProducto = tablaResultados.getString("idProducto");
                    
                    Categoria categoria = new Categoria(categoriaid,categorianom);
                    Marca marca= new Marca(marcaid,marcanom);
                    Talla talla = new Talla(tallaid,tallanom);
                    Producto producto = new Producto(idProducto,nombre,Preciof,categoria,marca,talla);
                    LineaDeVenta linea = new LineaDeVenta(cantidadi, producto,((Float)(cantidadi*Preciof)));
                    lista.add(linea);
                    
                    
                    
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    
    public static List<Producto> recuperaProducto(){
        List <Producto> listaProducto = new LinkedList<Producto>();
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select * from Producto as P, Marca as M, Categoria as C, Talla as T where P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca");
                //desplegar info
                while(tablaResultados.next()){
                    String nombre = tablaResultados.getString("P.Nombre");
                    String marcaid = tablaResultados.getString("idMarca");
                    String marcanom = tablaResultados.getString("M.Nombre");
                    String categoriaid = tablaResultados.getString("idCategoria");
                    String categorianom = tablaResultados.getString("C.Nombre");
                    String tallaid = tablaResultados.getString("idTalla");
                    String tallanom = tablaResultados.getString("T.Nombre");
                    String precio = tablaResultados.getString("precio");
                    float Preciof = Float.valueOf(precio);
                   
                    String idProducto = tablaResultados.getString("idProducto");
                    
                    Categoria categoria = new Categoria(categoriaid,categorianom);
                    Marca marca= new Marca(marcaid,marcanom);
                    Talla talla = new Talla(tallaid,tallanom);
                    Producto producto = new Producto(idProducto,nombre,Preciof,categoria,marca,talla);
                    listaProducto.add(producto);
                    
                    //System.out.println(producto);
                    
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return listaProducto;
    }
    
    
    
    public static List<Producto> recuperaProductoConsulta(String Nombre, int opc){
        List <Producto> listaProducto = new LinkedList<Producto>();
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados;
                if(opc ==0){
                tablaResultados = st.executeQuery("select * from Producto as P, Marca as M, Categoria as C, Talla as T where P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca and P.idProducto = "+Nombre+"");
                }else if(opc==1){
                tablaResultados = st.executeQuery("select * from Producto as P, Marca as M, Categoria as C, Talla as T where P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca and P.Nombre = '"+Nombre+"'");
                }else if(opc==2){
                tablaResultados = st.executeQuery("select * from Producto as P, Marca as M, Categoria as C, Talla as T where P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca and C.Nombre = '"+Nombre+"'");
                }else if(opc==3){
                tablaResultados = st.executeQuery("select * from Producto as P, Marca as M, Categoria as C, Talla as T where P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca and M.Nombre = '"+Nombre+"'");
                }else{
                tablaResultados = st.executeQuery("select * from Producto as P, Marca as M, Categoria as C, Talla as T where P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca");
                }
  
                //desplegar info
                while(tablaResultados.next()){
                    String nombre = tablaResultados.getString("P.Nombre");
                    String marcaid = tablaResultados.getString("idMarca");
                    String marcanom = tablaResultados.getString("M.Nombre");
                    String categoriaid = tablaResultados.getString("idCategoria");
                    String categorianom = tablaResultados.getString("C.Nombre");
                    String tallaid = tablaResultados.getString("idTalla");
                    String tallanom = tablaResultados.getString("T.Nombre");
                    String precio = tablaResultados.getString("precio");
                    float Preciof = Float.valueOf(precio);
                   
                    String idProducto = tablaResultados.getString("idProducto");
                    
                    Categoria categoria = new Categoria(categoriaid,categorianom);
                    Marca marca= new Marca(marcaid,marcanom);
                    Talla talla = new Talla(tallaid,tallanom);
                    Producto producto = new Producto(idProducto,nombre,Preciof,categoria,marca,talla);
                    listaProducto.add(producto);
                    
                    //System.out.println(producto);
                    
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return listaProducto;
    }
    
    public static void imprimeLista(List<LineaDeVenta> lista){
    
    Iterator iter = lista.iterator();
    
    while(iter.hasNext()){
        LineaDeVenta linea = (LineaDeVenta) iter.next();
        System.out.println(linea.toString());
    }
    
    }
    
    
    public static String imprimeListaProducto(List<Producto> lista){
    String Valor= "";
    Iterator iter = lista.iterator();
    
    while(iter.hasNext()){
        Producto linea = (Producto) iter.next();
        
        Valor = Valor + linea.toString() + "\n";
    }
    return Valor;
    }
    
    
    
    public List<String>llenarListaProductos(){
         total = 0.0f;
                List <String> listaProductos = new LinkedList<String>();

        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select P.idProducto, P.nombre,M.nombre, C.nombre, T.nombre from Producto as P, Marca as M, Categoria as C, Talla as T where P.Categoria_idCategoria = C.idCategoria and P.Talla_idTalla = T.idTalla and P.Marca_idMarca = M.idMarca");
                //desplegar info
                while(tablaResultados.next()){
                    String idProducto = tablaResultados.getString("P.idProducto");
                    String Nombre = tablaResultados.getString("P.nombre");
                    int idProductoi = Integer.valueOf(idProducto);
                   
                    listaProductos.add(Nombre);

                }
                
               // System.out.println(listaProductos);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
   
    
    return listaProductos;
    }
    
    public List<String>llenarListaMarcas(){
         total = 0.0f;

                List <String> listaMarca = new LinkedList<String>();

        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select Nombre from Marca");
                //desplegar info
                while(tablaResultados.next()){
                    String Marca = tablaResultados.getString("Nombre");
                   
                    listaMarca.add(Marca);

                }
                
               // System.out.println(listaProductos);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
   
    
    return listaMarca;
    }
    
    public List<String>llenarListaCategoria(){
         total = 0.0f;
                
                List <String> listaCategoria = new LinkedList<String>();
                
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select Nombre from Categoria");
                //desplegar info
                while(tablaResultados.next()){

                    String Categoria = tablaResultados.getString("Nombre");
                  
                   
                   
                    
                    listaCategoria.add(Categoria);
                   
                }
                
               // System.out.println(listaProductos);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
   
    
    return listaCategoria;
    }
    
     public List<String>llenarListaTalla(){
         total = 0.0f;
                List <String> listaTalla = new LinkedList<String>();
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaropa","root","root");
            if(conexion!=null){
                System.out.println("conectado a la base de datos");
                Statement st = conexion.createStatement();
                ResultSet tablaResultados = st.executeQuery("select Nombre from Talla");
                //desplegar info
                while(tablaResultados.next()){
                    
                    String Talla = tablaResultados.getString("Nombre");
                   
                   
                    listaTalla.add(Talla);
                }
                
               // System.out.println(listaProductos);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
   
    
    return listaTalla;
    }
    
    
}
