package clientemarshalling;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Administrador
 */
public class ClienteUnmarshalling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {           
            Clientes clientes = new Clientes(); 
            JAXBContext jaxbContext = JAXBContext.newInstance(clientes.getClass());
            Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
            
            //jaxbUnmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            //Marshal the employees list in file
            clientes = jaxbunmarshaller.unmarshal(new File("clientes.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(ClienteUnmarshalling.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

