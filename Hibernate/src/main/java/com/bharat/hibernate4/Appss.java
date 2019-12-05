package com.bharat.hibernate4;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Appss {

	public static void main(String[] args) 
	{
		Bachalog blog=new Bachalog();
		
		  Configuration cnf=new Configuration().configure().addAnnotatedClass(Bachalog.class); 
		  SessionFactory sf=cnf.buildSessionFactory(); 
		  Session session=sf.openSession(); 
		  Transaction tx=session.beginTransaction(); 
		  
		  
		/*
		 * blog=(Bachalog) session.get(Bachalog.class, 7);
		 * 
		 * tx.commit(); System.out.println(blog);
		 */
		  
		  
		  
//		  Query q1=session.createQuery("from Bachalog");
//		  List<Bachalog> bachalog= q1.list();
//		  
//		  for(int i=0;i<bachalog.size();i++)
//		  {
//			 System.out.println(bachalog.get(i)); 
//		  }
		  
		  
	/*	  Query q1=session.createQuery("from Bachalog where marks>60"); // this is HQL thats why its working or else it will give
		  List<Bachalog> bachalog= q1.list();                           // hashcode values in output. so to use sql see BELOW.....>
		  
		  for(Bachalog b:bachalog)
		  {
			 System.out.println(b); 
		  }    */
		  
		  
		    
		/*
		 * Query q= session.createQuery("from Bachalog where rollno=21"); Bachalog
		 * bachalog = (Bachalog) q.uniqueResult();
		 * 
		 * System.out.println(bachalog);
		 */
		  
		  
// whenever u use select that means u r not getting Bacahlog object because that bachalog object contains entire row so u r calling particular
// coloumn i.e Name(String type),rollno(int type) so u should store it in one variable thats why we use object[] so that it can except 
// every trype of values.
		 
		  
	/*	  Query q2= session.createQuery("select name from Bachalog where rollno=7 ");
		 String s= (String)q2.uniqueResult();
	
		  System.out.println(s);
	*/
		  
		  
		  
		 /* 
		  int b=28;
		  
		  Query q=session.createQuery("select name,rollno,marks from Bachalog where marks>50 and rollno>:b");
		  q.setParameter("b",b);
		  List<Object[]> bachalog=(List<Object[]>) q.list();
		  
		  for(Object[] result :bachalog)
		  
			 // not possible here when u use object[] i.e [] only      System.out.println(result);
			 System.out.println(result[0]+":"+result[1]+":"+result[2]);
		*/
		  
		  
		  
		  
//		  SQLQuery sql=session.createSQLQuery("SELECT * FROM BACHALOG WHERE MARKS > 60 AND ROLLNO>12 ");
//		  
//		  sql.addEntity(Bachalog.class);
//		  List<Bachalog> bachalog=sql.list();
//		  
//		/*
//		 * for(int i=0;i<bachalog.size();i++) { System.out.println(bachalog.get(i)); }
//		 */
//		  
//		  for(Bachalog b:bachalog)
//		  {
//			  System.out.println(b);
//		  }
		  
		  
		  SQLQuery query=session.createSQLQuery("SELECT ROLLNO,NAME FROM BACHALOG ");
		  query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		  
		  List bachalog=query.list();
		  
		  for(Object b:bachalog)
		  {
			  Map m=(Map)b;
			  System.out.println(m.get("name")+":"+m.get("rollno"));
		  }
		  
		  
		  tx.commit();
		  
		  
		
	}  

}
