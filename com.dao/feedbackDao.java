package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.feedback;

@Repository
public class feedbackDao {
	@Autowired
	EntityManagerFactory emf;;
  
	public int storefeedback(feedback feed) {
		try {
			EntityManager mgr=emf.createEntityManager();
			EntityTransaction tran=mgr.getTransaction();
			tran.begin();
			mgr.persist(feed);       
			tran.commit();
			return 1;
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
}
}
	public List<feedback> getfeedbackdetails(){
		EntityManager manger=emf.createEntityManager();
		Query qry=manger.createQuery("select f from feedback f");
		List<feedback> listOffeedback=qry.getResultList();
		return listOffeedback;
	}
}
