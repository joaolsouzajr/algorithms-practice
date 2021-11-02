package jlsj.algopract.hr;

import jlsj.algopract.hr.BinaryTree.Node;

public class HeightBinaryTree {

	private final BinaryTree tree;

	public int height(Node root) {

		if (root == null || (root.left == null && root.right == null)) {
			return 0;
		}
		Node current = null;
		int h = 0;
		if (root.right != null) {
			current = root.right;
		} else {
			current = root.left;
		}
		h++;
		while (current.right != null || current.left != null) {
			if (current.right != null) {
				current = current.right;
			} else {
				current = current.left;
			}
			h++;
		}
		return h;
	}

	public HeightBinaryTree(int n, int[] data) {
		tree = new BinaryTree(n, data);
	}

	public BinaryTree getTree() {
		return tree;
	}
}
