package progra03.examen03.controlPersistencia.entidades;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class GestionConexion {

    private static final String cadenaConexion = 
            "jdbc:mysql://127.0.0.1:3306/EXAMEN_03";   
            
    private static final String usuarioDB = "root";
    private static final String password = "root";
    
    private static GestionConexion instancia;

    // - Constructor -----------------------------------------------------------
    private GestionConexion() {
    }

    // - Metodos ---------------------------------------------------------------
    public static GestionConexion obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestionConexion();
        }

        return instancia;
    }

    // crear la conexion con la base de datos por medio del driver
    public Connection obtieneConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection(
                    cadenaConexion,usuarioDB,password);
            
            connection.setAutoCommit(false);                        
            return connection;
            
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
}
