package com.tut.com.tuttorial.mavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("Project started...");
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	System.out.println( factory );
    	
    	Student st=new Student();
		/*
		 * st.setId(101); st.setName("Abhi"); st.setCity("banglore");
		 */
    	System.out.println(st);
    	
    	Address add=new Address();
    	add.setCity("kolkata");
    	add.setStreet("street1");
    	add.setOpen(true);
    	add.setX(123.567);
    	add.setAddedDate(new Date());
    	
		/*
		 * FileInputStream fis= new FileInputStream("src/main/java/man_oj.jpg"); byte[]
		 * data= new byte[fis.available()]; fis.read(data); add.setImage(data);
		 */
    	//fis.close();
    	System.out.println(add);
    	Session session=factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(st);
    	session.save(add);
    	tx.commit();
    	session.close();
    }
}
