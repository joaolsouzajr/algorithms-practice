package jlsj.algopract.hr;

public class BinaryTree {

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private final int n;
    private final int[] data;
    private final Node root;

    public BinaryTree(int n, int[] data) {
        this.n = n;
        this.data = data;
        root = createTree();
    }

    private Node createTree() {
        int t = n;
        BinaryTree.Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, data[i]);
        }
        return root;
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public Node getRoot() {
        return root;
    }
}
