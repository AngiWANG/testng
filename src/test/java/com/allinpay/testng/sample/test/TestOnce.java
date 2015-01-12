package com.allinpay.testng.sample.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOnce {

	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(true);
	}

}
