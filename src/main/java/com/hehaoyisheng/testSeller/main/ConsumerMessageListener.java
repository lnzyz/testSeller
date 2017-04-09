package com.hehaoyisheng.testSeller.main;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;

public class ConsumerMessageListener implements MessageListener{

	@Autowired
	@Qualifier("updateStockImpl")
	private UpdateStock updateStock;
	
	public Action consume(Message message, ConsumeContext context) {
		JSONObject data = new JSONObject(message.getBody());
		int stockId = data.getInt("stockId");
		try {
			if(updateStock.minusStock(stockId, message.getMsgID())){
				return Action.ReconsumeLater;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Action.CommitMessage;
	}

}
