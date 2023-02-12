package summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 0, 1, 2, 4, 5, 7 };
        List<String> res1 = new Solution().summaryRanges(nums1);
        assert res1.size() == 3;
        assert res1.get(0).equals("0->2");
        assert res1.get(1).equals("4->5");
        assert res1.get(2).equals("7");

        int[] nums2 = { 0, 2, 3, 4, 6, 8, 9 };
        List<String> res2 = new Solution().summaryRanges(nums2);
        assert res2.size() == 4;
        assert res2.get(0).equals("0");
        assert res2.get(1).equals("2->4");
        assert res2.get(2).equals("6");
        assert res2.get(3).equals("8->9");

        int[] nums3 = { -5, -4, 8 };
        List<String> res3 = new Solution().summaryRanges(nums3);
        assert res3.size() == 2;
        assert res3.get(0).equals("-5->-4");
        assert res3.get(1).equals("8");

        int[] nums4 = { -2147483648, -2147483647, 2147483647 };
        List<String> res4 = new Solution().summaryRanges(nums4);
        assert res4.size() == 2;
        assert res4.get(0).equals("-2147483648->-2147483647");
        assert res4.get(1).equals("2147483647");
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        int i = 0;
        int j = 1;
        while (i < nums.length) {
            if (j < nums.length && nums[j] - nums[j-1] == 1) {
                j++;
                continue;
            }

            if (nums[i] == nums[j-1]) {
                res.add("" + nums[i]);
            } else {
                res.add(nums[i] + "->" + nums[j-1]);
            }
            i = j;
            j = i + 1;
        }

        return res;
    }
}
