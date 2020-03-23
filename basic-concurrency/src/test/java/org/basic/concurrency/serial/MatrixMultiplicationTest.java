package org.basic.concurrency.serial;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.logging.Logger;

import org.basic.concurrency.util.MatrixGenerator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatrixMultiplicationTest {
	private static Logger LOG;

	@Before
	public void setUp() throws Exception {
		LOG = Logger.getLogger(this.getClass().getName());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiply() {
		int[][] mat1 = MatrixGenerator.geerateMatrix(100, 200);
		int mat2[][] =  MatrixGenerator.geerateMatrix(200, 300);
		Date start = new Date();
		int[][] result = MatrixMultiplication.multiply(mat1, mat2);
		Date end = new Date();
		LOG.info("Time taken to execute : "+ (end.getTime()-start.getTime()));
		assertNotNull(result);
		assertEquals(100,result.length);
		assertEquals(300, result[0].length);
	}

}
