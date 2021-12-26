/**
 * @param {number[]} nums
 * @return {number}
 */
function majorityElement(nums) {
  const counts = {};
  const len = nums.length;
  for (const n of nums) {
    if (!(n in counts)) {
      counts[n] = 1;
      continue;
    }

    counts[n] += 1;
    if (counts[n] > len / 2) {
      return n;
    }
  }

  return nums[0];
}
