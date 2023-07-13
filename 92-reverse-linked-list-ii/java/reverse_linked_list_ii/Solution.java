package reverse_linked_list_ii;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode res1 = new Solution().reverseBetween(head1, 2, 4);
        assert res1.val == 1;
        assert res1.next.val == 4;
        assert res1.next.next.val == 3;
        assert res1.next.next.next.val == 2;
        assert res1.next.next.next.next.val == 5;

        ListNode head2 = new ListNode(5);
        ListNode res2 = new Solution().reverseBetween(head2, 1, 1);
        assert res2.val == 5;

        ListNode head3 = new ListNode(3);
        head3.next = new ListNode(5);
        ListNode res3 = new Solution().reverseBetween(head3, 1, 1);
        assert res3.val == 3;
        assert res3.next.val == 5;

        ListNode head4 = new ListNode(3);
        head4.next = new ListNode(5);
        ListNode res4 = new Solution().reverseBetween(head4, 2, 2);
        assert res4.val == 3;
        assert res4.next.val == 5;

        ListNode head5 = new ListNode(3);
        head5.next = new ListNode(5);
        ListNode res5 = new Solution().reverseBetween(head5, 1, 2);
        assert res5.val == 5;
        assert res5.next.val == 3;

        ListNode head6 = new ListNode(1);
        head6.next = new ListNode(2);
        head6.next.next = new ListNode(3);
        ListNode res6 = new Solution().reverseBetween(head6, 1, 2);
        assert res6.val == 2;
        assert res6.next.val == 1;
        assert res6.next.next.val == 3;

        ListNode head7 = new ListNode(1);
        head7.next = new ListNode(2);
        head7.next.next = new ListNode(3);
        ListNode res7 = new Solution().reverseBetween(head7, 2, 3);
        assert res7.val == 1;
        assert res7.next.val == 3;
        assert res7.next.next.val == 2;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prefixTail = null;
        ListNode intervalHead = head;
        int i = left - 1;
        while (i > 0) {
            prefixTail = intervalHead;
            intervalHead = intervalHead.next;
            i--;
        }

        ListNode prev = null;
        ListNode curr = intervalHead;
        int j = right - left + 1;
        while (j > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            j--;
        }

        if (prefixTail == null) {
            head = prev;
        } else {
            prefixTail.next = prev;
        }

        intervalHead.next = curr;

        return head;
    }
}
