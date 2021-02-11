package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect //combination of joinPoint(execute..) and Advice
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method call I would intercept
	//execution(* PACKAGE.*.*(..))
	//above: I want to intercept all methods 
	//irrespective of their return type, any class, & any arguments
	
	//execution(* PACKAGE..*(..)) when there are two dots next to each other
	//it will intercept all calls inside the subpackage
	
	//Weaving & Weaver
	@Before("com.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		//what to do?
		//Advice
		logger.info("Check for user access");
		logger.info("Allowed execution for {}", joinPoint);
	}
}
