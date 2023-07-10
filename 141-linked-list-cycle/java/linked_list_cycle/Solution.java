package linked_list_cycle;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(3);
        ListNode pos1 = new ListNode(2);
        head1.next = pos1;
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = pos1;
        boolean res1 = new Solution().hasCycle(head1);
        assert res1 == true;

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = head2;
        boolean res2 = new Solution().hasCycle(head2);
        assert res2 == true;

        ListNode head3 = new ListNode(1);
        boolean res3 = new Solution().hasCycle(head3);
        assert res3 == false;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}