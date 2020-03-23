package org.basic.concurrency.parallel.processorwise;

import static org.junit.Assert.*;

import org.basic.concurrency.util.MatrixUitl;
import org.basic.concurrency.util.MatrixGenerator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatrixMultiplierTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiplyMatrix() {
		int[][] mat1 = MatrixGenerator.geerateMatrix(100, 200);
		int[][] mat2 = MatrixGenerator.geerateMatrix(200, 300);
		int result[][] = new MatrixMultiplier().multiplyMatrix(mat1, mat2);
		assertNotNull(mat1);
		assertNotNull(mat2);
		assertEquals(100, result.length);
		assertEquals(300, result[0].length);
		MatrixUitl.printMatrix(result);
	}

}
