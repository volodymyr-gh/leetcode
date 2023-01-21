package min_stack;

public class Solution {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assert minStack.getMin() == -3;
        minStack.pop();
        assert minStack.top() == 0;
        assert minStack.getMin() == -2;
    }
}

class MinStack {
    private static class StackElement {
        public final int val;
        public final int min;
        public final StackElement next;

        StackElement(int val, int min, StackElement next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    private StackElement head = null;

    public MinStack() {
    }

    public void push(int val) {
        if (head == null) {
            head = new StackElement(val, val, null);
        } else {
            head = new StackElement(val, Math.min(val, head.min), head);
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
