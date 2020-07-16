package soap.jaxdom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import soap.model.User;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMReader {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:/Users/Kirill/Desktop/anton.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("user");
            User antonUser = new User();
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    antonUser.setName(eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent());
                    antonUser.setName(eElement
                            .getElementsByTagName("empId")
                            .item(0)
                            .getTextContent());   antonUser.setName(eElement
                            .getElementsByTagName("salary")
                            .item(0)
                            .getTextContent());   antonUser.setName(eElement
                            .getElementsByTagName("age")
                            .item(0)
                            .getTextContent());
                }
            }
            System.out.println(antonUser.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
