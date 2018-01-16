package stu.napls.problem;

public class P14 {
	
	private int[] nums = { 1, 2, 3, 3, 4, 5, 10 };
	private int target = 3;
	
	public void solution() {
		System.out.println(binarySearch(nums, target));
	}

	/**
	 * @param nums:
	 *            The integer array.
	 * @param target:
	 *            Target to find.
	 * @return: The first position of target. Position starts from 0.
	 */
	public int binarySearch(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length - 1;
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			if (target < nums[mid]) {
				hi = mid - 1;
			} else if (target > nums[mid]) {
				lo = mid + 1;
			} else {
				while (mid > 0 && nums[mid] == nums[mid - 1]) {
					mid--;
				}
				return mid;
			}
		}
		return -1;
	}
}
