package com.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect //combination of joinPoint(execute..) and Advice
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method call I would intercept
	//execution(* PACKAGE.*.*(..))
	//above: I want to intercept all methods 
	//irrespective of their return type, any class, & any arguments
	
	//execution(* PACKAGE..*(..)) when there are two dots next to each other
	//it will intercept all calls inside the subpackage
	
	//Much for flexible & powerful than the before and after
	@Around("com.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis()- startTime;
		//startTime = x
		//allow execution of method
		//endTime = y
		logger.info("Time taken by {} is {}", joinPoint, timeTaken);
	}
	
	
}
