/**
 * 
 */
package org.basic.concurrency.serial;

/**
 * @author c5301771
 *
 */
public class MatrixMultiplication {

	public static int[][] multiply(int mat1[][], int mat2[][]) {
		int rows = mat1.length;
		int cols = mat2[0].length;
		int result[][] = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				for (int k = 0; k < mat1[i].length; k++) {
					result[i][j] += mat1[i][k]*mat2[k][j]; 
				}
			}
		}
		return result;
	}
}
