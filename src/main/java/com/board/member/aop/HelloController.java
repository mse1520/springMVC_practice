package com.board.member.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	@Autowired
	IHelloService helloService;
	
	public void hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}
	
	public void goodBye(String name) {
		System.out.println("HelloController : " + helloService.sayGoodBye(name));
	}
}
