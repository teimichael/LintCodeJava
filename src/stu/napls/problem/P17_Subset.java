package stu.napls.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

public class P17_Subset {

	private int[] nums = { 4, 1, 0 };

	public void solution() {
		System.out.println(subsets(nums));
	}

	/*
	 * @param nums: A set of numbers
	 * 
	 * @return: A list of lists
	 */
	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		int index, k;
		List<Integer> l;
		for (int i = 0; i < Math.pow(2, nums.length); i++) {
			index = 0;
			k = i;
			l = new ArrayList<>();
			while (k > 0) {
				if ((k & 1) == 1) {
					l.add(nums[index]);
				}
				k >>= 1;
				index++;
			}
			result.add(l);
		}
		return result;
	}
}
