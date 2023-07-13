package remove_duplicates_from_sorted_list_ii;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next.next = new ListNode(5);
        ListNode res1 = new Solution().deleteDuplicates(head1);
        assert res1.val == 1;
        assert res1.next.val == 2;
        assert res1.next.next.val == 5;

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(3);
        ListNode res2 = new Solution().deleteDuplicates(head2);
        assert res2.val == 2;
        assert res2.next.val == 3;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            if (curr.val != next.val) {
                prev = curr;
                curr = next;
                continue;
            }

            while (next != null && curr.val == next.val) {
                next = next.next;
            }
            if (prev == null) {
                head = next;
            } else {
                prev.next = next;
            }
            curr = next;
        }

        return head;
    }
}
