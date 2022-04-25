package libreria;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ManejadorLibros extends DefaultHandler {
    
    ArrayList<Libros> lista = new ArrayList<Libros>();
    Libros li;
    StringBuilder sb = new StringBuilder();
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length);
    }// characters()
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "Libro":
                li = new Libros();
                lista.add(li);
                li.setLibroId(attributes.getValue("id"));
                li.setTematica(attributes.getValue("tematica"));
                break;
            case "Editorial":
            case "FPublicacion":            
            case "Idioma":
                sb.delete(0, sb.length());
                break;
        }
    }// startElement()
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "Editorial":
                li.setEditorial(sb.toString());
                break;
            case "FPublicacion":
                li.setFPublicacion(sb.toString());
                break;
            case "Idioma":
                li.setIdioma(sb.toString());
                break;
        }
    }// endElement()
    
    public ArrayList<Libros> getLista() {
        return lista;
    }// getLista()
    
}// ManejadorLibros