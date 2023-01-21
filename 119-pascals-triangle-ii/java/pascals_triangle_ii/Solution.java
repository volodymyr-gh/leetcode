package pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> res1 = new Solution().getRow(3);
        assert res1.size() == 4;
        assert res1.get(0) == 1;
        assert res1.get(1) == 3;
        assert res1.get(2) == 3;
        assert res1.get(3) == 1;

        List<Integer> res2 = new Solution().getRow(1);
        assert res2.size() == 2;
        assert res2.get(0) == 1;
        assert res2.get(1) == 1;

        List<Integer> res3 = new Solution().getRow(0);
        assert res3.size() == 1;
        assert res3.get(0) == 1;
    }

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        }

        List<Integer> prevRow = getRow(rowIndex - 1);
        List<Integer> row = new ArrayList<>();

        row.add(1);
        for (int i = 1; i < prevRow.size(); i++) {
            row.add(prevRow.get(i-1) + prevRow.get(i));
        }
        row.add(1);

        return row;
    }
}
