package com.springcore.spEl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spEl/spElConfig.xml");
		Emp e1= context.getBean("emp", Emp.class);
		System.out.println(e1);
		System.out.println(e1.getAddress());
		System.out.println(e1.getAddress().getClass().getName());
		System.out.println(e1.getFeesStructure());
		System.out.println(e1.getFeesStructure().getClass().getName());
		Emp e2= context.getBean("emp", Emp.class);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
 