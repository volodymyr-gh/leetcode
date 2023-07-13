package remove_nth_node_from_end_of_list;

public class Solution {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode res1 = new Solution().removeNthFromEnd(head1, 2);
        assert res1.val == 1;
        assert res1.next.val == 2;
        assert res1.next.next.val == 3;
        assert res1.next.next.next.val == 5;

        ListNode head2 = new ListNode(1);
        ListNode res2 = new Solution().removeNthFromEnd(head2, 1);
        assert res2 == null;

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode res3 = new Solution().removeNthFromEnd(head3, 1);
        assert res3.val == 1;
        assert res3.next == null;

        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        ListNode res4 = new Solution().removeNthFromEnd(head4, 2);
        assert res4.val == 2;
        assert res4.next == null;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        if (fast == null) {
            return slow.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
