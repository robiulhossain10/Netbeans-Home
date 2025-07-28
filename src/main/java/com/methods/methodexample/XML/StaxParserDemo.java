package com.methods.methodexample.XML;

import javax.xml.stream.*;
import java.io.FileInputStream;

public class StaxParserDemo {

    public static void main(String[] args) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("D:\\JAVA-65\\JAVA\\XML\\staxdemo.xml"));

        while (reader.hasNext()) {
            int event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT) {
                String tag = reader.getLocalName();
                if (tag.equals("name")) {
                    System.out.println("Name: " + reader.getElementText());
                } else if (tag.equals("department")) {
                    System.out.println("Department: " + reader.getElementText());
                } else if (tag.equals("city")) {
                    System.out.println("City: " + reader.getElementText());
                    System.out.println("----------");
                }
            }
        }
    }
}
