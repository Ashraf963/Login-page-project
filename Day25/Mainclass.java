package com.src;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Mainclass 
{

public static void main(String[] args) {
		
ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
Student s=(Student)context.getBean("std");
System.out.println(s);
System.out.println(" ");
Student s1=(Student)context.getBean("cons");
System.out.println(s1);
System.out.println(" ");
Manager m=(Manager)context.getBean("man");
System.out.println(m);
System.out.println(" ");
Manager m1=(Manager)context.getBean("con1");
System.out.println(m1);
System.out.println(" ");
Employee e=(Employee)context.getBean("emp");
System.out.println(e);
System.out.println(" ");
Employee e1=(Employee)context.getBean("emp1");
System.out.println(e1);
	}

}
