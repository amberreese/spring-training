package com.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void businesLayerExecution() {}
	
	@Pointcut("com.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.spring.aop.springaop.aspect.CommonJoinPointConfig.businesLayerExecution()")
	public void allLayerExecution(){}
	
	@Pointcut("bean(*dao*)")
	//@Pointcut("bean(*Dao*)") - containing DAO
	//@Pointcut("bean(Dao*)") - starting with DAO
	public void beanContainingDao() {}
	
	@Pointcut("within(com.spring.aop.springaop.data..*)")
	//within this package intercept all the calls
	public void dataLayerExecutionWithWithin(){}
	
	@Pointcut("@annotation(com.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
