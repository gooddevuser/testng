package com.example.testng;

import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

@Test(groups = { "groupTest" })
public class TestDemo2 {

	
	@Test
	public void assertTest2() {
		System.out.println("Assert Test 2");
		assertNull(null);
	}
	
}
