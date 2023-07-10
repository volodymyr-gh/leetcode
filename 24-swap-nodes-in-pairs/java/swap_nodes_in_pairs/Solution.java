package swap_nodes_in_pairs;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode res = new Solution().swapPairs(head);
        assert res.val == 2;
        assert res.next.val == 1;
        assert res.next.next.val == 4;
        assert res.next.next.next.val == 3;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        ListNode nextNext = next.next;
        next.next = head;
        head.next = swapPairs(nextNext);

        return next;
    }
}
