package minimum_consecutive_cards_to_pick_up;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] cards1 = { 3,4,2,3,4,7 };
        int res1 = new Solution().minimumCardPickup(cards1);
        assert res1 == 4;

        int[] cards2 = { 1,0,5,3 };
        int res2 = new Solution().minimumCardPickup(cards2);
        assert res2 == -1;

        int[] cards3 = { 95,11,8,65,5,86,30,27,30,73,15,91,30,7,37,26,55,76,60,43,36,85,47,96,6 };
        int res3 = new Solution().minimumCardPickup(cards3);
        assert res3 == 3;
    }

    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> seen = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            int card = cards[i];
            if (seen.containsKey(card)) {
                res = Math.min(res, i - seen.get(card) + 1);
            }
            seen.put(card, i);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
