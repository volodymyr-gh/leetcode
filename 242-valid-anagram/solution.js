/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
function isAnagram(s, t) {
  if (s.length !== t.length) {
    return false;
  }

  const occurrences = {};
  for (let i = 0; i < s.length; i++) {
    const curr = s[i];
    if (!(curr in occurrences)) {
      occurrences[curr] = 1;
    } else {
      occurrences[curr] += 1;
    }
  }

  for (let j = 0; j < t.length; j++) {
    const curr = t[j];
    if (!(curr in occurrences)) {
      return false;
    }
    occurrences[curr] -= 1;
    if (occurrences[curr] < 0) {
      return false;
    }
  }

  return true;
}
