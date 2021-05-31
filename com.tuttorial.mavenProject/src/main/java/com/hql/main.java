package com.hql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class main {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hql.cfg.xml").buildSessionFactory();
		System.out.println(factory);

		Question Q1 = new Question();
		Question Q2 = new Question();
		Q1.setqId(12);
		Q1.setQues("what is java?");
		Q2.setqId(43);
		Q2.setQues("What is hibernate?");

		Answer A1 = new Answer();
		Answer A2 = new Answer();
		Answer A3 = new Answer();
		A1.setaId(01);
		A1.setAns("oops language");
		A2.setaId(02);
		A2.setAns("hibernate");
		A3.setaId(03);
		A3.setAns("it is an orm tool");
		List<Question> list1 = new ArrayList();
		list1.add(Q1);
		list1.add(Q2);
		List<Answer> list2 = new ArrayList();
		list2.add(A1);
		list2.add(A2);
		list2.add(A3);
		Q1.setA(list2);
		A1.setQuestion(list1);
		A3.setQuestion(list1);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(Q1);
		s.save(Q2);
		s.save(A1);
		s.save(A2);
		s.save(A3);
		tx.commit();
		
		String query="from Question as N where N.qId=:c";
		
		Query<Question> q=s.createQuery(query);
		q.setParameter("c",43);
		List <Question> list=q.list();
		for(Question Q:list)
		{
			System.out.println(Q.getQues());
		}
		
		
		  Transaction x = s.beginTransaction();
		  Query<Question> q1=s.createQuery("update from Question set ques='java Program' where id=12"); 
		  int r=q1.executeUpdate(); 
		  // x.commit();
		  
		  NativeQuery<Question> nq= s.createSQLQuery("Select * from Question");
		  List<Question> l =nq.list();
		  for(Question z:l)
		  {
			  System.out.println("------------"+z.getQues());
		  }
		s.close();
		factory.close();
	}

}
