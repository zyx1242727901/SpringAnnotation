package com.zyx.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * zhangyuxiao
 * 2020/10/10 14:06
 */
@Aspect
@Component
public class TestAspect {
	@Pointcut("execution(* com.zyx.demo.beans.TestBean.*(..))")
	public void pointCut(){
	}

	@After("pointCut()")
	public void after(){
		System.out.println("after===");
	}
}
