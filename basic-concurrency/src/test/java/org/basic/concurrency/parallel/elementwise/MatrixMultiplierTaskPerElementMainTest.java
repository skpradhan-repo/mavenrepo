package org.basic.concurrency.parallel.elementwise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatrixMultiplierTaskPerElementMainTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateAndMultiplayMatrix() {
		int[][] result = MatrixMultiplierTaskPerElementMain.createAndMultiplayMatrix(100, 200, 200, 300);
		assertNotNull(result);
		assertEquals(100, result.length);
		assertEquals(300, result[0].length);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
