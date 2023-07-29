package binary_tree_right_side_view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.right = new TreeNode(5);
        root1.right = new TreeNode(3);
        root1.right.right = new TreeNode(4);
        List<Integer> res1 = new Solution().rightSideView(root1);
        assert res1.size() == 3;
        assert res1.get(0) == 1;
        assert res1.get(1) == 3;
        assert res1.get(2) == 4;

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(3);
        List<Integer> res2 = new Solution().rightSideView(root2);
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.remove();
                if (i == levelSize - 1) {
                    res.add(node.val);
                }

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return res;
    }
}
