package com.methods.methodexample.XML;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

import java.io.File;

public class DOMWriteEmployeeXML {

    public static void main(String[] args) {
        try {
            // 1. Create DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // 2. Create a new XML document
            Document doc = builder.newDocument();

            // 3. Create root element <employees>
            Element rootElement = doc.createElement("employees");
            doc.appendChild(rootElement);

            // 4. Add first <employee>
            Element employee1 = doc.createElement("employee");
            employee1.setAttribute("id", "101");
            rootElement.appendChild(employee1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("John Doe"));
            employee1.appendChild(name1);

            Element position1 = doc.createElement("position");
            position1.appendChild(doc.createTextNode("Manager"));
            employee1.appendChild(position1);

            Element salary1 = doc.createElement("salary");
            salary1.appendChild(doc.createTextNode("75000"));
            employee1.appendChild(salary1);

            // 5. Add second <employee>
            Element employee2 = doc.createElement("employee");
            employee2.setAttribute("id", "102");
            rootElement.appendChild(employee2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Jane Smith"));
            employee2.appendChild(name2);

            Element position2 = doc.createElement("position");
            position2.appendChild(doc.createTextNode("Developer"));
            employee2.appendChild(position2);

            Element salary2 = doc.createElement("salary");
            salary2.appendChild(doc.createTextNode("65000"));
            employee2.appendChild(salary2);

            // 6. Prepare the transformer to write XML to file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Optional: pretty-print with indentation
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//            transformer.setOutputProperty("{ http://xml.apache.org/xslt }indent-amount", "4");

            DOMSource source = new DOMSource(doc);

            // Output to file
            StreamResult result = new StreamResult(new File("D:\\JAVA-65\\JAVA\\XML\\domfile.xml"));

            // 7. Write the content
            transformer.transform(source, result);

            System.out.println("✅ employees.xml has been created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
