/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
function removeElement(nums, val) {
  let valCount = 0;
  for (let i = 0; i < nums.length; i++) {
    const curr = nums[i];
    if (curr === val) {
      valCount += 1;
    } else {
      nums[i-valCount] = curr;
    }
  }

  return nums.length - valCount;
}
