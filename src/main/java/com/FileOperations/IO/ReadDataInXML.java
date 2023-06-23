package com.FileOperations.IO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadDataInXML 
{
	

	public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException  
	{
		//Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
     // Load the input XML document, parse it and return an instance of the
        // Document class.
        Document document = builder.parse(new File("D:\\AutoTestData.xml"));
        
        List<demographics> basicdata = new ArrayList<demographics>();
        
        NodeList nodelist = document.getDocumentElement().getChildNodes();
        
        for(int i = 0 ;  i < nodelist.getLength() ; i++)
        {
        	Node node = nodelist.item(i);
        	
        	if( node.getNodeType() == node.ELEMENT_NODE)
        	{
        		Element elem = (Element)node;
        		
        		//Get the value of item
        		
        		
        		
        		//Get the value of name 
        		
        		String name = elem.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
        		
        		//Get the value of phone
        		
        		String phone = elem.getElementsByTagName("phone").item(0).getChildNodes().item(0).getNodeValue();

        		
        		//Get the value of email
        		
        		String email = elem.getElementsByTagName("email").item(0).getChildNodes().item(0).getNodeValue();

        		
        		//Get the value of currency
        		
        		String currency = elem.getElementsByTagName("currency").item(0).getChildNodes().item(0).getNodeValue();

        		
        		//Get the value of number
        		
        		Double number  = Double.parseDouble(elem.getElementsByTagName("number")
                        .item(0).getChildNodes().item(0).getNodeValue());
        		 
        		 
        		 basicdata.add(new demographics( name,phone, email, currency, number));
        	}
        }
        
        //print all the data 
        
        for(demographics ele : basicdata)
        {
        	System.out.println(ele.toString());
        }

	}

}
