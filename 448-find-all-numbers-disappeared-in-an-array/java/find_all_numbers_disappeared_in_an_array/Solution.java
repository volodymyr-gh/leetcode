package find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> res1 = new Solution().findDisappearedNumbers(nums1);
        assert res1.size() == 2;
        assert res1.get(0) == 5;
        assert res1.get(1) == 6;

        int[] nums2 = new int[] { 1, 1 };
        List<Integer> res2 = new Solution().findDisappearedNumbers(nums2);
        assert res2.size() == 1;
        assert res2.get(0) == 2;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) {
                nums[num - 1] *= -1;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
