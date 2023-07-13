package swapping_nodes_in_a_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode res1 = new Solution().swapNodes(head1, 2);
        assert res1.val == 1;
        assert res1.next.val == 4;
        assert res1.next.next.val == 3;
        assert res1.next.next.next.val == 2;
        assert res1.next.next.next.next.val == 5;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        while (k > 1) {
            fast = fast.next;
            k--;
        }

        ListNode first = fast;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode second = slow;

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
