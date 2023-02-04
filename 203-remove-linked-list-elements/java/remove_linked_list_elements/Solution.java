package remove_linked_list_elements;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next.next = new ListNode(6);
        ListNode res1 = new Solution().removeElements(head1, 6);
        assert res1 != null;
        assert res1.val == 1;
        assert res1.next.val == 2;
        assert res1.next.next.val == 3;
        assert res1.next.next.next.val == 4;
        assert res1.next.next.next.next.val == 5;

        ListNode head2 = null;
        ListNode res2 = new Solution().removeElements(head2, 1);
        assert res2 == null;

        ListNode head3 = new ListNode(7);
        head3.next = new ListNode(7);
        head3.next.next = new ListNode(7);
        head3.next.next.next = new ListNode(7);
        ListNode res3 = new Solution().removeElements(head3, 7);
        assert res3 == null;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = head;
        ListNode slow = null;
        ListNode fast = head;

        while (fast != null) {
            if (fast.val != val) {
                slow = fast;
                fast = fast.next;
                continue;
            }

            if (slow == null) {
                fast = fast.next;
                newHead = fast;
            } else {
                slow.next = fast.next;
                fast = fast.next;
            }
        }

        return newHead;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
