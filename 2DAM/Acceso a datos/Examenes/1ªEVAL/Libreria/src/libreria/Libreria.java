package libreria;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Libreria {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerConfigurationException, TransformerException {
        File f = new File("editoriales.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        ManejadorLibros m = new ManejadorLibros();
        sp.parse(f, m);
        ArrayList<Libros> lista = m.getLista();
        
        File f2 = new File("escritores.xml");
        SAXParserFactory spfE = SAXParserFactory.newInstance();
        SAXParser spE = spfE.newSAXParser();
        ManejadorEscritores mE = new ManejadorEscritores();
        spE.parse(f2, mE);
        ArrayList<Escritores> listaE = mE.getLista();
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.newDocument();
        Element root = d.createElement("Libreria");
        d.appendChild(root);
        
        for (int i = 0; i < lista.size(); ++i) {
            String id="SIN INFORMACION";
            if (lista.get(i).getLibroId()!=null) {
                id = lista.get(i).getLibroId();
            }
            String idioma ="SIN INFORMACION";
            if (lista.get(i).getIdioma()!=null) {
                idioma = lista.get(i).getIdioma();
            }
            String titulo = "SIN INFORMACION";
            String autor = "SIN INFORMACION";
            for (int j = 0; j < listaE.size(); ++j) {
                if (lista.get(i).getLibroId().equals(listaE.get(j).getIdLibro())) {
                    titulo = listaE.get(j).getTitulo();
                    autor = listaE.get(j).getAutor();                    
                }
            }            
            String tematica ="SIN INFORMACION";
            if (lista.get(i).getTematica()!=null) {
                tematica = lista.get(i).getIdioma();
            }
            String editorial ="SIN INFORMACION";
            if (lista.get(i).getEditorial()!=null) {
                editorial = lista.get(i).getIdioma();
            }
            String fPublicacion ="SIN INFORMACION";
            if (lista.get(i).getEditorial()!=null) {
                fPublicacion = lista.get(i).getFPublicacion();
            }
            
            Element Libro = d.createElement("Libro");
            root.appendChild(Libro);
            
            Attr idLibro = d.createAttribute("id");
            idLibro.setValue(id);
            Libro.setAttributeNode(idLibro);
            
            Attr Idioma = d.createAttribute("idioma");
            Idioma.setValue(idioma);
            Libro.setAttributeNode(Idioma);
            
            Element Titulo = d.createElement("Titulo");
            Text valor = d.createTextNode(titulo);
            Titulo.appendChild(valor);
            Libro.appendChild(Titulo);
            
            Element Autor = d.createElement("Autor");
            Text valor1 = d.createTextNode(autor);
            Autor.appendChild(valor1);
            Libro.appendChild(Autor);
            
            Element Tematica = d.createElement("Tematica");
            Text valor2 = d.createTextNode(tematica);
            Tematica.appendChild(valor2);
            Libro.appendChild(Tematica);
            
            Element Editorial = d.createElement("Editorial");
            Text valor3 = d.createTextNode(editorial);
            Editorial.appendChild(valor3);
            Libro.appendChild(Editorial);
            
            Element FPublicacion = d.createElement("FPublicacion");
            Text valor4 = d.createTextNode(fPublicacion);
            FPublicacion.appendChild(valor4);
            Libro.appendChild(FPublicacion);
        }
        
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        DOMSource ds = new DOMSource(d);
        
        StreamResult sr = new StreamResult(new File("libreria.xml"));
        StreamResult sr1 = new StreamResult(System.out);
        
        t.transform(ds, sr);
        t.transform(ds, sr1);
        
    }// main()

}// Libreria
