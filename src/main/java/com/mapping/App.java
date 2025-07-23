package com.mapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Answer;
import com.mapping.Entity.Question;
import com.mapping.Utility.HibernateUtility;

public class App 
{
    public static void main( String[] args )
    {
    	//Create / Add details 
    	
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Question q1 = new Question("What is your qualification?");
        Question q2 = new Question("What is your Highest Qualification?");
        
        Answer a1 = new Answer("10th ");
        Answer a2 = new Answer("12th");
        Answer a3 = new Answer("BE");
        
        List<Answer> aList = Arrays.asList(a1,a2,a3);
        
        q1.setAnswerList(aList);
        q2.setAnswerList(aList);
        session.persist(a1);
        session.persist(a2);
        session.persist(a3);
        session.persist(q1);
        session.persist(q2);
     
        transaction.commit();
        session.close();        
    }
}
