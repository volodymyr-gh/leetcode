package number_of_recent_calls;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> recent = new LinkedList<>();

    public RecentCounter() {
    }

    public int ping(int t) {
        int threshold = t - 3000;
        while (!recent.isEmpty() && recent.peek() < threshold) {
            recent.poll();
        }

        recent.offer(t);

        return recent.size();
    }
}

public class Solution {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        assert counter.ping(1) == 1;
        assert counter.ping(100) == 2;
        assert counter.ping(3001) == 3;
        assert counter.ping(3002) == 3;
    }
}
