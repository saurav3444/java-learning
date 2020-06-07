package com.sapient.number;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersTest {

	@Test
	public void test1() {

		Numbers num = new Numbers();
		int actual = num.checkPrime(17);
		assertNotNull(actual);
		assertEquals(1, actual);
	}
	
	@Test
	public void test2() {
		
		Numbers num = new Numbers();
		boolean actual = num.checkArmstrong(153);
		assertNotNull(actual);
		assertEquals(true, actual);
	}
	
	@Test
	public void test3() {
		
		Numbers num = new Numbers();
		boolean actual = num.checkPalindrome(121);
		assertNotNull(actual);
		assertEquals(true, actual);
	}

}
