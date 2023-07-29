package diameter_of_binary_tree;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right = new TreeNode(3);
        int res1 = new Solution().diameterOfBinaryTree(root1);
        assert res1 == 3;

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        int res2 = new Solution().diameterOfBinaryTree(root2);
        assert res2 == 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    private int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lDepth = dfs(root.left);
        int rDepth = dfs(root.right);

        result = Math.max(result, lDepth + rDepth);

        return Math.max(lDepth, rDepth) + 1;
    }
}
