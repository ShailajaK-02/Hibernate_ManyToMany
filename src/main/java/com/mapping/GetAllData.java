package com.mapping;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.mapping.Entity.Question;
import com.mapping.Utility.HibernateUtility;

public class GetAllData {
	public static void main(String[] args) {
			//Get all data added
		SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Question> questions  = session.createQuery("select q from Question q ",Question.class).getResultList();
        
        //questions.stream().forEach(a -> System.out.println(questions.toString()));
        
        questions.forEach(q -> {
            System.out.println("Question ID: " + q.getId());
            System.out.println("Question: " + q.getQuestion());
            System.out.println("Answers:");
            
            //It will give ans list 
            q.getAnswerList().stream().forEach(p -> System.out.println(p));
            
            System.out.println("---------------------------------------------------------------------------------------------");
        });
//        
        transaction.commit();
        session.close();
	}
}
