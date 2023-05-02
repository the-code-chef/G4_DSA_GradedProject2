public class Main {
    public static void main(String[] args) {
        // Creating a complete BST
        BSTToSkewedConverter tree = new BSTToSkewedConverter();
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(55);

        tree.flattenBSTToSkewed(root);
//        System.out.println("Rightly Skewed Tree is as following: ");
        tree.traverseRightSkewed(tree.headNode);
    }
}
