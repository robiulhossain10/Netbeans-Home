package com.methods.methodexample.XML;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookHandler extends DefaultHandler {

    boolean name;
    boolean department;
    boolean street;
    boolean city;
    boolean postalCode;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (name) {
            System.out.println("Name: " + new String(ch,start,length));
            name = false;
        } else if (department) {
            System.out.println("Departments: " + new String(ch,start,length));
            department = false;
        } else if (street) {
            System.out.println("Street: " + new String(ch,start,length));
            street = false;
        } else if (city) {
            System.out.println("City: " + new String(ch,start,length));
            city = false;
        } else if (postalCode) {
            System.out.println("PostalCode: " + new String(ch,start,length));
            postalCode = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            System.out.println("----------------------");
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            String id = attributes.getValue("id");
            System.out.println("Studeint ID: " + id);
        } else if (qName.equalsIgnoreCase("name")) {
            name = true;
        } else if (qName.equalsIgnoreCase("department")) {
            department = true;
        } else if (qName.equalsIgnoreCase("street")) {
            street = true;
        } else if (qName.equalsIgnoreCase("city")) {
            city = true;
        } else if (qName.equalsIgnoreCase("postalcode")) {
            postalCode = true;
        }
                
    }
    
    
    
}


