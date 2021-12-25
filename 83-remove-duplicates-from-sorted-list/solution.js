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
function deleteDuplicates(head) {
  let curr = head;
  while (curr) {
    const next = curr.next;
    if (!next) {
      break;
    }
    if (next.val === curr.val) {
      curr.next = next.next;
    } else {
      curr = next;
    }
  }

  return head;
}
