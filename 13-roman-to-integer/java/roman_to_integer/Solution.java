package roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int result1 = new Solution().romanToInt("III");
        assert result1 == 3;

        int result2 = new Solution().romanToInt("LVIII");
        assert result2 == 58;

        int result3 = new Solution().romanToInt("MCMXCIV");
        assert result3 == 1994;
    }

    private static final Map<Character, Integer> romanToInt;
    static {
        romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        double prevNum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int num = Solution.romanToInt.get(ch);

            if (num < prevNum) {
                num *= -1;
            }

            prevNum = num;
            result += num;
        }

        return result;
    }
}