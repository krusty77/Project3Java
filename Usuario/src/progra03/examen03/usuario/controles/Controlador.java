package progra03.examen03.usuario.controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import progra03.examen03.modelo.controles.DAOCompra;
import progra03.examen03.modelo.controles.DAOProducto;
import progra03.examen03.modelo.controles.DAOUsuario;
import progra03.examen03.modelo.entidades.ListaPublicacion;
import progra03.examen03.modelo.entidades.Producto;
import progra03.examen03.modelo.entidades.Usuario;
import progra03.examen03.usuario.interfaces.InterfazConsultaDetalleProducto;
import progra03.examen03.usuario.interfaces.InterfazConsultarProductos;
import progra03.examen03.usuario.interfaces.InterfazLogin;
import progra03.examen03.usuario.interfaces.InterfazRegistro;
import progra03.librerias.control.ControlPersistencia;

/**
 *
 * @author Beatriz Hernandez
 */
public class Controlador {

    public static final String RAIZ_PUBLICACIONES = "PUBLICACIONES";
    // - Atributos -------------------------------------------------------------   
    private Usuario usuarioLogeado;
    private Producto producto;
    private InterfazLogin interfazLogin;
    private InterfazRegistro interfazRegistro;
    private InterfazConsultarProductos interfazconsultarProductos;
    private InterfazConsultaDetalleProducto interfazconsultaDetalleProducto;
    private ListaPublicacion listaPublicaciones;

    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    public Controlador() {
        inicializarControlador();
        agregarListenersInterfazLogin();
        agregarListenersInterfazRegistro();
        agregarListenersInterfazConsultaProductos();
        agregarListenersInterfazConsultaDetalleProducto();
        cargarXmlPublicaciones();
    }

    // - Metodos ---------------------------------------------------------------
    private void inicializarControlador() {
        usuarioLogeado = new Usuario();
        producto = new Producto();
        interfazLogin = new InterfazLogin();
        interfazRegistro = new InterfazRegistro();
        interfazconsultarProductos = new InterfazConsultarProductos();
        interfazconsultaDetalleProducto = new InterfazConsultaDetalleProducto();
        listaPublicaciones = new ListaPublicacion();

        interfazLogin.setVisible(true);
    }

    private void agregarListenersInterfazLogin() {
        interfazLogin.agregarListenerBotonLogin(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = interfazLogin.getCampoUsuario();
                String password = new String(interfazLogin.getCampoClave());

                usuarioLogeado = null;

                try {
                    usuarioLogeado = new DAOUsuario().realizarLogin(usuario, password);
                } catch (Exception ex) {
                    System.out.println("Usuario no encontrado");
                }
                if (usuarioLogeado != null) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + usuarioLogeado.getNombre(), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    mostarListadoProductos();
                    interfazLogin.dispose();
                } else {
                    interfazLogin.limpiarCampos();
                    JOptionPane.showMessageDialog(null, "ERROR.. Usuario o Password Incorectos", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        interfazLogin.agregarListenerLabelRegistro(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                interfazRegistro.setVisible(true);
                interfazLogin.dispose();
            }
        });
    }

    private void agregarListenersInterfazRegistro() {
        interfazRegistro.agregarListenerBotonRegistrarse(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = interfazRegistro.getCampoNombre();
                String cuentaUsuario = interfazRegistro.getCampoUsuario();
                String password = new String(interfazRegistro.getCampoPassword());
                String pais = interfazRegistro.getCampoPais();
                String correo = interfazRegistro.getCampoCorreo();
                String telefono = interfazRegistro.getCampoTelefono();

                Usuario usuario = new Usuario(nombre, cuentaUsuario, password, pais, correo, telefono);

                try {
                    new DAOUsuario().guardarUsuario(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    interfazLogin.setVisible(true);
                    interfazRegistro.limpiarCampos();
                    interfazRegistro.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR.. No se puede Guardar el Usuario", "Informacion", JOptionPane.ERROR_MESSAGE);
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

                producto = null;

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
                    interfazconsultaDetalleProducto.setCampoComentario("");
                    interfazconsultaDetalleProducto.getCheckMegusta().setSelected(false);

                    if (producto.getCantidad() < 0) {
                        interfazconsultaDetalleProducto.setCampoCantidad("AGOTADO!!!");
                        interfazconsultaDetalleProducto.bloquearCompra();

                    } else {
                        interfazconsultaDetalleProducto.setCampoCantidad(String.valueOf(producto.getCantidad()));
                    }
                    interfazconsultaDetalleProducto.bloquearCampos();
                    interfazconsultaDetalleProducto.setVisible(true);
                }
            }
        });
    }

    private void agregarListenersInterfazConsultaDetalleProducto() {

        interfazconsultaDetalleProducto.agregarListenerBotonComprar(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int codUsuario = usuarioLogeado.getCodId();
                int codProducto = producto.getCodigo();

                try {
                    new DAOCompra().guardarCompra(codUsuario, codProducto);
                    new DAOProducto().actualizarCantidadProducto(codProducto);
                    JOptionPane.showMessageDialog(null, "Compra Realizada  Satisfactoriamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR.. No se puede realizar la Compra", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
                interfazconsultaDetalleProducto.dispose();

            }
        });

        interfazconsultaDetalleProducto.agregarListenerBotonPublicar(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioLogeado.getNombre();
                String mensaje = interfazconsultaDetalleProducto.getCampoComentario();
                String fecha = obtenerFechaActual();
                guardaListaPublicaciones(mensaje, fecha, usuario);
            }
        });

        interfazconsultaDetalleProducto.agregarListenerCheckBoxMegusta(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int codProducto = producto.getCodigo();
                if (interfazconsultaDetalleProducto.getCheckMegusta().isSelected()) {
                    try {
                        new DAOProducto().actualizarDemandaProductosSuma(codProducto);
                        JOptionPane.showMessageDialog(null, "Te gusta este Producto ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception ex) {
                        System.out.println("Error al actualizar Demanda");
                    }
                } else {
                    try {
                        new DAOProducto().actualizarDemandaProductosResta(codProducto);
                        JOptionPane.showMessageDialog(null, "Ya no te gusta este Producto ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception ex) {
                        System.out.println("Error al actualizar Demanda");

                    }
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

    public String obtenerFechaActual() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private void guardaListaPublicaciones(String mensaje, String fecha, String usuario) {
        String codId = String.valueOf(producto.getCodigo());
        listaPublicaciones.agregarPublicacion(codId, mensaje, fecha, usuario);
        guardarXmlPublicaciones();
    }

    private void guardarXmlPublicaciones() {
        File archivo = new File("Publicaciones.xml");
        ControlPersistencia persistencia = new ControlPersistencia();
        Document documentoXml = null;
        Element raiz = null;
        JOptionPane.showMessageDialog(null, "Publicacion Guardada Correctamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        try {
            documentoXml = persistencia.crearDocumentoXml();
            raiz = documentoXml.createElement(RAIZ_PUBLICACIONES);
            documentoXml.appendChild(listaPublicaciones.haciaXml(documentoXml));
            persistencia.guardarArchivoXml(documentoXml, archivo);
        } catch (Exception ex) {
            System.out.println("Error al  Guardar Publicacion en XML");
            ex.printStackTrace();
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
} //end class

