package progra03.examen03.modelo.entidades;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import progra03.librerias.modelo.IXmlGuardable;

public class Publicacion implements IXmlGuardable {

    public static final String PUBLICACION = "Publicacion";
    public static final String CODIGO = "codId";
    public static final String USUARIO = "usuario";
    public static final String MENSAJE = "mensaje";
    public static final String FECHA = "fecha";
    
    // - Atributos -------------------------------------------------------------
    
    private String codId;
    private String usuario_correo;
    private String mensaje;
    private String fecha;

    // - Getters y Setters -----------------------------------------------------
    
    public String getCodId() {
        return codId;
    }

    public void setCodId(String codId) {
        this.codId = codId;
    }  
    
    public String getUsuario_correo() {
        return usuario_correo;
    }

    public void setUsuario_correo(String usuario_correo) {
        this.usuario_correo = usuario_correo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    // - Constructores ---------------------------------------------------------

    public Publicacion() {
    }

    public Publicacion(String codId,String mensaje, String fecha, String usuario_correo) {
        this.codId = codId;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.usuario_correo = usuario_correo;
    }

    // - Metodos ---------------------------------------------------------------

    @Override
    public Element haciaXml(Document documentoXml) {
        Element publicacion = documentoXml.createElement(PUBLICACION);
        publicacion.setAttribute(CODIGO, codId);
        publicacion.setAttribute(USUARIO, usuario_correo);
        publicacion.setAttribute(MENSAJE, mensaje);
        publicacion.setAttribute(FECHA, fecha);

        return publicacion;

    }

    @Override
    public void desdeXml(Node nodo) {
        NamedNodeMap mapaAtributos = nodo.getAttributes();
        codId  = mapaAtributos.getNamedItem(CODIGO).getNodeValue();
        usuario_correo = mapaAtributos.getNamedItem(USUARIO).getNodeValue();
        mensaje = mapaAtributos.getNamedItem(MENSAJE).getNodeValue();
        fecha = mapaAtributos.getNamedItem(FECHA).getNodeValue();
    }
}
