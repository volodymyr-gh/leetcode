package middle_of_the_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode mid1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = mid1;
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode res1 = new Solution().middleNode(head1);
        assert res1 == mid1;

        ListNode head2 = new ListNode(1);
        ListNode mid2 = new ListNode(4);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = mid2;
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        ListNode res2 = new Solution().middleNode(head2);
        assert res2 == mid2;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
