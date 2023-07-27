package lowest_common_ancestor_of_a_binary_tree;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        TreeNode p1 = new TreeNode(5);
        TreeNode q1 = new TreeNode(1);
        root1.left = p1;
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right = q1;
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(8);
        TreeNode res1 = new Solution().lowestCommonAncestor(root1, p1, q1);
        assert res1 == root1;

        TreeNode root2 = new TreeNode(3);
        TreeNode p2 = new TreeNode(5);
        TreeNode q2 = new TreeNode(4);
        root2.left = p2;
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(2);
        root2.left.right.left = new TreeNode(7);
        root2.left.right.right = q2;
        root2.right = new TreeNode(1);
        root2.right.left = new TreeNode(0);
        root2.right.right = new TreeNode(8);
        TreeNode res2 = new Solution().lowestCommonAncestor(root2, p2, q2);
        assert res2 == p2;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return right == null ? left : right;
    }
}
