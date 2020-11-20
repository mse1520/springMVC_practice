package com.board.member.tx;

import org.springframework.context.support.GenericXmlApplicationContext;


public class TXMain {
	
	public static void main(String[] args) {
		String path = "file:src/main/webapp/WEB-INF/spring/*.xml";
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(path);
		ITXService service = context.getBean("TXService", ITXService.class);
		service.insertTx("abcdefgfffg");
		context.close();
	}

}
