package binary_tree_zigzag_level_order_traversal;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        List<List<Integer>> res1 = new Solution().zigzagLevelOrder(root1);
        assert res1.size() == 3;
        assert res1.get(0).size() == 1;
        assert res1.get(0).get(0) == 3;
        assert res1.get(1).size() == 2;
        assert res1.get(1).get(0) == 20;
        assert res1.get(1).get(1) == 9;
        assert res1.get(2).size() == 2;
        assert res1.get(2).get(0) == 15;
        assert res1.get(2).get(1) == 7;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean reverse = false;

        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            int levelSize = q.size();
            Integer[] levelAns = new Integer[levelSize];

            for (int i = 0; i < levelSize; i++) {
                int insertPos = reverse ? levelSize - i - 1 : i;
                TreeNode node = q.remove();
                levelAns[insertPos] = node.val;

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            ans.add(Arrays.asList(levelAns));
            reverse = !reverse;
        }

        return ans;
    }
}
