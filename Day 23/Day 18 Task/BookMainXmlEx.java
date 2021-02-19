package com.src;
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
public class BookMainXmlEx {
	public static void main(String[] args) {
		

		try {
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		    
				DocumentBuilder builder=factory.newDocumentBuilder();
			 Document document= builder.parse(new File("booksminmax.xml"));
	       Element element =document.getDocumentElement();
	System.out.println(element.getNodeName());
	NodeList nl=element.getChildNodes();
	System.out.println(nl.getLength());
	for(int i=0;i<nl.getLength();i++)
	{
		Node n=nl.item(i);
		System.out.println(n.getNodeName()+" "+n.getTextContent());
	}

	} 
	catch (ParserConfigurationException | SAXException | IOException e) {
				e.printStackTrace();
			}
		
		}

	}


