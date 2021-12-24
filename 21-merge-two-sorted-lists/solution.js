/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
function mergeTwoLists(list1, list2) {
  if (!list1 || !list2) {
    return list1 || list2;
  }

  if (list2.val < list1.val) {
    const temp = list1;
    list1 = list2;
    list2 = temp;
  }

  list1.next = mergeTwoLists(list1.next, list2);

  return list1;
}
