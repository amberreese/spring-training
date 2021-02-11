package com.spring.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean condn = true;
		assertTrue(condn);
		assertFalse(condn);
		//assertNotNull();
		//assertNull();
		//assertArrayEquals();
	}

}
