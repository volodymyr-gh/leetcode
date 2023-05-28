package maximum_number_of_vowels_in_a_substring_of_given_length;

public class Solution {
    public static void main(String[] args) {
        int res1 = new Solution().maxVowels("abciiidef", 3);
        assert res1 == 3;

        int res2 = new Solution().maxVowels("aeiou", 2);
        assert res2 == 2;

        int res3 = new Solution().maxVowels("leetcode", 3);
        assert res3 == 2;
    }

    public int maxVowels(String s, int k) {
        int len = s.length();

        int maxVowels = 0;
        int currVowels = 0;
        int i = 0;
        int j = 0;
        while (i < len) {
            if (isVowel(s.charAt(i))) currVowels++;
            while (i - j + 1 > k) {
                if (isVowel(s.charAt(j))) currVowels--;
                j++;
            }
            maxVowels = Math.max(maxVowels, currVowels);
            i++;
        }

        return maxVowels;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
