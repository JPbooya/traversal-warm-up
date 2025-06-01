public class TraversalPractice {
    /**
     * Prints the values of the leaf nodes of a tree.
     * 
     * Values are printed from the leftmost leaf to the rightmost. Each value is
     * printed on a new line.
     * 
     * If the input node is null, nothing is printed.
     * 
     * Example:
     * 
     *              9
     *             / \
     *            2   5
     *           / \   \
     *          7   1   3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *          6      0    77
     *         
     * 
     * Output:
     * 6
     * 1
     * 8
     * 0
     * 77
     * 
     * @param node the root of the tree
     */
    public static void printLeafNodes(TreeNode node) {
        if(node == null) return;

        TreeNode current = node;
        if(current.left == null && current.right == null) {
           System.out.println(current.data);
        }
        printLeafNodes(current.left);
        printLeafNodes(current.right);
    }
}
