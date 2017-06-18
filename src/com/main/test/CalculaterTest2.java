package com.main.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.main.Calculater;

@RunWith(Parameterized.class)
public class CalculaterTest2 {
	public float param;
	public float param2;
	public String expected;
	public float param3;
	public float param4;
	public String expected2;
	
	public CalculaterTest2(float param, float param2, String expected,
			float param3, float param4, String expecte2) {
		this.param = param;
		this.param2 = param2;
		this.expected = expected;
		this.param3 = param3;
		this.param4 = param4;
		this.expected2 = expecte2;

	}

	@Parameters
	public static Collection<Object[]> result() {
		return Arrays.asList(new Object[][] { 
			{ 1.0f, 2.0f, "3.0", 5.0f, 3.0f, "2.0" }, 
			{ 1.0f, 2.0f, "3.0", 2.0f, 3.0f, "-1.0" }, 
			
		});
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		float n1 = Calculater.add(param, param2);
		System.out.println(n1);
		String s1 = "" + n1;
		assertEquals(expected, s1);
	}

	@Test
	public void testSub() {
		float n1 = Calculater.sub(param3, param4);
//		float n1 = Calculater.sub(3.0f, 1.0f);
		System.out.println(n1);
		String s1 = "" + n1;
		assertEquals(expected2, s1);

	}

	@Ignore
	@Test
	public void testMul() {
		float n1 = Calculater.mul(3.0f, 2.0f);
		System.out.println(n1);
		String s1 = "" + n1;
		assertEquals("6.0", s1);

	}

	@Ignore
	@Test
	public void testDiv() {
		float n1 = Calculater.div(4.0f, 2.0f);
		System.out.println(n1);
		String s1 = "" + n1;
		assertEquals("2.0", s1);

	}

}
