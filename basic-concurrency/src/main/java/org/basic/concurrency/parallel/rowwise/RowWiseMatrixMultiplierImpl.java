/**
 * 
 */
package org.basic.concurrency.parallel.rowwise;

import java.util.ArrayList;
import java.util.List;

import org.basic.concurrency.util.MatrixGenerator;

/**
 * @author c5301771
 *
 */
public class RowWiseMatrixMultiplierImpl implements RowMatrixMultiplierIntf{


	public int[][] multiplyMatrix(int... value) {
		int[][] mat1 = MatrixGenerator.geerateMatrix(value[0], value[1]);
		int[][] mat2 = MatrixGenerator.geerateMatrix(value[2], value[3]);
		return multiplyMatrix(mat1, mat2,value);
	}

	private int[][] multiplyMatrix(int[][] mat1, int[][] mat2, int... value) {
		int[][] result = new int[value[0]][value[3]];
		RowWiseMatrixMultiplierTask  task = new RowWiseMatrixMultiplierTask(mat1, mat2, result,0);
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < mat1.length; i++) {
			task.setRow(i);
			Thread thread = new Thread(task);
			thread.start();
			threads.add(thread);
			
		}
 		return task.getResult();
	}

	
}
