package it.pkg.basic;

import java.sql.Connection;

import Servicios.ConexionImplementacion;
import Servicios.ConexionInterfaz;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 
    	ConexionInterfaz ci = new ConexionImplementacion();
    	
    	 Connection conexion = 	ci.generaConexion();
    }
}
