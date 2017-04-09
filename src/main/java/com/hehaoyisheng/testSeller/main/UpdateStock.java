package com.hehaoyisheng.testSeller.main;

public interface UpdateStock {
	boolean minusStock(int stockId, String messageId);
	int addStock();
	boolean plusStock(int stockId); 
}
