package dota2_senate;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().predictPartyVictory("RD");
        assert res1.equals("Radiant");

        String res2 = new Solution().predictPartyVictory("RDD");
        assert res2.equals("Dire");

        String res3 = new Solution().predictPartyVictory("DDRRR");
        assert res3.equals("Dire");
    }

    public String predictPartyVictory(String senate) {
        int len = senate.length();
        Queue<Integer> dire = new LinkedList<>();
        Queue<Integer> radiant = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if (senate.charAt(i) == 'D') {
                dire.offer(i);
            } else {
                radiant.offer(i);
            }
        }

        while (!dire.isEmpty() && !radiant.isEmpty()) {
            int dIndex = dire.poll();
            int rIndex = radiant.poll();

            if (dIndex < rIndex) {
                dire.offer(dIndex + len);
            } else {
                radiant.offer(rIndex + len);
            }
        }

        return dire.isEmpty() ? "Radiant" : "Dire";
    }
}
