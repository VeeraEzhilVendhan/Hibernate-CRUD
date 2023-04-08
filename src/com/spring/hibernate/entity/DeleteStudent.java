package com.spring.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Configuration;

public class DeleteStudent 
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
			
//			Student mystudent=session.get(Student.class, 1);
//			
//			session.delete(mystudent);	
			
//			session.createQuery("delete from Student").executeUpdate();
			
			session.createQuery("delete from Student where id=5").executeUpdate();
			
			session.getTransaction().commit();
		
		
		}
		finally
		{
			sessionfactory.close();
		}
		
		
		//

	}

}
