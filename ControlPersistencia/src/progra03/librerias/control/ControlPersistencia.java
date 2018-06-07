package progra03.librerias.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import progra03.librerias.modelo.ITextoGuardable;

public class ControlPersistencia {

    // - Atributos -----------------------------------------------------------------
    // - Getters y Setters ---------------------------------------------------------
    // - Constructores -------------------------------------------------------------
    // - Metodos -------------------------------------------------------------------
    public void guardarAArchivoTexto(ITextoGuardable guardable, File archivo)
            throws IOException {
        guardarAArchivoTexto(guardable.haciaTexto(), archivo);
    }

    public void guardarAArchivoTexto(String texto, File archivo)
            throws IOException {
        if (archivo == null) {
            throw new RuntimeException("Archivo igual a null.");
        }

        if (texto == null) {
            throw new RuntimeException("Texto igual a null.");
        }

        FileWriter fileWriter = new FileWriter(archivo);
        fileWriter.write(texto);
        fileWriter.flush();
        fileWriter.close();
    }

    public void leerAArchivoTexto(ITextoGuardable guardable, File archivo)
            throws FileNotFoundException, IOException {
        guardable.desdeTexto(leerAArchivoTexto(archivo));
    }

    public String leerAArchivoTexto(File archivo)
            throws FileNotFoundException, IOException {
        if (archivo == null) {
            throw new RuntimeException("Archivo igual a null.");
        }

        String linea = null;
        String contenido = "";

        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((linea = bufferedReader.readLine()) != null) {
            contenido += linea + "\n";
        }

        bufferedReader.close();
        fileReader.close();

        return contenido;
    }

    // - -----------------------------------------------------------------------
    public void guardarArchivoXml(Node nodo, File archivo) {
        TransformerFactory fabricaTransformadores = null;
        Transformer transformador = null;

        try {
            fabricaTransformadores = TransformerFactory.newInstance();
            transformador = fabricaTransformadores.newTransformer();

//            transformador.setOutputProperty(OutputKeys.METHOD, "xml");
//            transformador.setOutputProperty(OutputKeys.INDENT, "yes");

            transformador.transform(new DOMSource(nodo), new StreamResult(archivo));

        } catch (TransformerConfigurationException configurationException) {
            throw new RuntimeException("No se pueden fabricar transformadores", configurationException);
        } catch (TransformerException transformerException) {
            throw new RuntimeException("No se pueden fabricar transformadores", transformerException);
        }
    }

    public Document crearDocumentoXml(File archivo) {
        DocumentBuilderFactory fabricaConstructoresXml = null;
        DocumentBuilder constructorDocumentoXml = null;
        Document documentoXml = null;
        try {
            fabricaConstructoresXml = DocumentBuilderFactory.newInstance();
            constructorDocumentoXml = fabricaConstructoresXml.newDocumentBuilder();

            if (archivo == null) {
                return constructorDocumentoXml.newDocument();
            } else {
                return constructorDocumentoXml.parse(archivo);
            }

        } catch (SAXException ex) {
            throw new RuntimeException("No se puede parsear el xml", ex);
        } catch (IOException ex) {
            throw new RuntimeException("No se puede abrir el archivo xml", ex);
        } catch (ParserConfigurationException ex) {
            throw new RuntimeException("No se puede configurar el documento xml", ex);
        }
    }
    public Document crearDocumentoXml() {
        return crearDocumentoXml(null);
    }
}
