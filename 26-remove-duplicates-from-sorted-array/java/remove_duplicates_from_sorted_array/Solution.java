package remove_duplicates_from_sorted_array;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 1, 2 };
        int res1 = new Solution().removeDuplicates(arr1);
        assert res1 == 2;

        int[] arr2 = new int[] { 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int res2 = new Solution().removeDuplicates(arr2);
        assert res2 == 5;

        int[] arr3 = new int[] { 1, 2 };
        int res3 = new Solution().removeDuplicates(arr3);
        assert res3 == 2;

        int[] arr4 = new int[] { 1, 2, 3, 4, 5, 6 };
        int res4 = new Solution().removeDuplicates(arr4);
        assert res4 == 6;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int i = 0;
        int j = 1;
        while (j < nums.length) {
            int n1 = nums[i];
            int n2 = nums[j];
            if (n2 > n1) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

        return i + 1;
    }
}
