package stu.napls.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P18_Subset2 {

	private int[] nums = { 1, 2, 2 };

	public void solution() {
		System.out.println(subsetsWithDup(nums));
	}

	/*
	 * @param nums: A set of numbers.
	 * 
	 * @return: A list of lists. All valid subsets.
	 */
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		HashSet<List<Integer>> set = new HashSet<>();
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
			set.add(l);
		}
		result.addAll(set);
		return result;
	}
}
