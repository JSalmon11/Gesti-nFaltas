package leerXML;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Manejador extends DefaultHandler {
    ArrayList<Pais> lista = new ArrayList<Pais>();
    Pais p;
    StringBuilder sb=new StringBuilder();

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "Localidad" :  p=new Pais();
                                lista.add(p);
                                p.setNumero(Integer.parseInt(attributes.getValue("numero")));
                break;
            case "Continente" : 
            case "Pais" : 
            case "Capital" : 
            case "Habitantes" : sb.delete(0, sb.length()); break;
        }
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "Continente" : p.setContinente(sb.toString()); break;
            case "Pais" :       p.setPais(sb.toString()); break;
            case "Capital" :    p.setCapital(sb.toString()); break;
            case "Habitantes" : p.setHabitantes(Integer.parseInt(sb.toString())); break;
        }
    }

    public ArrayList<Pais> getLista() {
        return lista;
    }
    
}// Manejador
