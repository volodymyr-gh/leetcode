package online_stock_span;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class StockSpanner {

    private int pricesCount = 0;
    private final Deque<Integer> decreasing = new LinkedList<>();
    private final Map<Integer, Integer> indexes = new HashMap<>();

    public StockSpanner() {
    }

    public int next(int price) {
        this.pricesCount += 1;

        while (!decreasing.isEmpty() && decreasing.peek() <= price) {
            int currPrice = decreasing.pop();
            indexes.remove(currPrice);
        }

        int res;
        if (decreasing.isEmpty()) {
            res = pricesCount;
        } else {
            int indexOfPrevLarger = indexes.get(decreasing.peek());
            res = pricesCount - 1 - indexOfPrevLarger;
        }

        indexes.put(price, pricesCount - 1);
        decreasing.push(price);

        return res;
    }
}

public class Solution {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        assert stockSpanner.next(100) == 1;
        assert stockSpanner.next(80) == 1;
        assert stockSpanner.next(60) == 1;
        assert stockSpanner.next(70) == 2;
        assert stockSpanner.next(60) == 1;
        assert stockSpanner.next(75) == 4;
        assert stockSpanner.next(85) == 6;
    }
}
