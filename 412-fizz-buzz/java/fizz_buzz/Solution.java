package fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> res1 = new Solution().fizzBuzz(3);
        assert res1.size() == 3;
        assert res1.get(0).equals("1");
        assert res1.get(1).equals("2");
        assert res1.get(2).equals("Fizz");

        List<String> res2 = new Solution().fizzBuzz(5);
        assert res2.size() == 5;
        assert res2.get(0).equals("1");
        assert res2.get(1).equals("2");
        assert res2.get(2).equals("Fizz");
        assert res2.get(3).equals("4");
        assert res2.get(4).equals("Buzz");

        List<String> res3 = new Solution().fizzBuzz(15);
        assert res3.size() == 15;
        assert res3.get(0).equals("1");
        assert res3.get(1).equals("2");
        assert res3.get(2).equals("Fizz");
        assert res3.get(3).equals("4");
        assert res3.get(4).equals("Buzz");
        assert res3.get(5).equals("Fizz");
        assert res3.get(6).equals("7");
        assert res3.get(7).equals("8");
        assert res3.get(8).equals("Fizz");
        assert res3.get(9).equals("Buzz");
        assert res3.get(10).equals("11");
        assert res3.get(11).equals("Fizz");
        assert res3.get(12).equals("13");
        assert res3.get(13).equals("14");
        assert res3.get(14).equals("FizzBuzz");
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String item;
            if (i % 15 == 0) {
                item = "FizzBuzz";
            } else if (i % 5 == 0) {
                item = "Buzz";
            } else if (i % 3 == 0) {
                item = "Fizz";
            } else {
                item = "" + i;
            }
            result.add(item);
        }

        return result;
    }
}
