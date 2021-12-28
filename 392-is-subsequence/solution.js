/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
function isSubsequence(s, t) {
  let i = 0;
  let j = 0;

  while (i < s.length) {
    if (s[i] === t[j]) {
      i += 1;
      j += 1;
      continue;
    }

    j += 1;

    if (j > t.length - 1) {
      return false;
    }
  }

  return true;
}
