package destination_city;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        List<List<String>> paths1 = List.of(
                List.of("London","New York"),
                List.of("New York","Lima"),
                List.of("Lima","Sao Paulo")
        );
        String res1 = new Solution().destCity(paths1);
        assert res1.equals("Sao Paulo");

        List<List<String>> paths2 = List.of(
                List.of("B","C"),
                List.of("D","B"),
                List.of("C","A")
        );
        String res2 = new Solution().destCity(paths2);
        assert res2.equals("A");
    }

    public String destCity(List<List<String>> paths) {
        Set<String> startingPoints = new HashSet<>();
        for (List<String> path : paths) {
            startingPoints.add(path.get(0));
        }

        for (List<String> path: paths) {
            String dest = path.get(1);
            if (!startingPoints.contains(dest)) {
                return dest;
            }
        }

        return null;
    }
}
