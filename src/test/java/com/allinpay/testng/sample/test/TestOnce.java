package com.allinpay.testng.sample.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOnce {
	@BeforeClass
	public static void setUp() {
		System.out.println("setUp");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd");
		Assert.assertTrue(true);
	}

	@Test
	public void testSub() {
		System.out.println("testSub");
		Assert.assertTrue(true);
	}

	@AfterClass
	public static void TearDown() {
		System.out.println("TearDown");
	}

}
