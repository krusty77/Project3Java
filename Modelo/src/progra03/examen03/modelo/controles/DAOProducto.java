package progra03.examen03.modelo.controles;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import java.util.ArrayList;
import progra03.examen03.controlPersistencia.entidades.GestionConexion;
import progra03.examen03.modelo.entidades.Producto;

/**
 *
 * @author Beatriz Hernandez
 */
public class DAOProducto {
    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    // - Metodos ---------------------------------------------------------------

    public void guardarProducto(Producto producto) throws Exception {
        Connection connection = GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "INSERT INTO TBL_PRODUCTO(COD_ID, "
                + "DSC_NOMBRE, "
                + "DSC_DESCRIPCION, "
                + "DSC_COSTO, "
                + "DSC_CANTIDAD, "
                + "DSC_POPULARIDAD) "
                + "VALUES(?,?,?,?,?,?)");

        preparedStatement.setInt(1, producto.getCodigo());
        preparedStatement.setString(2, producto.getNombre());
        preparedStatement.setString(3, producto.getDescripcion());
        preparedStatement.setDouble(4, producto.getCosto());
        preparedStatement.setInt(5, producto.getCantidad());
        preparedStatement.setInt(6, producto.getPoularidad());

        preparedStatement.executeUpdate();

        connection.commit();
        preparedStatement.close();
        connection.close();

    }

    public ArrayList<Producto> consultarProductos() throws Exception {
        Connection connection =
                GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "SELECT COD_ID, "
                + "DSC_NOMBRE, "
                + "DSC_DESCRIPCION, "
                + "DSC_COSTO, "
                + "DSC_CANTIDAD, "
                + "DSC_POPULARIDAD "
                + "FROM TBL_PRODUCTO");

        ArrayList<Producto> productos = new ArrayList<Producto>();
        ResultSetImpl resultSetImpl = (ResultSetImpl) preparedStatement.executeQuery();

        while (resultSetImpl.next()) {
            Producto producto = new Producto();

            producto.setCodigo(resultSetImpl.getInt("COD_ID"));
            producto.setNombre(resultSetImpl.getString("DSC_NOMBRE"));
            producto.setDescripcion(resultSetImpl.getString("DSC_DESCRIPCION"));
            producto.setCosto(resultSetImpl.getDouble("DSC_COSTO"));
            producto.setCantidad(resultSetImpl.getInt("DSC_CANTIDAD"));
            producto.setPoularidad(resultSetImpl.getInt("DSC_POPULARIDAD"));

            productos.add(producto);
        }

        preparedStatement.close();
        connection.close();

        return productos;
    }

    public Producto consultarDetalleProducto(int codId) throws Exception {
        Connection connection =
                GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "SELECT COD_ID, "
                + "DSC_NOMBRE, "
                + "DSC_DESCRIPCION, "
                + "DSC_COSTO, "
                + "DSC_CANTIDAD, "
                + "DSC_POPULARIDAD "
                + "FROM TBL_PRODUCTO "
                + "WHERE COD_ID = ? ");


        preparedStatement.setInt(1, codId);

        ResultSetImpl resultSetImpl = (ResultSetImpl) preparedStatement.executeQuery();
        resultSetImpl.next();

        Producto producto = new Producto();

        producto.setCodigo(resultSetImpl.getInt("COD_ID"));
        producto.setNombre(resultSetImpl.getString("DSC_NOMBRE"));
        producto.setDescripcion(resultSetImpl.getString("DSC_DESCRIPCION"));
        producto.setCosto(resultSetImpl.getDouble("DSC_COSTO"));
        producto.setCantidad(resultSetImpl.getInt("DSC_CANTIDAD"));
        producto.setPoularidad(resultSetImpl.getInt("DSC_POPULARIDAD"));
        preparedStatement.close();
        connection.close();

        return producto;
    }

    public void actualizarCantidadProducto(int codId) throws Exception {
        Connection connection = GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "UPDATE TBL_PRODUCTO "
                + "SET DSC_CANTIDAD = DSC_CANTIDAD - 1 WHERE COD_ID = ?");


        preparedStatement.setInt(1, codId);
        preparedStatement.executeUpdate();

        connection.commit();
        preparedStatement.close();
        connection.close();
    }

    public void actualizarDemandaProductosSuma(int codId) throws Exception {
        Connection connection = GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "UPDATE TBL_PRODUCTO "
                + "SET DSC_POPULARIDAD = DSC_POPULARIDAD + 1 "
                + "WHERE COD_ID = ?");


        preparedStatement.setInt(1, codId);

        preparedStatement.executeUpdate();

        connection.commit();
        preparedStatement.close();
        connection.close();
    }

    public void actualizarDemandaProductosResta(int codId) throws Exception {
        Connection connection = GestionConexion.obtenerInstancia().obtieneConexion();

        PreparedStatement preparedStatement =
                (PreparedStatement) connection.prepareStatement(
                "UPDATE TBL_PRODUCTO "
                + "SET DSC_POPULARIDAD = DSC_POPULARIDAD - 1 "
                + "WHERE COD_ID = ?");


        preparedStatement.setInt(1, codId);

        preparedStatement.executeUpdate();

        connection.commit();
        preparedStatement.close();
        connection.close();
    }
}
