public class BSTToSkewedConverter {

    TreeNode root;
    TreeNode prevNode = null;
    TreeNode headNode = null;

    /**
     * Create the Skewed Tree
     *
     * @param root
     */
    void flattenBSTToSkewed(TreeNode root) {
        if (root == null) {
            return;
        }

        flattenBSTToSkewed(root.left);

        if (headNode == null) {
            headNode = root;
        } else {
            prevNode.right = root;
        }
        root.left = null;
        prevNode = root;

        flattenBSTToSkewed(root.right);
    }

    /**
     * Traverse the Right Skewed Tree
     *
     * @param root
     */
    void traverseRightSkewed(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        traverseRightSkewed(root.right);
    }
}
