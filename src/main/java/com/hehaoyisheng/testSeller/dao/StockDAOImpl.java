package com.hehaoyisheng.testSeller.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hehaoyisheng.testSeller.entity.Stock;

@Repository("stockDAO")
public class StockDAOImpl extends AbstractDAO implements StockDAO {

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly=true)
	public int getCount(int commodity_id) {
		String sql = "select commodity_count from Stock as s where s.id=" + commodity_id;
		Session session = getSession();
		Query<Integer> query = session.createQuery(sql, Integer.class);
		int count = query.uniqueResult();
		return count;
	}
	
	@Transactional
	public boolean addStock(Stock stock) {
		Session session = getSession();
		session.save(stock);
		return false;
	}
	
	@Transactional
	public int minusStock(int stockId) {
		int count = getCount(stockId);
		int result = -1;
		if(count > 0){
			String sql = "UPDATE Stock s SET s.commodity_count = s.commodity_count-1 WHERE s.id=" + stockId;
			Session session = getSession();
			result = session.createQuery(sql).executeUpdate();
		}
		return result;
	}

	public int plusStock(int stockId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
