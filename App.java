package com.hibernate.book;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg=new Configuration().addAnnotatedClass(com.hibernate.book.Book.class).configure("hibernate.cfg.xml");
    	StandardServiceRegistryBuilder sb= new StandardServiceRegistryBuilder();
    	sb.applySettings(cfg.getProperties());
    	StandardServiceRegistry registry=sb.build();
    	SessionFactory factory=cfg.buildSessionFactory(registry);
    	
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	
    	
		
//		  Book s=new Book(1212,"Java Fundamentals","ABC publications",5678945);
//		  session.save(s); Book s1=new
//		  Book(1215,"Java Programming","XYZ publications",2658945); session.save(s1);
//		  Book s2=new
//		  Book(1214,"C programming Fundamentals","DRG publications",6365945);
//		  session.save(s2);
		 
    	
		
//		 //Update Query Query updateQuery=session.
//		  createQuery("update Book set isbnNumber=:bno where bookId=:id ");
//		  updateQuery.setLong("bno", 999999); updateQuery.setInteger("id", 1215);
//		  
//		  if(updateQuery.executeUpdate()>0) { System.out.println("Updated!!"); } else {
//		  System.out.println("Not updated!!"); }
		 
		  
//		//Delete query 
//		  Query deleteQuery=session.createQuery("delete from Book where bookId=:id "); 
//		  deleteQuery.setInteger("id", 1212);
//			  
//		  if(deleteQuery.executeUpdate()>0) { 
//			  System.out.println("Deleted!!"); 
//			  } else {
//			  System.out.println("not deleted!!"); 
//			  }
		  
		  
//		  Query selectQuery = session.createQuery("select count(*) from Book");
//			  List<Integer> list= selectQuery.list();
//			 
//			  System.out.println(list.get(0));
    	
    	
    	// Data fetch operation
    		Book e=session.load(Book.class,1214L); 
    		System.out.println(e);
    	
    	t.commit();
    	session.close();
    	
  	
    	
    }

}
