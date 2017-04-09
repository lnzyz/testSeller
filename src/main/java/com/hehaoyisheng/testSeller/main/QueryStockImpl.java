package com.hehaoyisheng.testSeller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hehaoyisheng.testSeller.dao.StockDAO;

@Component("quse")
public class QueryStockImpl implements QueryStock {

	@Autowired
	@Qualifier("stockDAO")
	private StockDAO stockDao;
	
	public int queryStockCount(int stockId) {
		return stockDao.getCount(stockId);
	}

}
