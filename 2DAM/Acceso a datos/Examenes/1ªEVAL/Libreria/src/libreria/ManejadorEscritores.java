package libreria;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
    
public class ManejadorEscritores extends DefaultHandler {

    ArrayList<Escritores> lista = new ArrayList<Escritores>();
    Escritores e;
    StringBuilder sb = new StringBuilder();

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length);
    }// characters()

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "Libro":
                e = new Escritores();
                lista.add(e);
                e.setIdLibro(attributes.getValue("id"));
                break;
            case "Titulo":
            case "Autor":
                sb.delete(0, sb.length());
                break;
        }
    }// startElement()

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "Titulo":
                e.setTitulo(sb.toString());
                break;
            case "Autor":
                e.setAutor(sb.toString());
                break;
        }
    }// endElement()

    public ArrayList<Escritores> getLista() {
        return lista;
    }// getLista()

}// ManejadorEscritores