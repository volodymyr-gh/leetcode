package find_lucky_integer_in_an_array;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {2,2,3,4};
        int res1 = new Solution().findLucky(arr1);
        assert res1 == 2;

        int[] arr2 = {1,2,2,3,3,3};
        int res2 = new Solution().findLucky(arr2);
        assert res2 == 3;

        int[] arr3 = {2,2,2,3,3};
        int res3 = new Solution().findLucky(arr3);
        assert res3 == -1;
    }

    public int findLucky(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int res = -1;
        for (int num : arr) {
            if (counts.get(num) == num) {
                res = Math.max(res, num);
            }
        }

        return res;
    }
}
