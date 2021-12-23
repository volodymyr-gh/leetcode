/**
 * @param {number[]} nums
 * @return {boolean}
 */
function containsDuplicate(nums) {
  const seenNums = {};
  let result = false;

  for (let i = 0; i < nums.length; i++) {
    if (seenNums[nums[i]]) {
      result = true;
      break;
    }
    seenNums[nums[i]] = true;
  }

  return result;
}
