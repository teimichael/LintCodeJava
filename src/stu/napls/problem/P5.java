package stu.napls.problem;

import java.util.Arrays;

public class P5 {

	public void solution(int k, int[] nums) {
		System.out.println(kthLargestElement(k, nums));

	}

	/*
	 * @param k : description of k
	 * 
	 * @param nums : array of nums
	 * 
	 * @return: description of return
	 */
	public int kthLargestElement(int k, int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
