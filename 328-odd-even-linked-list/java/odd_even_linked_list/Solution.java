package odd_even_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode res1 = new Solution().oddEvenList(head1);
        assert res1.val == 1;
        assert res1.next.val == 3;
        assert res1.next.next.val == 5;
        assert res1.next.next.next.val == 2;
        assert res1.next.next.next.next.val == 4;

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        ListNode res2 = new Solution().oddEvenList(head2);
        assert res2.val == 1;
        assert res2.next.val == 3;
        assert res2.next.next.val == 2;
        assert res2.next.next.next.val == 4;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            ListNode nextOdd = odd.next.next;
            odd.next = nextOdd;
            odd = nextOdd;

            ListNode nextEven = even.next.next;
            even.next = nextEven;
            even = nextEven;
        }

        odd.next = evenHead;

        return head;
    }
}
