package com.sample.Controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class JunitTestClassTest {
	
	@Test
	public void test() {
		JunitTestClass junit = new JunitTestClass();
		int x = junit.calculate(5);
		assertEquals(25, x);
		//Assert.assertEquals(25, 5);

	}

}
