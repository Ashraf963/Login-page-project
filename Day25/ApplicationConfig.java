package com.src;
import java.util.LinkedList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApplicationConfig {
@Bean(name="std")
public Student myStudent() {
	Student s=new Student();
	s.setId(13);
	s.setName("ashraf");
	s.setCity("hyd");
	return s;
}
@Bean(name="cons")
public Student myStudent1() {
	return new Student(10,"hussain","kadapa");
}
@Bean(name="man")
public Manager myManager() {
	Manager m=new Manager();
	m.setId(34);
	m.setName("kumar");
	Department d=new Department();
	d.setDeptid(4);
	d.setDeptname("Development");
	m.setDepartment(d);
	return m;	
}
@Bean(name="con1")
public Manager myManager1() {
	return new Manager(6,"ravi",new Department(12,"Testing"));
}
@Bean(name="emp")
public Employee myEmployee() {
	Employee e=new Employee();
	e.setId(67);
	e.setName("krishna");
	List<Address> a=new LinkedList();
	a.add(new Address("chennai","TN","india"));
	a.add(new Address("mumbai","maharastra","india"));
	e.setAddress(a);
	return e;
	
}
@Bean(name="emp1")
public Employee myEmployee1() {
	Employee e=new Employee();
	e.setId(6);
	e.setName("bansal");
	List<Address> a=new LinkedList();
	Address a1=new Address();
	a1.setCity("hyd");
	a1.setState("telangana");
	a1.setCountry("india");
	a.add(a1);
	Address a2=new Address();
	a2.setCity("noida");
	a2.setState("Up");
	a2.setCountry("india");
	a.add(a2);
	e.setAddress(a);
	return e;
	
}

}