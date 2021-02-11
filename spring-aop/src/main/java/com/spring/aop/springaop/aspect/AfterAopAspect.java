package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect //combination of joinPoint(execute..) and Advice
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method call I would intercept
	//execution(* PACKAGE.*.*(..))
	//above: I want to intercept all methods 
	//irrespective of their return type, any class, & any arguments
	
	//execution(* PACKAGE..*(..)) when there are two dots next to each other
	//it will intercept all calls inside the subpackage
	
	//Weaving & Weaver
	@AfterReturning(
			value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.businesLayerExecution()",
			returning="result"
			)
	public void after(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	@After(
			value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.businesLayerExecution()")
	public void afterTrhowing(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint);
	}
	
//	@AfterThrowing(
//			value="execution(* com.spring.aop.springaop.business.*.*(..))",
//			throwing="exception"
//			)
//	public void afterTrhowing(JoinPoint joinPoint, Exception exception) {
//		logger.info("{} returned with value {}", joinPoint, exception);
//	}
	
}
