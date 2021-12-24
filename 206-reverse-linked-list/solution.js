/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
function reverseList(head) {
  if (!head) {
    return head;
  }

  let slow = head;
  let fast = slow.next;
  while (fast) {
    const newFast = fast.next;
    fast.next = slow;
    slow = fast;
    fast = newFast;
  }

  head.next = null;

  return slow;
}
