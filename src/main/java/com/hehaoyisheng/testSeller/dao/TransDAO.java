package com.hehaoyisheng.testSeller.dao;

import com.hehaoyisheng.testSeller.entity.Trans;

public interface TransDAO {
	boolean addTrans(Trans trans);
	boolean isDid(String messageId);
}
