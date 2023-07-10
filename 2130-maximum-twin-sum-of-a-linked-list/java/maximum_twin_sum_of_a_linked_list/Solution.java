package maximum_twin_sum_of_a_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        int res = new Solution().pairSum(head);
        assert res == 7;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public int pairSum(ListNode head) {
        ListNode mid = findMid(head);
        ListNode reversedHead = reverse(mid);

        int res = Integer.MIN_VALUE;
        while (reversedHead != null) {
            res = Math.max(res, head.val + reversedHead.val);
            head = head.next;
            reversedHead = reversedHead.next;
        }

        return res;
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {
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
