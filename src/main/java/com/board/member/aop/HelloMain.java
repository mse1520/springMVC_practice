package com.board.member.aop;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		String path = "file:src/main/webapp/WEB-INF/spring/*.xml";
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(path);
		HelloController controller = context.getBean("helloController", HelloController.class);
		controller.hello("김용현");
		System.out.println();
		controller.goodBye("스프링");
		context.close();
	}

}
