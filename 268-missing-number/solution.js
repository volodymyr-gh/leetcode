/**
 * @param {number[]} nums
 * @return {number}
 */
 function missingNumber(nums) {
  let i = 0;
  let xor = 0;
  for (; i < nums.length; i++) {
    xor = xor ^ i ^ nums[i];
  }

  return xor ^ i;
}
