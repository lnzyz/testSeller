package com.hehaoyisheng.testSeller.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hehaoyisheng.testSeller.entity.Trans;

@Repository("TransDAO")
public class TransDAOImpl extends AbstractDAO implements TransDAO {
	
	public boolean isDid(String messageId) {
		String sql = "select count(*) from Trans as s where s.message_id='" + messageId + "'";
		Session session = getSession();
		Query<Integer> query = session.createQuery(sql, Integer.class);
		return query.uniqueResult() != 0;
	}

	public boolean addTrans(Trans trans) {
		Session session = getSession();
		return session.save(trans) != null;
	}

}
