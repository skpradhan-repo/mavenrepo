/**
 * 
 */
package org.basic.concurrency.util;

import java.util.Random;

/**
 * @author c5301771
 *
 */
public class MatrixGenerator {
	public static int[][] geerateMatrix(int row, int column){
		Random random = new Random();
		int[][] result = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				result[i][j] = random.nextInt(100);
			}
		}
		return result;
	}
}
