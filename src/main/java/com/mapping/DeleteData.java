package com.mapping;

import java.awt.geom.QuadCurve2D;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Question;
import com.mapping.Utility.HibernateUtility;

public class DeleteData {
	//Delete data added
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Question delId = session.find(Question.class, 53);
        session.remove(delId);
        
        transaction.commit();
        session.close();
        
        System.out.println("Data deleted");
        
	}

}
