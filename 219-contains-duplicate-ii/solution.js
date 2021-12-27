/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
function containsNearbyDuplicate(nums, k) {
  let i = 0;
  let j = 1;

  while (i < nums.length) {
    if (j - i > k) {
      i += 1;
      j = i + 1;
      continue;
    }

    if (nums[i] !== nums[j]) {
      j += 1;
      continue;
    }

    if (j - i <= k) {
      return true;
    }
  }

  return false;
}
