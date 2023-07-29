package deepest_leaves_sum;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(4);
        root1.left.left.left = new TreeNode(7);
        root1.left.right = new TreeNode(5);
        root1.right = new TreeNode(3);
        root1.right.right = new TreeNode(6);
        root1.right.right.right = new TreeNode(8);
        int res1 = new Solution().deepestLeavesSum(root1);
        assert res1 == 15;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        int res = 0;

        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            int levelSize = q.size();
            int currLevelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.remove();
                currLevelSum += node.val;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            res = currLevelSum;
        }

        return res;
    }
}
