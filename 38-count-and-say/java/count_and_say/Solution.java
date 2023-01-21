package count_and_say;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().countAndSay(1);
        assert res1.equals("1");

        String res2 = new Solution().countAndSay(4);
        assert res2.equals("1211");
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        char[] prevSay = countAndSay(n - 1).toCharArray();

        StringBuilder resultBuilder = new StringBuilder();
        char currChar = prevSay[0];
        int currCount = 1;

        for (int i = 1; i < prevSay.length; i++) {
            if (prevSay[i] != currChar) {
                resultBuilder.append(currCount).append(currChar);
                currChar = prevSay[i];
                currCount = 1;
            } else {
                currCount++;
            }
        }

        resultBuilder.append(currCount).append(currChar);

        return resultBuilder.toString();
    }
}