package com.board.member.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	/* 표현식 execution(접근제한자 패키지.클래스.메서드명(디이터형)) */
	//@Pointcut(value = "execution(* com.board. .* .sayHello(..))")
	@Pointcut(value = "execution(* com.board.member.aop. .HelloService .*(*))")
	private void helloPointcut() {}
	
	//advice
	@Before("helloPointcut()")
	public void BeforeLog(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("[LOG: Before] 메서드 이름 : + " + signature.getName());
	}
	@After("execution(* com.board.member.aop. .HelloService .sayHello(..))")
	public void AfterLog(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("[LOG: After] 메서드 이름 : + " + signature.getName());
	}
}
