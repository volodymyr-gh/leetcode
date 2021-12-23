/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
function intersection(nums1, nums2) {
  const res = {};
  for (let i = 0; i < nums1.length; i++) {
    if (res[nums1[i]]) {
      continue;
    }
    for (let j = 0; j < nums2.length; j++) {
      if (nums1[i] === nums2[j]) {
        res[nums1[i]] = true;
        break;
      }
    }
  }

  return Object.keys(res);
}
