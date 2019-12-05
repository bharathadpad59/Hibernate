
package com.bharatmaven.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      
		
//		  Person person =new Person(); 
//		/*
//		 * // person.setName("Ragul"); //person.setRollno(345); //
//		 * person.setSchool("Tami Nadu College");//session.save(person);  						// DATA INSERTION PROGRAM
//		 */		  
//		  Configuration cnf=new
//		  Configuration().configure().addAnnotatedClass(Person.class); SessionFactory
//		  sf=cnf.buildSessionFactory(); 
//		  Session session=sf.openSession(); 
//		  Transaction tx=session.beginTransaction(); 
//		  
//		  
//		  person=(Person) session.get(Person.class,24); tx.commit();  							// DATA RETRIEVAL PROGRAM
//		  
//		  System.out.println(person);
//		  
		  
		 
		Person person =new Person(); PersonName personname=new PersonName();
		 /* 
		 * personname.setFirstname("Shekharappa");
		 * personname.setMiddlename("Andanappa"); personname.setLastname("Hadpad"); //
		 * DATA INSERTION PROGRAM USING 2 TABLES INTO ONE
		 * person.setPersonname(personname); person.setRollno(10);
		 * person.setSchool("Harihar Public School");
		 */
    	
    	Configuration cnf=new Configuration().configure().addAnnotatedClass(Person.class);
    	SessionFactory sf=cnf.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	//session.save(person);
    	
    	person=(Person) session.get(Person.class,10);
    	//personname =(PersonName)session.get(PersonName.class, i)
    	tx.commit();
    	
    	System.out.println(person);
    	session.close();
    	
    	Session session1=sf.openSession();
    	Transaction tx1=session1.beginTransaction();
    	person=(Person)session1.get(Person.class,10);
    	
    	tx1.commit();
    	System.out.println(person);
    	session1.close();
 
    	
    	
    }
}