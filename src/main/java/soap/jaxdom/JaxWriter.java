package soap.jaxdom;

import soap.model.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxWriter {
    public static void main(String[] args) throws JAXBException {
        User anton = new User();
        anton.setName("Anton");
        anton.setEmpId(1);
        anton.setSalary(12000);
        anton.setAge(30);

        File file = new File("C:/Users/Kirill/Desktop/anton.xml");
        JAXBContext context = JAXBContext.newInstance(User.class);


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(anton, System.out);
        marshaller.marshal(anton, file);
    }
}
