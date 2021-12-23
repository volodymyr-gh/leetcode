/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
function moveZeroes(nums) {
  let zerosCount = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === 0) {
      zerosCount += 1;
    } else if (zerosCount) {
      nums[i-zerosCount] = nums[i];
      nums[i] = 0;
    }
  }
}
