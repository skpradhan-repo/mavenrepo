/**
 * 
 */
package org.basic.concurrency.parallel.rowwise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author c5301771
 *
 */
public class RowwiseMatrixMultiplierTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link org.basic.concurrency.parallel.rowwise.RowWiseMatrixMultiplierImpl#multiplyMatrix(int, int)}.
	 */
	@Test
	public void testMultiplyMatrix() {
		int[][] result = new RowWiseMatrixMultiplierImpl().multiplyMatrix(100, 200, 200, 300);
		assertNotNull(result);
		assertEquals(100, result.length);
		assertEquals(300, result[0].length);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
