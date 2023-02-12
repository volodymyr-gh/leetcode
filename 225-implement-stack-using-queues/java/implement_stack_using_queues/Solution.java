package implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        assert myStack.top() == 2;
        assert myStack.pop() == 2;
        assert myStack.empty() == false;
        assert myStack.top() == 1;
        assert myStack.pop() == 1;
        assert myStack.empty() == true;
    }
}

class MyStack {

    private final Queue<Integer> q1;
    private final Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.element();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
