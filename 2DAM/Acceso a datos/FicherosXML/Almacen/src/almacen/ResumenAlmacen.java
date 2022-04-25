package almacen;

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
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class ResumenAlmacen {
    private static Almacen a;
    private static Contenido c;
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        File f = new File("Almacen.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        Manejador m = new Manejador();
        sp.parse(f, m);
        ArrayList<Almacen> lista = m.getLista();
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.newDocument();
        Element root = d.createElement("Resumen.xml");
        d.appendChild(root);
        
        for (int i = 0; i < lista.size(); ++i) {
            String nombre=lista.get(i).getContenido().getComponente();
            int numCajas=lista.get(i).getNumcajas();
            int unidades=lista.get(i).getContenido().getUnidades();
            int numTotal=numCajas*unidades;
            String pesoKg=lista.get(i).getPeso(); 
            
            Element articulo = d.createElement("Articulo");
            root.appendChild(articulo);
            
            Attr id = d.createAttribute("Nombre");
            id.setValue(nombre);
            articulo.setAttributeNode(id);
            
            Element cajas= d.createElement("cajas");
            Text valor = d.createTextNode(numCajas+"");
            cajas.appendChild(valor);
            articulo.appendChild(cajas);
            
            Element cantidad= d.createElement("cantidad");
            Text valor1 = d.createTextNode(unidades+"");
            cantidad.appendChild(valor1);
            articulo.appendChild(cantidad);
            
            Element total= d.createElement("total");
            Text valor2 = d.createTextNode(numTotal+"");
            total.appendChild(valor2);
            articulo.appendChild(total);
            
            Element peso= d.createElement("peso");
            Text valor3 = d.createTextNode(pesoKg);
            peso.appendChild(valor3);
            articulo.appendChild(peso);
        }
        
        TransformerFactory tf=TransformerFactory.newInstance();
        Transformer t=tf.newTransformer();
        DOMSource ds=new DOMSource(d);

        StreamResult sr=new StreamResult(new File("Resumen.xml"));
        StreamResult sr1=new StreamResult(System.out);

        t.transform(ds, sr);
        t.transform(ds, sr1);
        
    }// main()
    
}// ResumenAlmacen