/**
 * 
 */
package org.basic.concurrency.parallel.elementwise;

import java.util.Date;
import java.util.logging.Logger;

import org.basic.concurrency.util.MatrixGenerator;

/**
 * @author c5301771
 *
 */
public class MatrixMultiplierTaskPerElementMain {
	private static final Logger LOGGER = Logger.getLogger(MatrixMultiplierTaskPerElementMain.class.getName());
	public static int[][] createAndMultiplayMatrix(int rows1, int cols1, int rows2, int cols2) {
		int mat1[][] = MatrixGenerator.geerateMatrix(rows1, cols1);
		int mat2[][] = MatrixGenerator.geerateMatrix(rows2, cols2);
		Date startTime = new Date();
		int[][] result = MatrixMultiplierTaskPerElement.multiplyMatric(mat1, mat2);
		Date endTime = new Date();
		LOGGER.info("Total time taken : "+ (endTime.getTime()-startTime.getTime()));
		return result;
	}
}
