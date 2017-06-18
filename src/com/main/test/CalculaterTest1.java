package com.main.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.main.Calculater;

public class CalculaterTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		float n1=Calculater.add(3.0f, 2.0f);
		System.out.println(n1);
		String s1=""+n1;
		assertEquals("5.0", s1);
	}
	
	@Test
	public void testSub(){
		float n1=Calculater.sub(3.0f, 1.0f);
		System.out.println(n1);
		String s1=""+n1;
		assertEquals("2.0", s1);

	}
	
	@Test
	public void testMul(){
		float n1=Calculater.mul(3.0f, 2.0f);
		System.out.println(n1);
		String s1=""+n1;
		assertEquals("6.0", s1);

	}
	
	@Test
	public void testDiv(){
		float n1=Calculater.div(4.0f, 2.0f);
		System.out.println(n1);
		String s1=""+n1;
		assertEquals("2.0", s1);

	}


}
