


import java.io.IOException;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SimpleErrorHandler implements ErrorHandler {
	private final String ERROR = "ERROR - Not Well-formed!";
    public void warning(SAXParseException e) throws SAXException {
    	System.out.println(ERROR);
        System.out.println("Error Line: "+ e.getLineNumber()+" : "+e.getMessage());
        
    }
    public void error(SAXParseException e) throws SAXException {
    	System.out.println(ERROR);
        System.out.println("Error Line: "+ e.getLineNumber()+" : "+e.getMessage());
    }

    public void fatalError(SAXParseException e) throws SAXException {
    	System.out.println(ERROR);
        System.out.println("Error Line: "+ e.getLineNumber()+" : "+e.getMessage());
    }
    public void fileIO(IOException e) {
    	System.out.println("File not found!!!");
    }
}
