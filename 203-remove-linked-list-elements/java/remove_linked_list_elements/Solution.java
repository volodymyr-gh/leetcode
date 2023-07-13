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

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val != val) {
                prev = curr;
                curr = curr.next;
                continue;
            }

            if (prev == null) {
                head = curr.next;
            } else {
                prev.next = curr.next;
            }
            curr = curr.next;
        }

        return head;
    }
}
