package itroxml.crearXML;

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

public class CreacionXML {
  public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
    DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
    DocumentBuilder db=dbf.newDocumentBuilder();
    Document d=db.newDocument();
    Element root=d.createElement("Concesionario");
    d.appendChild(root);
    
    for(int i=1;i<=3;i++){
    Element coche=d.createElement("Coche");
    root.appendChild(coche);
    Attr id=d.createAttribute("id");
    id.setValue(String.valueOf(i));
    coche.setAttributeNode(id);
    
    Element marca=d.createElement("Marca");
    Text valor=d.createTextNode("Renault");
    marca.appendChild(valor);
    coche.appendChild(marca);
    
    Element modelo=d.createElement("Modelo");
    modelo.appendChild(d.createTextNode("Scenic"));
    coche.appendChild(modelo);
    
    Element cc=d.createElement("cc");
    cc.appendChild(d.createTextNode("1.9"));
    coche.appendChild(cc);
    }
    
    TransformerFactory tf=TransformerFactory.newInstance();
    Transformer t=tf.newTransformer();
    DOMSource ds=new DOMSource(d);
    
    StreamResult sr=new StreamResult(new File("Coches.xml"));
    StreamResult sr1=new StreamResult(System.out);
    
    t.transform(ds, sr);
    t.transform(ds, sr1);
    
    }
}