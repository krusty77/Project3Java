package progra03.examen03.modelo.controles;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import progra03.examen03.controlPersistencia.entidades.GestionConexion;
import progra03.examen03.modelo.entidades.Administrador;

/**
 *
 * @author Beatriz Hernandez
 */
public class DAOAdministrador {

    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    // - Metodos ---------------------------------------------------------------
    
    public Administrador realizarLogin(String usuario,String password) throws Exception {
    Connection connection =
                GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                  "SELECT COD_ID, "
                + "DSC_NOMBRE, "
                + "DSC_USUARIO, "
                + "DSC_PASSWORD  "
                + "FROM TBL_ADMINISTRADOR "
                + "WHERE DSC_USUARIO = ?  AND DSC_PASSWORD = ?");
        

        preparedStatement.setString(1, usuario);
        preparedStatement.setString(2, password);
        
        ResultSetImpl resultSetImpl = (ResultSetImpl) preparedStatement.executeQuery();
        resultSetImpl.next();

        Administrador admin =  new Administrador();
        
        admin.setCodId(resultSetImpl.getInt("COD_ID"));
        admin.setNombre(resultSetImpl.getString("DSC_NOMBRE"));
        admin.setCuentaUsuario(resultSetImpl.getString("DSC_USUARIO"));
        admin.setPassword(resultSetImpl.getString("DSC_PASSWORD"));

        preparedStatement.close();
        connection.close();

        return admin;
    }

}
