package find_largest_value_in_each_tree_row;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.right.right = new TreeNode(9);
        List<Integer> res1 = new Solution().largestValues(root1);
        assert res1.size() == 3;
        assert res1.get(0) == 1;
        assert res1.get(1) == 3;
        assert res1.get(2) == 9;

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        List<Integer> res2 = new Solution().largestValues(root2);
        assert res2.size() == 2;
        assert res2.get(0) == 1;
        assert res2.get(1) == 3;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            int levelSize = q.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.remove();
                if (curr.val > max) {
                    max = curr.val;
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            res.add(max);
        }

        return res;
    }
}
