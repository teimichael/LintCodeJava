package stu.napls.problem;

import java.util.ArrayList;
import java.util.List;

public class P15_Permutations {

//	private int[] nums = { 1, 2, 3 };
	private int[] nums = {};
	
	public void solution() {
		System.out.println(permute(nums));
	}

	/*
	 * @param nums: A list of integers.
	 * 
	 * @return: A list of permutations.
	 */
	private int hi;

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums.length == 0) {
			result.add(new ArrayList<>());
		} else {
			hi = nums.length - 1;
			permutation(nums, 0, result);
		}
		return result;
	}

	private void permutation(int[] nums, int k, List<List<Integer>> result) {
		if (k == hi) {
			List<Integer> c = new ArrayList<>();
			for (int i = 0; i <= hi; i++) {
				c.add(nums[i]);
			}
			result.add(c);
		} else {
			for (int j = k; j <= hi; j++) {
				swap(nums, j, k);
				permutation(nums, k + 1, result);
				swap(nums, j, k);
			}
		}
	}

	private void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
