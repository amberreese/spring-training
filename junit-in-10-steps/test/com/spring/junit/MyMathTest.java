package com.spring.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath(); 
	
	@Before //runs before every test
	public void before() {
		System.out.println("Before");
		
	}
	
	@After //runs after every test
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass //runs once before the test starts
	public static void beforeClass() {
		System.out.println("Before Class");
		
	}
	
	@AfterClass //runs once after all test finish 
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}
	
	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		assertEquals(3,  myMath.sum(new int[] {3}));
	}

}
