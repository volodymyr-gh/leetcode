package contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 1 };
        boolean res1 = new Solution().containsDuplicate(arr1);
        assert res1 == true;

        int[] arr2 = new int[] { 1, 2, 3, 4 };
        boolean res2 = new Solution().containsDuplicate(arr2);
        assert res2 == false;

        int[] arr3 = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean res3 = new Solution().containsDuplicate(arr3);
        assert res3 == true;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}