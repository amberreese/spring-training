package com.spring.basics.springin10steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.springin10steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn10StepsBasicApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn10StepsBasicApplication.class)){
			
		
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
			
			//This is where scope comes in because by default
			//the beans would be the same, but with scope("prototype")
			//there will be two different beans
			System.out.println(binarySearch);
			System.out.println(binarySearch2);
			
			int result = binarySearch.binarySearch(new int[] {124, 6, 0}, 3);
			
			System.out.print(result);
		}
		
	}

}
