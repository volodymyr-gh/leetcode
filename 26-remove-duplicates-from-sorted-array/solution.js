/**
 * @param {number[]} nums
 * @return {number}
 */
function removeDuplicates(nums) {
  let dups = 0;
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] === nums[i-1]) {
      dups += 1;
    }
    nums[i-dups] = nums[i];
  }

  return nums.length - dups;
}
