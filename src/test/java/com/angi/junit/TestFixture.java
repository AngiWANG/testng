package com.angi.junit;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestFixture {
	@Before
	public void setUp() {
	}

	@Test
	public void testAdd() {
		assertTrue(true);
	}

	@Ignore("this test method isn't working now")
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}

	@After
	public void tearDown() {
	}

	@Test(timeout = 1000)
	public void testTimeOut() throws InterruptedException {
		// wait(100);
	}

}
