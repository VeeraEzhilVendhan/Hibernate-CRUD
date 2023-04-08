package com.spring.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Configuration;

public class ReadStudent 
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
			session.beginTransaction();
			
			Student s1=session.get(Student.class,7);
			
			System.out.println(s1);
			
			session.getTransaction().commit();			
		
		}
		finally
		{
			sessionfactory.close();
		}
		
		
		//

	}

}
