package moving_average_from_data_stream;

import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {

    private final Queue<Integer> queue;
    private final int size;

    public MovingAverage(int size) {
        this.queue = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        queue.offer(val);

        while (queue.size() > size) {
            queue.poll();
        }

        double sum = 0;
        for (int el : queue) {
            sum += el;
        }

        return sum / queue.size();
    }
}

public class Solution {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        assert movingAverage.next(1) == 1.0 / 1;
        assert movingAverage.next(10) == (1.0 + 10.0) / 2;
        assert movingAverage.next(3) == (1.0 + 10.0 + 3.0) / 3;
        assert movingAverage.next(5) == (10.0 + 3.0 + 5.0) / 3;
    }
}
