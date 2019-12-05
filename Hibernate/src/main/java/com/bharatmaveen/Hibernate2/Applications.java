package com.bharatmaveen.Hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Applications {

	public static void main(String[] args) {
		
	
	  
			  Configuration cnf=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
			  SessionFactory sf=cnf.buildSessionFactory(); 
			  Session session=sf.openSession(); 
			  Transaction tx=session.beginTransaction(); 
			  
			  Student s1=(Student) session.get(Student.class, 102);
			  tx.commit();
			 
			  
			  System.out.println(s1);
			  
			  
	}

}
