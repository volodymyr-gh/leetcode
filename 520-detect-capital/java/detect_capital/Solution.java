package detect_capital;

public class Solution {
    public static void main(String[] args) {
        boolean result1 = new Solution().detectCapitalUse("USA");
        assert result1 == true;

        boolean result2 = new Solution().detectCapitalUse("FlaG");
        assert result2 == false;

        boolean result3 = new Solution().detectCapitalUse("Stars");
        assert result3 == true;

        boolean result4 = new Solution().detectCapitalUse("stripes");
        assert result4 == true;
    }

    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }

        boolean isAbbr = Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1));

        if (isAbbr) {
            for (int i = 2; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
