package stu.napls.problem;

import java.util.Arrays;

public class P6{

	public void solution(int[] A, int[] B) {
		System.out.println(mergeSortedArray(A, B));

	}
	
	private void param() {
		int[] A= {1,2,3,4};
		int[] B= {2,4,5,6};
	}

	/*
	 * @param A: sorted integer array A
	 * 
	 * @param B: sorted integer array B
	 * 
	 * @return: A new sorted integer array
	 */
	public int[] mergeSortedArray(int[] A, int[] B) {
		int[] C = concatArray(A, B);
		Arrays.sort(C);
		return C;
	}

	private int[] concatArray(int[] A, int[] B) {
		int[] C = new int[A.length + B.length];
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, A.length, B.length);
		return C;
	}

}
