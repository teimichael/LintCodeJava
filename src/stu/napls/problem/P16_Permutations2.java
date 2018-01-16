package stu.napls.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P16_Permutations2 {

	private int[] nums = { 1, 2, 2 };

	public void solution() {
		System.out.println(permuteUnique(nums));
	}

	/*
	 * @param : A list of integers
	 * 
	 * @return: A list of unique permutations
	 */
	private int hi;

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		if (nums.length == 0) {
			result.add(new ArrayList<>());
		} else {
			hi = nums.length - 1;
			permutation(nums, 0, set);
		}
		result.addAll(set);
		return result;
	}

	private void permutation(int[] nums, int k, HashSet<List<Integer>> set) {
		if (k == hi) {
			List<Integer> c = new ArrayList<>();
			for (int i = 0; i <= hi; i++) {
				c.add(nums[i]);
			}
			set.add(c);
		} else {
			for (int j = k; j <= hi; j++) {
				swap(nums, j, k);
				permutation(nums, k + 1, set);
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
