package design_linked_list;

class MyLinkedList {

    private static class Node {
        private int val;
        private Node next;
        Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        Node node = nodeAt(index);
        return node == null ? -1 : node.val;
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        Node tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }

        if (tail == null) {
            addAtHead(val);
        } else {
            tail.next = new Node(val);
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node prevNode = nodeAt(index - 1);
        if (prevNode != null) {
            Node newNode = new Node(val);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node prevNode = nodeAt(index - 1);
        if (prevNode != null) {
            prevNode.next = prevNode.next == null ? null : prevNode.next.next;
        }
    }

    private Node nodeAt(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            if (node == null) {
                return null;
            }
            node = node.next;
        }

        return node;
    }
}

public class Solution {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        int val1 = obj.get(1);
        obj.deleteAtIndex(1);
        int val2 = obj.get(1);
        assert val1 == 2;
        assert val2 == 3;
    }
}
