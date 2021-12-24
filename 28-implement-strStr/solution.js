/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
function strStr(haystack, needle) {
  if (!needle.length) {
    return 0;
  }

  let i = 0;
  let j = 0;

  while (i < haystack.length) {
    if (haystack[i+j] !== needle[j]) {
      i++;
      j = 0;
    } else {
      j++;
    }

    if (j === needle.length) {
      return i;
    }
  }

  return -1;
}
