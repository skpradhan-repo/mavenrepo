/**
 * 
 */
package org.basic.concurrency.parallel.rowwise;

/**
 * @author c5301771
 *
 */
public class RowWiseMatrixMultiplierTask implements Runnable {
	private int[][] mat1, mat2, result;
	private int row;

	public RowWiseMatrixMultiplierTask(int[][] mat1, int[][] mat2, int[][] result, int row) {
		super();
		this.mat1 = mat1;
		this.mat2 = mat2;
		this.result = result;
		this.row = row;
	}

	public void run() {
		for (int i = 0; i < mat2[row].length; i++) {
			for (int j = 0; j < mat1[row].length; j++) {
				result[row][i] += mat1[row][j] * mat2[j][i];
			}
		}
	}

	public int[][] getMat1() {
		return mat1;
	}

	public void setMat1(int[][] mat1) {
		this.mat1 = mat1;
	}

	public int[][] getMat2() {
		return mat2;
	}

	public void setMat2(int[][] mat2) {
		this.mat2 = mat2;
	}

	public int[][] getResult() {
		return result;
	}

	public void setResult(int[][] result) {
		this.result = result;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	

}
