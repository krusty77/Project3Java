package progra03.examen03.modelo.controles;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import java.util.ArrayList;
import progra03.examen03.controlPersistencia.entidades.GestionConexion;
import progra03.examen03.modelo.entidades.Compra;

/**
 *
 * @author Beatriz Hernandez
 */
public class DAOCompra {

    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    // - Metodos ---------------------------------------------------------------
    public void guardarCompra(int codUsuario, int codProducto) throws Exception {
        Connection connection = GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "INSERT INTO TBL_COMPRA (COD_USUARIO,COD_PRODUCTO)"
                + "VALUES(?,?)");

        preparedStatement.setInt(1, codUsuario);
        preparedStatement.setInt(2, codProducto);

        preparedStatement.executeUpdate();

        connection.commit();
        preparedStatement.close();
        connection.close();
    }

    public ArrayList<Compra> consultarCompras(int codProducto) throws Exception {
        Connection connection =
                GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "SELECT COD_ID, "
                + "COD_USUARIO, "
                + "COD_PRODUCTO "
                + "FROM TBL_COMPRA WHERE COD_PRODUCTO = ?");

        preparedStatement.setInt(1, codProducto);

        ArrayList<Compra> compras = new ArrayList<Compra>();
        ResultSetImpl resultSetImpl = (ResultSetImpl) preparedStatement.executeQuery();

        while (resultSetImpl.next()) {
            Compra compra = new Compra();

            compra.setCodId(resultSetImpl.getInt("COD_ID"));
            compra.setCodProducto(resultSetImpl.getInt("COD_USUARIO"));
            compra.setCodUsuario(resultSetImpl.getInt("COD_PRODUCTO"));

            compras.add(compra);
        }

        preparedStatement.close();
        connection.close();

        return compras;
    }
}
