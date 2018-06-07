package progra03.examen03.administrador.controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.w3c.dom.Document;
import progra03.examen03.administrador.interfaces.InterfazConsultaDetalleProducto;
import progra03.examen03.administrador.interfaces.InterfazConsultarProdCompras;
import progra03.examen03.administrador.interfaces.InterfazConsultarProductos;
import progra03.examen03.administrador.interfaces.InterfazListaCompras;
import progra03.examen03.administrador.interfaces.InterfazLogin;
import progra03.examen03.administrador.interfaces.InterfazPrincipal;
import progra03.examen03.administrador.interfaces.InterfazRegistroProducto;
import progra03.examen03.modelo.controles.DAOAdministrador;
import progra03.examen03.modelo.controles.DAOCompra;
import progra03.examen03.modelo.controles.DAOProducto;
import progra03.examen03.modelo.controles.DAOUsuario;
import progra03.examen03.modelo.entidades.Administrador;
import progra03.examen03.modelo.entidades.Compra;
import progra03.examen03.modelo.entidades.ListaPublicacion;
import progra03.examen03.modelo.entidades.Producto;
import progra03.examen03.modelo.entidades.Publicacion;
import progra03.examen03.modelo.entidades.Usuario;
import progra03.librerias.control.ControlPersistencia;

/**
 *
 * @author Beatriz Hernandez
 */
public class Controlador {

    // - Atributos -------------------------------------------------------------   
    private InterfazLogin interfazLogin;
    private InterfazPrincipal interfazPrincipal;
    private InterfazRegistroProducto interfazRegistroProducto;
    private InterfazConsultarProductos interfazconsultarProductos;
    private InterfazConsultaDetalleProducto interfazconsultaDetalleProducto;
    private InterfazConsultarProdCompras interfazConsultaProdCompras;
    private InterfazListaCompras interfazListaCompras;
    private ListaPublicacion listaPublicaciones;

    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    public Controlador() {
        inicializarControlador();
        agregarListenersInterfazLogin();
        agregarListenersInterfazPrincipal();
        agregarListenersInterfazRegistroProducto();
        agregarListenersInterfazConsultaProductos();
        agregarListenersInterfazConsultaProdCompras();
        cargarXmlPublicaciones();

    }

    // - Metodos ---------------------------------------------------------------
    private void inicializarControlador() {
        interfazLogin = new InterfazLogin();
        interfazPrincipal = new InterfazPrincipal();
        interfazRegistroProducto = new InterfazRegistroProducto();
        interfazconsultarProductos = new InterfazConsultarProductos();
        interfazconsultaDetalleProducto = new InterfazConsultaDetalleProducto();
        interfazConsultaProdCompras = new InterfazConsultarProdCompras();
        interfazListaCompras = new InterfazListaCompras();
        listaPublicaciones = new ListaPublicacion();


        interfazLogin.setVisible(true);
    }

    private void agregarListenersInterfazLogin() {
        interfazLogin.agregarListenerBotonLogin(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = interfazLogin.getCampoUsuario();
                String password = new String(interfazLogin.getCampoClave());

                Administrador admin = null;

                try {
                    admin = new DAOAdministrador().realizarLogin(usuario, password);
                } catch (Exception ex) {
                    System.out.println("Administrador no encontrado");
                }
                if (admin != null) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + admin.getNombre(), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    interfazLogin.dispose();
                    interfazPrincipal.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR.. Usuario o Password Incorectos", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void agregarListenersInterfazPrincipal() {
        interfazPrincipal.agregarListenerBotonAgregarProducto(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                interfazRegistroProducto.setVisible(true);
            }
        });

        interfazPrincipal.agregarListenerBotonConsultarProducto(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mostarListadoProductos();
            }
        });

        interfazPrincipal.agregarListenerBotonConsultarCompras(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mostarListadoProductosCompras();
            }
        });
    }

    private void agregarListenersInterfazRegistroProducto() {
        interfazRegistroProducto.agregarListenerCampoCodigo(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                int ascci = e.getKeyChar();
                if ((ascci == 48 || ascci == 49 || ascci == 50 || ascci == 51
                        || ascci == 52 || ascci == 53 || ascci == 54 || ascci == 55
                        || ascci == 56 || ascci == 57 || ascci == 8)) {
                } else {
                    e.consume();
                    JOptionPane.showMessageDialog(null, "ERROR... Solo se permiten Valores Numericos", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        interfazRegistroProducto.agregarListenerCampoCantidad(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                int ascci = e.getKeyChar();
                if ((ascci == 48 || ascci == 49 || ascci == 50 || ascci == 51
                        || ascci == 52 || ascci == 53 || ascci == 54 || ascci == 55
                        || ascci == 56 || ascci == 57 || ascci == 8)) {
                } else {
                    e.consume();
                    JOptionPane.showMessageDialog(null, "ERROR... Solo se permiten Valores Numericos", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        interfazRegistroProducto.agregarListenerCampoCosto(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                int ascci = e.getKeyChar();
                if ((ascci == 48 || ascci == 49 || ascci == 50 || ascci == 51
                        || ascci == 52 || ascci == 53 || ascci == 54 || ascci == 55
                        || ascci == 56 || ascci == 57 || ascci == 8)) {
                } else {
                    e.consume();
                    JOptionPane.showMessageDialog(null, "ERROR... Solo se permiten Valores Numericos", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        interfazRegistroProducto.agregarListenerBotonRegistrarProducto(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = interfazRegistroProducto.getCampoCodigo();
                String nombre = interfazRegistroProducto.getCampoNombre();
                String descripcion = interfazRegistroProducto.getCampoDescripcion();
                Double costo = interfazRegistroProducto.getCampoCosto();
                int cantidad = interfazRegistroProducto.getCampoCantidad();


                Producto producto = new Producto(codigo, nombre, descripcion, costo, cantidad);
                try {
                    new DAOProducto().guardarProducto(producto);
                    JOptionPane.showMessageDialog(null, "Producto Registrado Correctamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    interfazRegistroProducto.limpiarCampos();
                    interfazRegistroProducto.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR.. No se puede Guardar el Producto", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void agregarListenersInterfazConsultaProductos() {
        interfazconsultarProductos.agregarColumnaTabla("Codigo Producto");
        interfazconsultarProductos.agregarColumnaTabla("Nombre");
        interfazconsultarProductos.agregarColumnaTabla("Descripcion");

        interfazconsultarProductos.agregarListenerSeleccionTablaProductos(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() != MouseEvent.BUTTON1) {
                    return;
                }
                Object dato = interfazconsultarProductos.getTablaProductos().getValueAt(
                        interfazconsultarProductos.getFilaProductos(), 0);

                Integer codId = Integer.parseInt(dato.toString());

                Producto producto = null;

                try {
                    producto = new DAOProducto().consultarDetalleProducto(codId);
                } catch (Exception ex) {
                    System.out.println("Producto no encontrado");
                }
                if (producto != null) {
                    interfazconsultaDetalleProducto.setCampoCodigo(String.valueOf(producto.getCodigo()));
                    interfazconsultaDetalleProducto.setCampoNombre(producto.getNombre());
                    interfazconsultaDetalleProducto.setCampoDescripcion(producto.getDescripcion());
                    interfazconsultaDetalleProducto.setCampoCosto(String.valueOf(producto.getCosto()));
                    interfazconsultaDetalleProducto.setCampoPopularidad(String.valueOf(producto.getPoularidad()));
                    if (producto.getCantidad() > 0) {
                        interfazconsultaDetalleProducto.setCampoEstado("SI");
                    } else {
                        interfazconsultaDetalleProducto.setCampoEstado("AGOTADO!!!");
                    }

                    cargarTodasLasPublicaciones(dato.toString());
                    interfazconsultaDetalleProducto.setVisible(true);
                }
            }
        });
    }

    private void agregarListenersInterfazConsultaProdCompras() {
        interfazConsultaProdCompras.agregarColumnaTabla("Codigo Producto");
        interfazConsultaProdCompras.agregarColumnaTabla("Nombre");
        interfazConsultaProdCompras.agregarColumnaTabla("Costo");
        interfazListaCompras.agregarColumnaTabla("Nombre");


        interfazConsultaProdCompras.agregarListenerSeleccionTablaProductos(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                interfazListaCompras.limpiarElementosTablaCompras();
                if (e.getButton() != MouseEvent.BUTTON1) {
                    return;
                }
                Object dato = interfazConsultaProdCompras.getTablaProductos().getValueAt(
                        interfazConsultaProdCompras.getFilaProductos(), 0);

                Integer codId = Integer.parseInt(dato.toString());

                Producto producto = null;
                ArrayList<Compra> listaCompras = new ArrayList<Compra>();
                Usuario temporal = null;
                listaCompras = null;
                double costo = 0;
                int cantidad =0;
                double resultado=0;

                try {
                    producto = new DAOProducto().consultarDetalleProducto(codId);
                    listaCompras = new DAOCompra().consultarCompras(producto.getCodigo());
                    for (int i = 0; i < listaCompras.size(); i++) {
                        int codUsuario = listaCompras.get(i).getCodUsuario();
                        temporal = new DAOUsuario().consultarUsuario(codUsuario);
                        interfazListaCompras.agregarElementoTabla(new Object[]{temporal.getNombre()});
                        costo = costo + producto.getCosto();
                    } // for
                    cantidad = producto.getCantidad();
                    
                    resultado = costo/cantidad;

                    interfazListaCompras.setCampoNombreProducto(producto.getNombre());
                    interfazListaCompras.setCamporResultado(String.valueOf(resultado));
                    interfazListaCompras.setVisible(true);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR.. No existen Compras para este Producto", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


    }

    private void mostarListadoProductos() {
        interfazconsultarProductos.limpiarElementosTablaProductos();

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        try {
            listaProductos = new DAOProducto().consultarProductos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR.. No se puede Mostar la informacion  de los Productos", "Informacion", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        for (int i = 0; i < listaProductos.size(); i++) {
            interfazconsultarProductos.agregarElementoTabla(
                    new Object[]{listaProductos.get(i).getCodigo(),
                        listaProductos.get(i).getNombre(),
                        listaProductos.get(i).getDescripcion()});
        }
        interfazconsultarProductos.setVisible(true);

    }

    private void mostarListadoProductosCompras() {
        interfazConsultaProdCompras.limpiarElementosTablaProductos();

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        try {
            listaProductos = new DAOProducto().consultarProductos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR.. No se puede Mostar la informacion  de los Productos", "Informacion", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        for (int i = 0; i < listaProductos.size(); i++) {
            interfazConsultaProdCompras.agregarElementoTabla(
                    new Object[]{listaProductos.get(i).getCodigo(),
                        listaProductos.get(i).getNombre(),
                        listaProductos.get(i).getCosto()});
        }
        interfazConsultaProdCompras.setVisible(true);
    }

    public void cargarTodasLasPublicaciones(String codId) {
        interfazconsultaDetalleProducto.limpiarPanel();
        int tamano = listaPublicaciones.tamano();
        for (int i = 0; i < tamano; i++) {
            Publicacion publicacion = listaPublicaciones.obtieneNuevaPublicacion(i);
            if (publicacion.getCodId().equals(codId)) {
                interfazconsultaDetalleProducto.agregarPanelNuevaPublicacion(publicacion.getMensaje(), publicacion.getFecha(), publicacion.getUsuario_correo());
            }

        }
    }

    public void cargarXmlPublicaciones() {
        File archivo = new File("Publicaciones.xml");
        try {
            if (archivo.exists()) {
                ControlPersistencia persistencia = new ControlPersistencia();
                Document documentoXml = persistencia.crearDocumentoXml(archivo);
                listaPublicaciones.desdeXml(documentoXml.getElementsByTagName(ListaPublicacion.RAIZ_PUBLICACION).item(0));
            } else {
                System.out.println("No hay Datos de Publicaciones");
            }
        } catch (Exception ex) {
            System.out.println("Error al leer lista de publicaciones");
            ex.printStackTrace();
        }
    }
}// end class
