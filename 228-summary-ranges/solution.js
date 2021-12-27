/**
 * @param {number[]} nums
 * @return {string[]}
 */
function summaryRanges(nums) {
  let ranges = [];
  let currRangeStart = nums[0];

  for (let i = 0; i < nums.length; i++) {
    if (nums[i+1] - nums[i] <= 1) {
      continue;
    }

    let range = '' + currRangeStart;
    if (currRangeStart !== nums[i]) {
      range += '->' + nums[i]
    }

    ranges.push(range);
    currRangeStart = nums[i+1];
  }

  return ranges;
}
