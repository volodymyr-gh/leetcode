package path_sum;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right = new TreeNode(8);
        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(1);
        boolean res1 = new Solution().hasPathSum(root1, 22);
        assert res1 == true;

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        boolean res2 = new Solution().hasPathSum(root2, 5);
        assert res2 == false;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }
}
