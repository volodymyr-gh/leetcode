package find_players_with_zero_or_one_losses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[][] matches1 = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> res1 = new Solution().findWinners(matches1);
        assert res1.get(0).size() == 3;
        assert res1.get(0).get(0) == 1;
        assert res1.get(0).get(1) == 2;
        assert res1.get(0).get(2) == 10;
        assert res1.get(1).size() == 4;
        assert res1.get(1).get(0) == 4;
        assert res1.get(1).get(1) == 5;
        assert res1.get(1).get(2) == 7;
        assert res1.get(1).get(3) == 8;

        int[][] matches2 = {{2,3},{1,3},{5,4},{6,4}};
        List<List<Integer>> res2 = new Solution().findWinners(matches2);
        assert res2.get(0).size() == 4;
        assert res2.get(0).get(0) == 1;
        assert res2.get(0).get(1) == 2;
        assert res2.get(0).get(2) == 5;
        assert res2.get(0).get(3) == 6;
        assert res2.get(1).size() == 0;

        int[][] matches3 = {{1,100000}};
        List<List<Integer>> res3 = new Solution().findWinners(matches3);
        assert res3.get(0).size() == 1;
        assert res3.get(0).get(0) == 1;
        assert res3.get(1).size() == 1;
        assert res3.get(1).get(0) == 100000;
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losers = new HashMap<>(); // player -> num of lost matches

        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            if (!losers.containsKey(winner)) losers.put(winner, 0);
            int loser = matches[i][1];
            losers.put(loser, losers.getOrDefault(loser, 0) + 1);
        }

        List<Integer> winners = new ArrayList<>();
        List<Integer> losersWithOneLoss = new ArrayList<>();
        for (int player : losers.keySet()) {
            int loses = losers.get(player);
            if (loses == 0) {
                winners.add(player);
            } else if (loses == 1) {
                losersWithOneLoss.add(player);
            }
        }

        winners.sort(Integer::compareTo);
        losersWithOneLoss.sort(Integer::compareTo);

        List<List<Integer>> res = new ArrayList<>();
        res.add(winners);
        res.add(losersWithOneLoss);

        return res;
    }
}
