/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
function hasCycle(head) {
  if (!head) {
    return false;
  }

  let slow = head;
  let fast = slow.next && slow.next.next;
  while (fast) {
    if (fast === slow) {
      return true;
    }
    slow = slow.next;
    fast = fast.next && fast.next.next;
  }

  return false;
}
