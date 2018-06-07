package progra03.examen03.modelo.entidades;

import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import progra03.librerias.modelo.IXmlGuardable;

public class ListaPublicacion implements IXmlGuardable {

    public static final String RAIZ_PUBLICACION = "Publicaciones";
    // - Atributos -------------------------------------------------------------
    private ArrayList<Publicacion> publicaciones;

    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    public ListaPublicacion() {
        this.publicaciones = new ArrayList<Publicacion>();
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarPublicacion(String codId ,String mensaje, String fecha, String usuario) {
        publicaciones.add(new Publicacion(codId,mensaje, fecha, usuario));
    }

    public Publicacion obtienePublicacion(int indice) {
        return publicaciones.get(indice);
    }

    public int tamano() {
        return publicaciones.size();
    }

    @Override
    public Element haciaXml(Document documentoXml) {
        Element raiz_publicacion = documentoXml.createElement(RAIZ_PUBLICACION);

        for (Publicacion publicacion : publicaciones) {
            raiz_publicacion.appendChild(publicacion.haciaXml(documentoXml));
        }
        return raiz_publicacion;

    }

    @Override
    public void desdeXml(Node nodo) {
        NodeList listaNodosPublicacion = nodo.getChildNodes();

        int tamanoListaNodosPublicacion = listaNodosPublicacion.getLength();
        for (int i = 0; i < tamanoListaNodosPublicacion; i++) {
            Node publicacionNodo = listaNodosPublicacion.item(i);

            Publicacion nuevaPublicacion = new Publicacion();
            nuevaPublicacion.desdeXml(publicacionNodo);
            publicaciones.add(nuevaPublicacion);
        }

    }
    //nuevos metodoss
    public Publicacion obtieneNuevaPublicacion(int index){
        return publicaciones.get(index);
    }
}//end class
