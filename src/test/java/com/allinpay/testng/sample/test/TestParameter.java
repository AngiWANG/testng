package com.allinpay.testng.sample.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allinpay.testng.sample.Money;

public class TestParameter {
	private static Money f12CHF;

	@BeforeClass
	public static void setUp() {
		f12CHF = new Money(12, "CHF");
	}

	/**
	 * 测试数据构造
	 * 
	 * @return
	 */
	@DataProvider(name = "test1")
	public static Object[][] words() {
		return new Object[][] { { new Money(23, "CHF"), new Money(11, "CHF") },
				{ new Money(28, "CHF"), new Money(16, "CHF") } };
	}

	@Test(dataProvider = "test1")
	public void testAdd(Money expected, Money target) {
		System.out.println("testAdd");
		Assert.assertTrue(expected.getValue() == f12CHF.add(target).getValue());
	}

}
