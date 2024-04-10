package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void testNull() {
		Demo demo = null;
		assertNull(demo);
	}
	
	@Test
	public void testNotNull() {
		Demo demo = new Demo();
		assertNotNull(demo);
	}
	
	@Test 
	public void testArray() {
		int[] a = new int[] {1,2,3};
		int[] b = new int[] {1,2,3};
		assertArrayEquals(a, b);
	}
	@Test
	public void testEvenOdd() {
		Demo demo = new Demo();
		assertTrue(demo.evenOdd(4));
		assertFalse(demo.evenOdd(5));
	}
	
	@Test
	public void testSum() {
		Demo demo = new Demo();
		assertEquals(12, demo.sum(5, 7));
	}
	
	@Test
	public void testSayHello() {
		Demo demo = new Demo();
		assertEquals("Welcome to Junit Testing...", demo.sayHello());
	}
	
	@Test
	public void testMax3() {
		Demo demo = new Demo();
		assertEquals(5, demo.max3(5, 3, 2));
		assertEquals(5, demo.max3(3, 5, 2));
		assertEquals(5, demo.max3(2, 3, 5));
	}

}
