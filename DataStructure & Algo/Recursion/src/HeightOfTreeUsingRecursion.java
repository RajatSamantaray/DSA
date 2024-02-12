class Node {

    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }

}

class BinaryTree {
    Node root;
}

public class HeightOfTreeUsingRecursion {
    public static int getHeightOfTree(Node node) {
        if ( node == null) {
            return 0;
        }
         int leftValue = 1 + getHeightOfTree(node.left);
        int rightValue= 1 + getHeightOfTree(node.right);
        return Math.max(leftValue,rightValue);

    }

    public static void main(String[] args) {
        BinaryTree tree =new BinaryTree();
        tree.root = new Node(6);
        tree.root.left = new Node(5);
        tree.root.left.left =new Node(4);
        tree.root.left.right = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left.left = new Node(12); 
        tree.root.left.left.right = new Node(13);
        System.out.println(getHeightOfTree(tree.root));


    }
}
