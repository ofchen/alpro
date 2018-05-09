package com.test;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.User;

@Transactional @Service
public class TestService {
	
   @Resource	
   private SessionFactory sessionFactory;
   
   public List<?> showUser(){
	  return sessionFactory.getCurrentSession().createQuery("from User").list();
	  
   }
   
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
