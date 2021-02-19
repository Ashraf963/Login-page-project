package com.src;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dao.CustomerDao;
import com.model.Customer;
public class MainClass 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao cusdao= (CustomerDao) context.getBean("cusdao")
		int status=cusdao.saveCustomer(new Customer(5,"ashraf","nlr"));
		if(status>0)
			System.out.println("values inserted");
		else
			System.out.println("unsucuessfil insertion");
		status=cusdao.deleteCustomer(new Customer(2,"",""));
		
		if(status>0)
			System.out.println("values updated");
		else
			System.out.println("unsucuessful updation");

		boolean status1=cusdao.saveCustomerbyPs(new Customer(4,"hussain","chennai"));
		
		if(!status1)
			System.out.println("values inserted by prepared statement");
		else
			System.out.println("unsucuessfil insertion by preparedstatement");
		
		
boolean status2=cusdao.UpdateCustomer(new Customer(15,"ash",""));
		if(!status2)
			System.out.println("updated");
		else
			System.out.println("not updated");
		
		
		List<Customer> l=cusdao.getEmployee();
		for(Customer c: l)
		{
			System.out.println(c);
		}
		/**Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(l);
		}**/
		
	}

}

