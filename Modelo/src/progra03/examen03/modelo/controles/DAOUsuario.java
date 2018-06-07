package progra03.examen03.modelo.controles;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import progra03.examen03.controlPersistencia.entidades.GestionConexion;
import progra03.examen03.modelo.entidades.Usuario;

/**
 *
 * @author Beatriz Hernandez
 */
public class DAOUsuario {

    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    // - Metodos ---------------------------------------------------------------
    public Usuario realizarLogin(String usuario, String password) throws Exception {
        Connection connection =
                GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "SELECT COD_ID, "
                + "DSC_NOMBRE_COMPLETO, "
                + "DSC_USUARIO, "
                + "DSC_PASSWORD, "
                + "DSC_PAIS, "
                + "DSC_CORREO, "
                + "DSC_TELEFONOS "
                + "FROM TBL_USUARIO WHERE DSC_USUARIO = ? AND DSC_PASSWORD = ?");


        preparedStatement.setString(1, usuario);
        preparedStatement.setString(2, password);

        ResultSetImpl resultSetImpl = (ResultSetImpl) preparedStatement.executeQuery();
        resultSetImpl.next();

        Usuario user = new Usuario();
        user.setCodId(resultSetImpl.getInt("COD_ID"));
        user.setNombre(resultSetImpl.getString("DSC_NOMBRE_COMPLETO"));
        user.setCuenta_usuario(resultSetImpl.getString("DSC_USUARIO"));
        user.setPassword(resultSetImpl.getString("DSC_PASSWORD"));
        user.setPais(resultSetImpl.getString("DSC_PAIS"));
        user.setCorreo(resultSetImpl.getString("DSC_CORREO"));
        user.setTelefonos(resultSetImpl.getString("DSC_TELEFONOS"));

        preparedStatement.close();
        connection.close();

        return user;
    }
    
      public void guardarUsuario(Usuario usuario) throws Exception {
        Connection connection = GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "INSERT INTO TBL_USUARIO(DSC_NOMBRE_COMPLETO, "
                + "DSC_USUARIO, "
                + "DSC_PASSWORD, "
                + "DSC_PAIS, "
                + "DSC_CORREO, "
                + "DSC_TELEFONOS) "
                + "VALUES(?,?,?,?,?,?)");           

        preparedStatement.setString(1, usuario.getNombre());
        preparedStatement.setString(2, usuario.getCuenta_usuario());
        preparedStatement.setString(3, usuario.getPassword());
        preparedStatement.setString(4, usuario.getPais());
        preparedStatement.setString(5, usuario.getCorreo());
        preparedStatement.setString(6, usuario.getTelefonos());
        preparedStatement.executeUpdate();

        connection.commit();
        preparedStatement.close();
        connection.close();
    }
      
     public Usuario consultarUsuario(int codUsuario) throws Exception {
        Connection connection =
                GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "SELECT COD_ID, "
                + "DSC_NOMBRE_COMPLETO, "
                + "DSC_USUARIO, "
                + "DSC_PASSWORD, "
                + "DSC_PAIS, "
                + "DSC_CORREO, "
                + "DSC_TELEFONOS "
                + "FROM TBL_USUARIO WHERE COD_ID = ?");


        preparedStatement.setInt(1, codUsuario);

        ResultSetImpl resultSetImpl = (ResultSetImpl) preparedStatement.executeQuery();
        resultSetImpl.next();

        Usuario user = new Usuario();
        user.setCodId(resultSetImpl.getInt("COD_ID"));
        user.setNombre(resultSetImpl.getString("DSC_NOMBRE_COMPLETO"));
        user.setCuenta_usuario(resultSetImpl.getString("DSC_USUARIO"));
        user.setPassword(resultSetImpl.getString("DSC_PASSWORD"));
        user.setPais(resultSetImpl.getString("DSC_PAIS"));
        user.setCorreo(resultSetImpl.getString("DSC_CORREO"));
        user.setTelefonos(resultSetImpl.getString("DSC_TELEFONOS"));

        preparedStatement.close();
        connection.close();

        return user;
    }  
      
      
      
    
}
