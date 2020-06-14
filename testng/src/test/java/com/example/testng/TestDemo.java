package com.example.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before starting unit test");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("Before calling test method call");
	}
	
	@Test
	public void helloTestNG() {
		System.out.println("Hello, Test NG");
	}
	
	@Test(groups = { "temporaryTests" })
	public void assertTest() {
		System.out.println("Assert Test");
		assertTrue(true);
	}
	
	@AfterMethod
	public void after() {
		System.out.println("After calling test method call");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After executing all unit test");
	}
	
	

}
