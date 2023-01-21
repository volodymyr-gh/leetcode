package pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> res1 = new Solution().generate(5);
        assert res1.get(0).get(0) == 1;
        assert res1.get(1).get(0) == 1;
        assert res1.get(1).get(1) == 1;
        assert res1.get(2).get(0) == 1;
        assert res1.get(2).get(1) == 2;
        assert res1.get(2).get(2) == 1;
        assert res1.get(3).get(0) == 1;
        assert res1.get(3).get(1) == 3;
        assert res1.get(3).get(2) == 3;
        assert res1.get(3).get(3) == 1;
        assert res1.get(4).get(0) == 1;
        assert res1.get(4).get(1) == 4;
        assert res1.get(4).get(2) == 6;
        assert res1.get(4).get(3) == 4;
        assert res1.get(4).get(4) == 1;

        List<List<Integer>> res2 = new Solution().generate(1);
        assert res1.get(0).get(0) == 1;
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<List<Integer>> result = new ArrayList<>();
            result.add(row);

            return result;
        }

        List<List<Integer>> prevTriangle = generate(numRows - 1);

        List<Integer> prevRow = prevTriangle.get(prevTriangle.size() - 1);
        List<Integer> row = new ArrayList<>();

        row.add(1);
        for (int i = 1; i < prevRow.size(); i++) {
            row.add(prevRow.get(i-1) + prevRow.get(i));
        }
        row.add(1);

        prevTriangle.add(row);

        return prevTriangle;
    }
}
