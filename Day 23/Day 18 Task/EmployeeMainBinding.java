package com.src;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class EmployeeMainBinding 
{
	public static void main(String[] args) {
	employee e=new employee();
		e.setEmpid(3);
		e.setEmpname("hussain");
		e.setEmpaddress("gudur");
		employee e1=new employee();
		e1.setEmpid(12);
		e1.setEmpname("ash");
		e1.setEmpaddress("ap");
try {
		JAXBContext con=JAXBContext.newInstance(employee.class);
	    Marshaller  ms=con.createMarshaller();
	     
			ms.marshal(e,System.out);
			File f=new File("employee.xml");
			ms.marshal(e1,f );
			System.out.println("inserted in to file");
		} catch (JAXBException j) {
			j.printStackTrace();
		}
	    
	
	}
	}


