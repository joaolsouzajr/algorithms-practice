package jlsj.algopract.hr;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    private final BinaryTree tree;

    public LevelOrderTraversal(int n, int[] data) {
        tree = new BinaryTree(n, data);
    }

    public BinaryTree getTree() {
        return tree;
    }

    public String lavelOrder(BinaryTree.Node root) {

        Queue<BinaryTree.Node> queue = new LinkedList<>();

        StringBuilder result = new StringBuilder("");

        if (root != null)
            queue.add(root);


        while (!queue.isEmpty()) {
            BinaryTree.Node tree = queue.remove();
            result.append(tree.data).append(" ");

            if(tree.left != null){
                queue.add(tree.left);
            }
            if(tree.right != null){
                queue.add(tree.right);
            }
        }

        return  result.toString();
    }
}
