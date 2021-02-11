package com.spring.basics.springin10steps.cdi;

import javax.inject.Named;


@Named
public class SomeCdiDao {
	public int[] getData() {
		return new int[] {5, 89, 100};
	}
}
