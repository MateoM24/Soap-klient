
package logika;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2017-04-26T22:08:58.549+02:00
 * Generated source version: 3.1.4.redhat-1
 */

@WebFault(name = "NoCartException", targetNamespace = "http://logika/")
public class NoCartException_Exception extends Exception {
    
    private logika.NoCartException noCartException;

    public NoCartException_Exception() {
        super();
    }
    
    public NoCartException_Exception(String message) {
        super(message);
    }
    
    public NoCartException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public NoCartException_Exception(String message, logika.NoCartException noCartException) {
        super(message);
        this.noCartException = noCartException;
    }

    public NoCartException_Exception(String message, logika.NoCartException noCartException, Throwable cause) {
        super(message, cause);
        this.noCartException = noCartException;
    }

    public logika.NoCartException getFaultInfo() {
        return this.noCartException;
    }
}
