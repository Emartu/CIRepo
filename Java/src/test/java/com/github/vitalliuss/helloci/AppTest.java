package com.github.vitalliuss.helloci;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;


public class AppTest {

	@Test
	public void testShoudBePassed() {
		assertTrue(true);
	}

	/*@Test
	public void testShouldBeFailed() {
		assertTrue(false);
	}*/

	@Ignore("Not implemented yet")
	@Test
	public void testShouldBeSKipped() {
		assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}
}
/**/
/*+2*/