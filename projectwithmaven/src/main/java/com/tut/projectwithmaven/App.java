package com.tut.projectwithmaven;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started.." );
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        factory.getCurrentSession()
  System.out.println(factory);
  System.out.println(factory.isClosed());
    }
}
