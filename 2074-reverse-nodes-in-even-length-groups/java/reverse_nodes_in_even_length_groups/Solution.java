package reverse_nodes_in_even_length_groups;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next = new ListNode(1);
        head1.next.next.next.next.next.next = new ListNode(7);
        head1.next.next.next.next.next.next.next = new ListNode(3);
        head1.next.next.next.next.next.next.next.next = new ListNode(8);
        head1.next.next.next.next.next.next.next.next.next = new ListNode(4);
        ListNode res1 = new Solution().reverseEvenLengthGroups(head1);
        assert res1.val == 5;
        assert res1.next.val == 6;
        assert res1.next.next.val == 2;
        assert res1.next.next.next.val == 3;
        assert res1.next.next.next.next.val == 9;
        assert res1.next.next.next.next.next.val == 1;
        assert res1.next.next.next.next.next.next.val == 4;
        assert res1.next.next.next.next.next.next.next.val == 8;
        assert res1.next.next.next.next.next.next.next.next.val == 3;
        assert res1.next.next.next.next.next.next.next.next.next.val == 7;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseEvenLengthGroups(ListNode head) {
        if (head == null) {
            return null;
        }

        head.next = reverse(head.next, 2);

        return head;
    }

    private ListNode reverse(ListNode head, int group) {
        if (head == null) {
            return null;
        }

        ListNode tail = head;
        int i = 1;
        for (; i < group; i++) {
            if (tail.next == null) {
                break;
            }
            tail = tail.next;
        }

        if (i % 2 > 0) {
            tail.next = reverse(tail.next, group + 1);
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        for (int j = 0; j < group; j++) {
            if (curr == null) {
                break;
            }

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverse(curr, group + 1);

        return prev;
    }
}
