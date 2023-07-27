package maximum_depth_of_binary_tree;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        int res1 = new Solution().maxDepth(root1);
        assert res1 == 3;

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        int res2 = new Solution().maxDepth(root2);
        assert res2== 2;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);

        return Math.max(lDepth, rDepth) + 1;
    }
}
