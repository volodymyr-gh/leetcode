package unique_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1,1,3};
        boolean res1 = new Solution().uniqueOccurrences(arr1);
        assert res1 == true;

        int[] arr2 = {1,2};
        boolean res2 = new Solution().uniqueOccurrences(arr2);
        assert res2 == false;
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> allOccurrences = new HashMap<>();
        for (int num : arr) {
            allOccurrences.put(num, allOccurrences.getOrDefault(num, 0) + 1);
        }

        Set<Integer> uniqueOccurrences = new HashSet<>();
        for (int occurrence : allOccurrences.values()) {
            if (uniqueOccurrences.contains(occurrence)) {
                return false;
            }
            uniqueOccurrences.add(occurrence);
        }

        return true;
    }
}
