package com.allinpay.testng.sample.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFixture {
	@BeforeTest
	public void setUp() {
		System.out.println("setUp");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd");
		Assert.assertTrue(true);
	}

	@Test(expectedExceptions = IndexOutOfBoundsException.class)
	public void testException() {
		System.out.println("testException");
		new ArrayList<Object>().get(0);
	}

	@Test(enabled = false)
	public void testIgnore() {
		System.out.println("testIgnore");
		Assert.assertTrue(true);
	}

	@Test(timeOut = 1000)
	public void testTimeout() throws Throwable {
		System.out.println("testTimeout");

		// Thread.sleep(2 * 1000);

		Assert.assertTrue(true);
	}

	@AfterTest
	public void tearDown() {
		System.out.println("tearDown");
	}

}
