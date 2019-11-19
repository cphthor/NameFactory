/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namefactory;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class CPRFactoryTest {
	
	public CPRFactoryTest() {
	}
	
	@Before
	public void setUp() {
	}

	/**
	 * Test of createCPR method, of class CPRFactory.
	 */
	@Test
	public void testCreateCPR() throws Exception {
		System.out.println("createCPR");
		CPRFactory instance = new CPRFactory();
		String expResult = "";
		String result = instance.createCPR();
		assertEquals(expResult, result);
	}
	
}
