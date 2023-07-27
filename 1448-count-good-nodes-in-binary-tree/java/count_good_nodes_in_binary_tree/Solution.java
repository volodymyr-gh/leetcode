package count_good_nodes_in_binary_tree;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.left.left = new TreeNode(3);
        root1.right = new TreeNode(4);
        root1.right.left = new TreeNode(1);
        root1.right.right = new TreeNode(5);
        int res1 = new Solution().goodNodes(root1);
        assert res1 == 4;

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(2);
        int res2 = new Solution().goodNodes(root2);
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

    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, Integer.MIN_VALUE);
    }

    private int countGoodNodes(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        max = Math.max(max, root.val);
        int res = root.val >= max ? 1 : 0;
        res += countGoodNodes(root.left, max) + countGoodNodes(root.right, max);

        return res;
    }
}
