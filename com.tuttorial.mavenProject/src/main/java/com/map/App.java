package com.map;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String args[]) {
		System.out.println("one to one started");
		SessionFactory factory = new Configuration().configure("qa_cnfg.xml").buildSessionFactory();
		System.out.println(factory);

		QuestionAnswer qa1 = new QuestionAnswer();
		QuestionAnswer qa2 = new QuestionAnswer();
		qa1.setAnswerId(345);
		qa1.setAnswer("java is oop language");
		qa2.setAnswerId(987);
		qa2.setAnswer("hibernate is a object relational mapping tool");

		Question q1 = new Question();
		Question q2 = new Question();
		q1.setQuestionId(123);
		q1.setQuestion("what is a java");
		q2.setQuestionId(0665);
		q2.setQuestion("hibernate");
		q1.setQA(qa1);
		q2.setQA(qa2);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(q1);
		s.save(q2);
		s.save(qa1);
		s.save(qa2);

		tx.commit();
		Question Q= (Question) s.get(Question.class, 123);
		System.out.println(Q.getQuestion());
		System.out.println(Q.getQA().getAnswer());
		s.close();
		factory.close();
	}
}
