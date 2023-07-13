package convert_binary_number_in_a_linked_list_to_integer;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(0);
        head1.next.next = new ListNode(1);
        int res1 = new Solution().getDecimalValue(head1);
        assert res1 == 5;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int num = curr.val;
        while (curr.next != null) {
            num = num * 2 + curr.next.val;
            curr = curr.next;
        }

        return num;
    }
}
