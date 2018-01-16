package stu.napls.problem;

import stu.napls.model.TreeNode;

public class P7 {
	public void solution(String tree, TreeNode root) {
		System.out.println(serialize(deserialize(tree)));
	}

	private void param() {
		String tree = "1,2,#,#,3,#,#,";
		TreeNode root = null;
	}

	private int index = -1;

	/**
	 * This method will be invoked first, you should design your own algorithm to
	 * serialize a binary tree which denote by a root node to a string which can be
	 * easily deserialized by your own "deserialize" method later.
	 */
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if (root == null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val + ",");
		sb.append(serialize(root.left));
		sb.append(serialize(root.right));
		return sb.toString();
	}

	/**
	 * This method will be invoked second, the argument data is what exactly you
	 * serialized at method "serialize", that means the data is not given by system,
	 * it's given by your own serialize method. So the format of data is designed by
	 * yourself, and deserialize it here as you serialize it in "serialize" method.
	 */
	public TreeNode deserialize(String data) {
		String[] dataArray = data.split(",");
		return buildTree(dataArray);
	}

	private TreeNode buildTree(String[] dataArray) {
		TreeNode node = null;
		index++;
		if (!dataArray[index].equals("#")) {
			node = new TreeNode(Integer.parseInt(dataArray[index]));
			node.left = buildTree(dataArray);
			node.right = buildTree(dataArray);
		}

		return node;
	}
}
