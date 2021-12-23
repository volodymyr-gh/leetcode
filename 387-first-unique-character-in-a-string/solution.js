/**
 * @param {string} s
 * @return {number}
 */
function firstUniqChar(s) {
  const occurrences = {};
  for (let i = 0; i < s.length; i++) {
    const curr = s[i];
    if (!(curr in occurrences)) {
      occurrences[curr] = 1;
    } else {
      occurrences[curr] += 1;
    }
  }

  for (let i = 0; i < s.length; i++) {
    const curr = s[i];
    if (occurrences[curr] === 1) {
      return i;
    }
  }

  return -1;
}
