/**
 * 
 */
package com.sushil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author sushilkhera
 *
 */

public class MyAppTestCase {

	private static MyApp app = null;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		app = new MyApp();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	/**
	 * Test method for {@link MyApp#addNum(int, int)}.
	 */
	@Test
	public void testAddNum() {
		System.out.println("11111");
		String str= "Junit setup";
	    assertEquals("Junit setup",str);
	    assertEquals("Expected value is 11 ",11,app.addNum(3, 8));
	}
	
	@Test
	public void testAddNum2() {
		System.out.println("22222");
		String str= "I am done with Junit setup";
	    assertEquals("I am done with Junit setup",str);
	}

}
