/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
function searchInsert(nums, target) {
  let start = 0;
  let end = nums.length - 1;

  while (start <= end) {
    const mid = Math.floor((start + end) / 2);

    if (nums[mid] === target) {
      return mid;
    }

    if (nums[mid] > target) {
      end = mid - 1;
    } else {
      start = mid + 1;
    }
  }

  return start;
}
