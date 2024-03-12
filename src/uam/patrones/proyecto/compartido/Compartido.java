/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.patrones.proyecto.compartido;

import java.util.LinkedList;

import uam.patrones.proyecto.clases.Usuario;

/**
 *
 * @author elimanaseszacariasperez
 */
public class Compartido {
    
    public static String login;
    public static String tipoUsuario;
    public static String nombreUsuario;
    public static int totalPreguntas;
    public static int preguntaActual = 1;
    public static LinkedList<Usuario>listaUsuario = new LinkedList<Usuario>();
    
}
