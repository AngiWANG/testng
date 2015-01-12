package com.allinpay.testng.sample.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeature {

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

	/**
	 * 超时测试，可以用来测试执行效率和性能<br>
	 * 单位：毫秒
	 * 
	 * @throws InterruptedException
	 */
	@Test(timeOut = 2000)
	public void testTimeOut() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("testTimeOut");
		Assert.assertTrue(true);
	}
}
