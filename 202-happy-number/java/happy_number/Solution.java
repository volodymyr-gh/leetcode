package happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().isHappy(19);
        assert res1 == true;

        boolean res2 = new Solution().isHappy(2);
        assert res2 == false;

        boolean res3 = new Solution().isHappy(3);
        assert res3 == false;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            int curr = n;
            n = 0;
            while (curr >= 1) {
                int rem = curr % 10;
                n += rem * rem;
                curr /= 10;
            }

            if (seen.contains(n)) return false;
            seen.add(n);
        }

        return true;
    }
}
