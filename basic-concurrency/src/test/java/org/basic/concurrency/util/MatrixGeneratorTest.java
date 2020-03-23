/**
 * 
 */
package org.basic.concurrency.util;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author c5301771
 *
 */
public class MatrixGeneratorTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public static void testMatrixGenerator() {
		int result[][] = MatrixGenerator.geerateMatrix(10, 20);
		assertNotNull(result);
		assertEquals(10, result.length);
		assertEquals(20, result[0].length);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
