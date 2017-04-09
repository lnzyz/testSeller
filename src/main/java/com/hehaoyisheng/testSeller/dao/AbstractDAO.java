package com.hehaoyisheng.testSeller.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO {
	@Autowired
	protected SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
