package stu.napls.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import stu.napls.model.TreeNode;
import util.TreeMaker;

public class P11 {
	public void solution(TreeNode root, int k1, int k2) {
		System.out.println(searchRange(root, k1, k2));
	}

	private void param() {
		TreeMaker tm = new TreeMaker();
		TreeNode root = tm.buildTree("20,8,4,#,#,12,#,#,22,#,#,");
	}

	/*
	 * @param root: param root: The root of the binary search tree
	 * 
	 * @param k1: An integer
	 * 
	 * @param k2: An integer
	 * 
	 * @return: return: Return all keys that k1<=key<=k2 in ascending order
	 */
	public List<Integer> searchRange(TreeNode root, int k1, int k2) {

		List<Integer> result = new ArrayList<>();
		traversal(root, k1, k2, result);
		Collections.sort(result);
		return result;
	}

	private void traversal(TreeNode root, int k1, int k2, List<Integer> result) {
		if (root == null) {
			return;
		}
		if (root.val >= k1 && root.val <= k2) {
			result.add(root.val);
		}
		traversal(root.left, k1, k2, result);
		traversal(root.right, k1, k2, result);
	}
}
