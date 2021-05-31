package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppOneToMany {
	public static void main(String args[])
	{
		SessionFactory fact= new Configuration().configure("OneToMany.cfg.xml").buildSessionFactory();
		System.out.println(fact);
		
		QuesOneToMany qotm= new QuesOneToMany();
		qotm.setQuesId(11);
		qotm.setQuestion("what is java?");
		
		AnsOneToMany aotm1= new AnsOneToMany();
		AnsOneToMany aotm2= new AnsOneToMany();
		AnsOneToMany aotm3= new AnsOneToMany();
		
		aotm1.setAnsId(01);
		aotm1.setAnswer("java is a programing language");
		
		aotm2.setAnsId(02);
		aotm2.setAnswer("java is a purely object orineted programing");
		
		aotm3.setAnsId(03);
		aotm3.setAnswer("java is using many features of oops except mutilple inheritence ");
		
		List<AnsOneToMany> list = new ArrayList ();
		list.add(aotm1);
		list.add(aotm2);
		list.add(aotm3);
		
		qotm.setAns(list);	
		Session s= fact.openSession();
		Transaction tx= s.beginTransaction();
		
		s.save(qotm);
		s.save(aotm1);
		s.save(aotm2);
		s.save(aotm3);
		
		tx.commit();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		QuesOneToMany Q= s.get(QuesOneToMany.class,11);
		System.out.println(Q.getQuestion());
		for (AnsOneToMany a:Q.getAns())
		System.out.println(a.getAnswer());
		for (AnsOneToMany a:Q.getAns())
			System.out.println(a.getAnsId());
		s.close();
		fact.close();
		
	}

}
