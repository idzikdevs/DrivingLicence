package sample;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import pl.idzikdevs.DrivingLicenseProjectIdzik.Food;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory  = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("simple.xml");
        NodeList foodList = doc.getElementsByTagName("food");
        for (int i = 0; i <foodList.getLength() ; i++) {
            Node p = foodList.item(i);
            if(p.getNodeType()==Node.ELEMENT_NODE)
            {
                Element food =(Element) p;
                String name = food.getAttribute("name");
                NodeList nameList = food.getChildNodes();
                for (int j = 0; j <nameList.getLength() ; j++) {
                    Node n = nameList.item(j);
                    if (n.getNodeType()==Node.ELEMENT_NODE)
                    {
                        Element nname = (Element) n;
                        System.out.println(nname.getTagName() + "=" + nname.getTextContent());
                    }
                    
                }
            }


        }

    }
}
