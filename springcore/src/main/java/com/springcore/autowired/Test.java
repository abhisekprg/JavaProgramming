package com.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowired/AutoConfig.xml");
		Emp e1= context.getBean("e1", Emp.class);
		System.out.println(e1);		
	}

}
