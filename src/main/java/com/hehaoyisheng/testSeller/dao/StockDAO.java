package com.hehaoyisheng.testSeller.dao;

import com.hehaoyisheng.testSeller.entity.Stock;

public interface StockDAO {
	int getCount(int commodity_id);
	boolean addStock(Stock stock);
	int minusStock(int stockId);
	int plusStock(int stockId);
}
