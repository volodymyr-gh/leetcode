package implement_queue_using_stacks;

import java.util.Stack;

class MyQueue {

    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> tempStack = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        stack.push(x);

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

public class Solution {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        assert myQueue.peek() == 1;
        assert myQueue.pop() == 1;
        assert myQueue.empty() == false;
    }
}
