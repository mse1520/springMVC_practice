package com.board.member.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TXService implements ITXService{

	@Autowired
	ITXDAO txDao;
	
	/* @Transactional */
	@Override
	public void insertTx(String str) {
		txDao.insertStr30(str);
		txDao.insertStr10(str);
	}
	
}
