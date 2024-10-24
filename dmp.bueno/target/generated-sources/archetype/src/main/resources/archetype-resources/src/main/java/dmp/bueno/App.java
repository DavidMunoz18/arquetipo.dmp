#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

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
