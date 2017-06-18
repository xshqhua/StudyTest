package com.main.test;

import static org.junit.Assert.*;

import java.awt.datatransfer.FlavorTable;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.main.Calculater;

public class CalculaterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
//		fail("Not yet iclumplemented");
		float n3=Calculater.add(1.0f, 2.0f);
		System.out.println(n3);
		String s1 = ""+n3;
		assertEquals("3.0",s1);
	}
	@Ignore
	@Test
	public void testSub() {
//		fail("Not yet iclumplemented");
		float n3=Calculater.sub(1.0f, 2.0f);
		System.out.println(n3);
		String s1 = ""+n3;
		assertEquals("-2.0",s1);
	}

}
