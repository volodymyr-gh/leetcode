/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
function intersect(nums1, nums2) {
  const res = [];
  const usedIndices = {};

  for (let i = 0; i < nums1.length; i++) {
    for (let j = 0; j < nums2.length; j++) {
      if (usedIndices[j]) {
        continue;
      }
      if (nums1[i] === nums2[j]) {
        res.push(nums1[i]);
        usedIndices[j] = true;
        break;
      }
    }
  }

  return res;
}
