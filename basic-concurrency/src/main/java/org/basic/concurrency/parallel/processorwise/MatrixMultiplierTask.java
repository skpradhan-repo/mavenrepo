/**
 * 
 */
package org.basic.concurrency.parallel.processorwise;

/**
 * @author c5301771
 *
 */
public class MatrixMultiplierTask implements Runnable {
	private int[][] mat1;
	private int[][] mat2;
	private int[][] result;
	int start, end;

	public MatrixMultiplierTask(int[][] mat1, int[][] mat2, int[][] result, int start, int end) {
		super();
		this.mat1 = mat1;
		this.mat2 = mat2;
		this.result = result;
		this.start = start;
		this.end = end;
	}

	public void run() {
		for (int i = start; i < end; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				for (int k = 0; k < mat1[i].length; k++) {
					result[i][j] += mat1[i][k] * mat2[k][j];
				}
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

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

}
