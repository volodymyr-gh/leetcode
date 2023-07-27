package minimum_depth_of_binary_tree;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        int res1 = new Solution().minDepth(root1);
        assert res1 == 2;

        TreeNode root2 = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(4);
        root2.right.right.right = new TreeNode(5);
        root2.right.right.right.right = new TreeNode(6);
        int res2 = new Solution().minDepth(root2);
        assert res2 == 5;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lDepth = minDepth(root.left);
        int rDepth = minDepth(root.right);

        if (lDepth == 0) {
            return rDepth + 1;
        }

        if (rDepth == 0) {
            return lDepth + 1;
        }

        return Math.min(lDepth, rDepth) + 1;
    }
}
