package delete_node_in_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode toDelete1 = new ListNode(1);
        head1.next = new ListNode(5);
        head1.next.next = toDelete1;
        head1.next.next.next = new ListNode(9);
        new Solution().deleteNode(toDelete1);
        assert head1.val == 4;
        assert head1.next.val == 5;
        assert head1.next.next.val == 9;
        assert head1.next.next.next == null;

        ListNode head2 = new ListNode(4);
        ListNode toDelete2 = new ListNode(5);
        head2.next = toDelete2;
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(9);
        new Solution().deleteNode(toDelete2);
        assert head2.val == 4;
        assert head2.next.val == 1;
        assert head2.next.next.val == 9;
        assert head2.next.next.next == null;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
        nextNode.next = null;
    }
}