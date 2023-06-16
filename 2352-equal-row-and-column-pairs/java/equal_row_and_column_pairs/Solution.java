package equal_row_and_column_pairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[][] grid1 = {{3,2,1},{1,7,6},{2,7,7}};
        int res1 = new Solution().equalPairs(grid1);
        assert res1 == 1;

        int[][] grid2 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        int res2 = new Solution().equalPairs(grid2);
        assert res2 == 3;

        int[][] grid3 = {{3,1,2,2},{1,4,4,4},{2,4,2,2},{2,5,2,2}};
        int res3 = new Solution().equalPairs(grid3);
        assert res3 == 3;

        int[][] grid4 = {{13,13},{13,13}};
        int res4 = new Solution().equalPairs(grid4);
        assert res4 == 4;
    }

    public int equalPairs(int[][] grid) {
        int len = grid.length;
        Map<String, Integer> rows = new HashMap<>();
        Map<String, Integer> cols = new HashMap<>();

        for (int i = 0; i < len; i++) {
            String rowKey = createKey(grid[i]);
            rows.put(rowKey, rows.getOrDefault(rowKey, 0) + 1);

            int[] col = new int[len];
            for (int j = 0; j < len; j++) {
                col[j] = grid[j][i];
            }
            String colKey = createKey(col);
            cols.put(colKey, cols.getOrDefault(colKey, 0) + 1);
        }

        int res = 0;
        for (String rowKey : rows.keySet()) {
            if (cols.containsKey(rowKey)) {
                res += rows.get(rowKey) * cols.get(rowKey);
            }
        }

        return res;
    }

    private String createKey(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
            sb.append(',');
        }
        return sb.toString();
    }
}
