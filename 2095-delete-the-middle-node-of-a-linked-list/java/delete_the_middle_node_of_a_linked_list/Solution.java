package delete_the_middle_node_of_a_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(7);
        head1.next.next.next.next = new ListNode(1);
        head1.next.next.next.next.next = new ListNode(2);
        head1.next.next.next.next.next.next = new ListNode(6);
        ListNode res1 = new Solution().deleteMiddle(head1);
        assert res1.val == 1;
        assert res1.next.val == 3;
        assert res1.next.next.val == 4;
        assert res1.next.next.next.val == 1;
        assert res1.next.next.next.next.val == 2;
        assert res1.next.next.next.next.next.val == 6;

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        ListNode res2 = new Solution().deleteMiddle(head2);
        assert res2.val == 1;
        assert res2.next.val == 2;
        assert res2.next.next.val == 4;

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(1);
        ListNode res3 = new Solution().deleteMiddle(head3);
        assert res3.val == 2;
        assert res3.next == null;

        ListNode head4 = new ListNode(1);
        ListNode res4 = new Solution().deleteMiddle(head4);
        assert res4 == null;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
