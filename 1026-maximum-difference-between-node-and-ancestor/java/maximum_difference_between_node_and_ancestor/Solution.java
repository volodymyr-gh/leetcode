package maximum_difference_between_node_and_ancestor;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(6);
        root1.left.right.left = new TreeNode(4);
        root1.left.right.right = new TreeNode(7);
        root1.right = new TreeNode(10);
        root1.right.right = new TreeNode(14);
        root1.right.right.left = new TreeNode(13);
        int res1 = new Solution().maxAncestorDiff(root1);
        assert res1 == 7;

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.right.right = new TreeNode(0);
        root2.right.right.left = new TreeNode(3);
        int res2 = new Solution().maxAncestorDiff(root2);
        assert res2 == 3;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return max - min;
        }

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        int left = dfs(root.left, min, max);
        int right = dfs(root.right, min, max);

        return Math.max(left, right);
    }
}
