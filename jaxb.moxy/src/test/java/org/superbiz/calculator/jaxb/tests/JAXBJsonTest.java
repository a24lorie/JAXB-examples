package org.superbiz.calculator.jaxb.tests;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.junit.Test;
import org.superbiz.calculator.jaxb.moxy.model.MyResult;
import org.superbiz.calculator.jaxb.moxy.model.Result;
import org.superbiz.calculator.jaxb.moxy.model.User;

public class JAXBJsonTest {

    @Test
    public void test() 
    {
	JAXBContext jc;
	try {
	    jc = JAXBContext.newInstance(MyResult.class);

	    Result result = new Result();
	    result.setCourse("blah-blah");
	    result.setScore("12.0");
	    
	    User user = new User();
	    user.setEmail("myemail@email.com");
	    user.setName("myname");;
	    
	    MyResult myResult= new MyResult();
	    myResult.setAccountID("123456789");
	    myResult.setResult(result);
	    myResult.setUser(user);
	    
	    Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(myResult, System.out);
	} catch (JAXBException e) {
	    e.printStackTrace();
	}
    }
    
    @Test
    public void testJsonFile() 
    {
	JAXBContext jc;
	try {
	    jc = JAXBContext.newInstance(MyResult.class);

	    Unmarshaller unmarshaller = jc.createUnmarshaller();
	    unmarshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
	    File json = new File("src/test/java/org/superbiz/calculator/jaxb/input.json");
	    Object myResult = unmarshaller.unmarshal(json);

	    Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(myResult, System.out);
	} catch (JAXBException e) {
	    e.printStackTrace();
	}
    }
    
    @Test
    public void testXMLFile() 
    {
	JAXBContext jc;
	try {
	    jc = JAXBContext.newInstance(MyResult.class);

	    Unmarshaller unmarshaller = jc.createUnmarshaller();
	    File json = new File("src/test/java/org/superbiz/calculator/jaxb/input.xml");
	    Object myResult = unmarshaller.unmarshal(json);

	    Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(myResult, System.out);
	} catch (JAXBException e) {
	    e.printStackTrace();
	}
    }
}
