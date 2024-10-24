#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package Servicios;

import java.sql.Connection;

public interface ConexionInterfaz {

	public Connection generaConexion();
}
