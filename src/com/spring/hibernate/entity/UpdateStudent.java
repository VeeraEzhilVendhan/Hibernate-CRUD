package com.spring.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Configuration;

public class UpdateStudent 
{

	public static void main(String[] args) 
	{
		//create session factory
		SessionFactory sessionfactory = new Configuration()
				                       .configure("hibernate.cfg.xml")
				                       .addAnnotatedClass(Student.class)
				                       .buildSessionFactory();	
		
		//create session
		Session session=sessionfactory.getCurrentSession();
		
		try
		{
			//use session object to save java objects
	
			//start a transaction
//			session.beginTransaction();
//			
//			Student s1=session.get(Student.class, 1);
//			
//			s1.setEmail("change1@gmail.com");
//			
//        	//commit transaction
//			session.getTransaction().commit();
//			
//			session=sessionfactory.getCurrentSession();
//			
//			session.beginTransaction();
//			
//			Student s2=session.get(Student.class, 1);
//			
//			System.out.println(s2);
//			
//			//commit transaction
//			session.getTransaction().commit();
			
			session=sessionfactory.getCurrentSession();			
			session.beginTransaction();
			
			session.createQuery("update Student set email='same@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();
			
			
		}
		finally
		{
			sessionfactory.close();
		}
		
		
		//

	}

}
