package com.spring.hibernate.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudent {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=new Configuration()
                                     .configure("hibernate.cfg.xml")
                                     .addAnnotatedClass(Student.class)
                                     .buildSessionFactory();	
		
		Session session=sessionfactory.getCurrentSession();
		try
		{
			session.beginTransaction();
			
			List<Student> studentlist=session.createQuery("from Student").list();
			
			for(Student s:studentlist)
			{
				System.out.println(s);
			}
			
			//studentlist=session.createQuery("from Student where lastName='N' or firstName='John'").list();
			
//			for(Student s:studentlist)
//			{
//				System.out.println(s);
//			}
			
//			studentlist=session.createQuery("from Student where email like '%outlook.com'").list();
//
//			for(Student s:studentlist)
//			{
//				System.out.println(s.getFirstName());
//			}
			
			session.getTransaction().commit();
		}
		finally
		{
			sessionfactory.close();
		}
	}

}
