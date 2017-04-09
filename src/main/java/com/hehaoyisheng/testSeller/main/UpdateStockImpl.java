package com.hehaoyisheng.testSeller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hehaoyisheng.testSeller.dao.StockDAO;
import com.hehaoyisheng.testSeller.dao.TransDAO;
import com.hehaoyisheng.testSeller.entity.Stock;

@Component("updateStockImpl")
public class UpdateStockImpl implements UpdateStock{

	@Autowired
	@Qualifier("stockDAO")
	private StockDAO stockDAO;
	
	@Autowired
	@Qualifier("transDAO")
	private TransDAO transDAO;

	
	public void setStockDAO(StockDAO stockDAO) {
		this.stockDAO = stockDAO;
	}

	/**
	 * return if did
	 */
	@Transactional
	public boolean minusStock(int stockId, String messageId) {
		if(transDAO.isDid(messageId)){
			return true;
		}
		int result = stockDAO.minusStock(stockId);
		if(result == -1){
			throw new RuntimeException();
		}
		return result != -1;
	}

	public int addStock() {
		Stock stock = new Stock(1, 1, "test", 10);
		System.out.println(stockDAO.addStock(stock));
		return 0;
	}

	public boolean plusStock(int stockId) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
