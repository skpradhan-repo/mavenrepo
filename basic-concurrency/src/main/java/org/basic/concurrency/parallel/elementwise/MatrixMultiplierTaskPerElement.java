/**
 * 
 */
package org.basic.concurrency.parallel.elementwise;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author c5301771
 *
 */
public class MatrixMultiplierTaskPerElement {

	public static int[][] multiplyMatric(int[][] mat1, int[][] mat2) {
		int rows = mat1.length;
		int cols = mat2[0].length;
		int result[][] = new int[rows][cols];
		List<Thread> threads = new ArrayList<Thread>();
		MatrixMultiplierTask task = new MatrixMultiplierTask(0, 0,  mat1, mat2,result);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				task.setRow(i);
				task.setCol(j);
				Thread thread = new Thread(task);
				thread.start();
				threads.add(thread);
				if (threads.size() % 10 == 0) {
					waitForThreads(threads);
				}
			}
		}

		return task.getResult();
	}

	private static void waitForThreads(List<Thread> threads) {
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		threads.clear();
	}

}
