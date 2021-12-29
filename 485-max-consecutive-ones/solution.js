/**
 * @param {number[]} nums
 * @return {number}
 */
function findMaxConsecutiveOnes(nums) {
  let max = 0;
  let currMax = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === 1) {
      currMax += 1;
    }
    if (nums[i+1] !== 1) {
      if (currMax > max) {
        max = currMax;
      }
      currMax = 0;
    }
  }

  return max;
}
