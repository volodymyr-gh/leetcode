/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
function findTheDifference(s, t) {
  const sChars = {};
  for (const ch of s) {
    if (ch in sChars) {
      sChars[ch] += 1;
    } else {
      sChars[ch] = 1;
    }
  }

  for (const ch of t) {
    if (!(ch in sChars) || sChars[ch] < 1) {
      return ch;
    }
    sChars[ch] -= 1;
  }
}
