package util;

import stu.napls.model.TreeNode;

// "1,2,#,#,3,#,#,"
public class TreeMaker {
	private int index = -1;

	public TreeNode buildTree(String data) {
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
