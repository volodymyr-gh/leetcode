package intersection_of_multiple_arrays;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] nums1 = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> res1 = new Solution().intersection(nums1);
        assert res1.size() == 2;
        assert res1.get(0) == 3;
        assert res1.get(1) == 4;

        int[][] nums2 = {{1,2,3},{4,5,6}};
        List<Integer> res2 = new Solution().intersection(nums2);
        assert res2.size() == 0;
    }

    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> counts = new HashMap<>();
        for (int[] arr : nums) {
            for (int n : arr) {
                counts.put(n, counts.getOrDefault(n, 0) + 1);
            }
        }

        for (int key : counts.keySet()) {
            if (counts.get(key) == nums.length) {
                res.add(key);
            }
        }

        Collections.sort(res);

        return res;
    }
}
