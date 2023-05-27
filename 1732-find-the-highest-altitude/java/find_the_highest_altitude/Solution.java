package find_the_highest_altitude;

public class Solution {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int res = new Solution().largestAltitude(gain);
        assert res == 1;
    }

    public int largestAltitude(int[] gain) {
        int curr = 0;
        int max = curr;

        for (int i = 0; i < gain.length; i++) {
            curr += gain[i];
            if (curr > max) {
                max = curr;
            }
        }

        return max;
    }
}
