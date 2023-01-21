package reverse_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode res1 = new Solution().reverseList(head1);
        assert res1.val == 5;
        assert res1.next.val == 4;
        assert res1.next.next.val == 3;
        assert res1.next.next.next.val == 2;
        assert res1.next.next.next.next.val == 1;
        assert res1.next.next.next.next.next == null;

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        ListNode res2 = new Solution().reverseList(head2);
        assert res2.val == 2;
        assert res2.next.val == 1;
        assert res2.next.next == null;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}