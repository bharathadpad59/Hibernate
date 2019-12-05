package com.bharat.hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bharatmaven.Hibernate.Person;

public class Applicationclass {

	public static void main(String[] args) {
		
		
		Laptop l1=new Laptop();
		
		l1.setLid(1002);
		l1.setLname("Dell");
		l1.setLcolor("Blue");
		
		Student s1=new Student();
		s1.setName("Basav");
		s1.setRollno(102);
		s1.setSubject("Science");
		s1.getLaptop().add(l1);
		
		
		
		Configuration cnf=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf=cnf.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	session.save(s1);
    	session.save(l1);
    	
//    	s1=(Student) session.get(Student.class,101);
//    	l1=(Laptop) session.get(Laptop.class, 1001);
    	tx.commit();
    	
    	//System.out.println(s1);

	}

}
