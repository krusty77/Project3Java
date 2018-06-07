/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra03.librerias.modelo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author zev
 */
public interface IXmlGuardable {

    public Element haciaXml(Document documentoXml);

    public void desdeXml(Node nodo);
}
