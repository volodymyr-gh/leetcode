package remove_duplicates_from_sorted_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        ListNode res1 = new Solution().deleteDuplicates(head1);
        assert res1.val == 1;
        assert res1.next.val == 2;
        assert res1.next.next == null;

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);
        ListNode res2 = new Solution().deleteDuplicates(head2);
        assert res2.val == 1;
        assert res2.next.val == 2;
        assert res2.next.next.val == 3;
        assert res2.next.next.next == null;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            if (next == null) {
                break;
            }

            if (next.val == curr.val) {
                curr.next = next.next == null ? null : next.next;
            } else {
                curr = next;
            }
        }

        return head;
    }
}
