/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
function twoSum(nums, target) {
  const indicesByNums = {};
  for (let i = 0; i < nums.length; i++) {
    const curr = nums[i];
    const needed = target - curr;
    if (needed in indicesByNums) {
      return [indicesByNums[needed], i];
    }
    indicesByNums[curr] = i;
  }
}
