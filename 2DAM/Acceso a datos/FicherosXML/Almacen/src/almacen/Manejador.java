package almacen;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Manejador extends DefaultHandler {
    
    ArrayList<Almacen> lista = new ArrayList<Almacen>();
    Almacen a;
    Contenido c;
    StringBuilder sb = new StringBuilder();
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length);
    }// characters()
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "lote":
                a = new Almacen();
                lista.add(a);
                a.setLote(attributes.getValue("id"));
                break;
            case "contenido":
                c= new Contenido();
                break;
            case "numcajas":            
            case "componente":
            case "numserie":
            case "unidades":
            case "peso":            
            case "manipulacion":
                sb.delete(0, sb.length());
                break;
        }
    }// startElement()
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "numcajas":
                a.setNumcajas(Integer.parseInt(sb.toString()));
                break;
            case "componente":
                c.setComponente(sb.toString());
                break;
            case "numserie":
                c.setNumserie(sb.toString());
                break;
            case "unidades":
                c.setUnidades(Integer.parseInt(sb.toString()));
                break;
            case "contenido":
                a.setContenido(c);
                break;
            case "peso":
                a.setPeso(sb.toString());
                break;
            case "manipulacion":
                a.setManipulacion(sb.toString());
                break;
        }
    }// endElement()
    
    public ArrayList<Almacen> getLista() {
        return lista;
    }// getLista()
    
}// Manejador
