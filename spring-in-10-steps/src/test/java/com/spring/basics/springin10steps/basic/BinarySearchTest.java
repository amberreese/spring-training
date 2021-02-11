package com.spring.basics.springin10steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.basics.springin10steps.SpringIn10StepsBasicApplication;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn10StepsBasicApplication.class)
public class BinarySearchTest {
	
	//Get this Bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenarios() {
		//call method on binarySearch
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		//check if the value is correct
		assertEquals(3, actualResult);
	}

}
