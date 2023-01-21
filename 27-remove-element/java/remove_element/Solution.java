package remove_element;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 3, 2, 2, 3 };
        int res1 = new Solution().removeElement(arr1, 3);
        assert arr1[0] == 2;
        assert arr1[1] == 2;
        assert res1 == 2;

        int[] arr2 = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int res2 = new Solution().removeElement(arr2, 2);
        assert arr2[0] == 0;
        assert arr2[1] == 1;
        assert arr2[2] == 3;
        assert arr2[3] == 0;
        assert arr2[4] == 4;
        assert res2 == 5;
    }

    public int removeElement(int[] nums, int val) {
        int removeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                removeCount++;
            } else if (removeCount > 0) {
                nums[i-removeCount] = nums[i];
            }
        }

        return nums.length - removeCount;
    }
}
