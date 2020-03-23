/**
 * 
 */
package org.basic.concurrency.util;

/**
 * @author c5301771
 *
 */
public class MatrixUitl {
	public static void printMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
