package com.spring.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Configuration;

public class CreateStudent 
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
			
			//create a student object
			Student student1=new Student("Varun","B","varun.b@outlook.com");
			Student student2=new Student("Mukilan","D","mukilan.d@outlook.com");
			
			
			//start a transaction
			session.beginTransaction();
			
			//save student object
			session.save(student1);
			session.save(student2);
			
			//read a object
//			Student s1=session.get(Student.class, 3);
//			
//			System.out.println(s1);
		
			
			//commit transaction
			session.getTransaction().commit();
		}
		finally
		{
			sessionfactory.close();
		}
		
		
		//

	}

}
