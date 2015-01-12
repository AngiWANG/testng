package com.allinpay.testng.sample.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.allinpay.testng.sample.Money;

public class TestSample {

	@Test
	public void testAdd() {
		Money money1 = new Money(2, "test");
		Money money2 = new Money(3, "test");
		Assert.assertEquals(5, money1.add(money2).getValue());
		// assertTrue(true);
	}

}
