package path_crossing;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        boolean res1 = new Solution().isPathCrossing("NES");
        assert res1 == false;

        boolean res2 = new Solution().isPathCrossing("NESWW");
        assert res2 == true;
    }

    public boolean isPathCrossing(String path) {
        char[] moves = path.toCharArray();

        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        int currX = 0;
        int currY = 0;

        for (char move : moves) {
            if (move == 'N') {
                currY++;
            } else if (move == 'E') {
                currX++;
            } else if (move == 'S') {
                currY--;
            } else {
                currX--;
            }

            String currPoint = currX + "," + currY;
            if (visited.contains(currPoint)) {
                return true;
            }

            visited.add(currPoint);
        }

        return false;
    }
}
