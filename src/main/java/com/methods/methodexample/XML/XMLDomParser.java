/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.XML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author A-3
 */
public class XMLDomParser {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("D:\\JAVA-65\\JAVA\\XML\\employee.xml");

            //create a documentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //parse and build Dom tree
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            // get root element 
            System.out.println("root delement: "
                    + doc.getDocumentElement().getNodeName());

            //get list of employee nodes
            NodeList employeeList = doc.getElementsByTagName("employee");

            if (employeeList.getLength() == 0) {
                System.out.println("no employee data found");
                return;
            }

            //loop throgh employee nodes
            for (int i = 0; i < employeeList.getLength(); i++) {
                Node empNode = employeeList.item(i);

                if (empNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element employee = (Element) empNode;

                    String id = employee.getAttribute("id");

//                    String name = employee.getTagName("name",employee);
                    String name = employee.getElementsByTagName("name").item(0).getTextContent().trim();

                    String position = employee.getElementsByTagName("position").item(0).getTextContent().trim();

                    String salary = employee.getElementsByTagName("salary").item(0).getTextContent();

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Position: " + position);
                    System.out.println("Salary: " + salary);
                    System.out.println("----------------------");
                }
            }

        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }

    }
//    private static String getTagValue (String tag,Element element){
//        NodeList nodeList = element.getElementsByTagName(tag);
//        if (nodeList != null && nodeList.getLength() > 0) {
//            Node node = nodeList.item(0);
//            return node.getTextContent().trim();
//        }
//        return "";
//    }
}
