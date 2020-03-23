/**
 * 
 */
package org.basic.concurrency.parallel.processorwise;

/**
 * @author c5301771
 *
 */
public class MatrixMultiplier implements MatrixMultiplierIntf {

	public int[][] multiplyMatrix(int[][] mat1, int[][] mat2) {
		int rows = mat1.length;
		int processor = Runtime.getRuntime().availableProcessors();
		int steps = rows / processor;
		int start = 0, end = steps;
		int result[][] = new int[rows][mat2[0].length];
		MatrixMultiplierTask task = new MatrixMultiplierTask(mat1, mat2, result, start, end);
		
		for (int i = start; i < end; i++) {
			task.setStart(start);
			task.setEnd(end);
			Thread thread = new Thread(task);
			thread.start();
			start = end;
			if (start == rows) {
				break;
			}
			if(i == processor -2) {
				end = rows;
			}else {
				end += steps;
			}
		}
		return task.getResult();
	}
	
}
