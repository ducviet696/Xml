

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Test1 {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		factory.setNamespaceAware(true);
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			builder.setErrorHandler(new SimpleErrorHandler());
			builder.parse(new InputSource("src\\document.xml"));
			System.out.println("OK - Well-formed XML document");

		}

		catch (ParserConfigurationException | SAXException e) {

		} catch (IOException e) {
			System.out.println("File not found");
		}

	}

}
