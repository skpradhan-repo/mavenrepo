/**
 * 
 */
package org.basic.concurrency.parallel.elementwise;

/**
 * @author c5301771
 *
 */
public class MatrixMultiplierTask implements Runnable {
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int[][] getMat2() {
		return mat2;
	}

	public void setMat2(int[][] mat2) {
		this.mat2 = mat2;
	}

	public int[][] getMat1() {
		return mat1;
	}

	public void setMat1(int[][] mat1) {
		this.mat1 = mat1;
	}

	private int row, col;
	private int result[][];
	private int mat2[][];
	private int mat1[][];

	public MatrixMultiplierTask(int row, int col, int mat1[][], int mat2[][], int[][] result) {
		this.row = row;
		this.mat1 = mat1;
		this.mat2 = mat2;
		this.col = col;
		this.result = result;
	}

	public void run() {
		for (int k = 0; k < mat1[0].length; k++) {
			result[row][col] += mat1[row][k] * mat2[k][col];
		}
	}

	public int[][] getResult() {
		return result;
	}

	public void setResult(int[][] result) {
		this.result = result;
	}
	

}
