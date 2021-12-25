/**
 * @param {string} s
 * @return {number}
 */
function lengthOfLastWord(s) {
  let len = 0;
  for (let i = s.length - 1; i >= 0; i--) {
    const isSpace = s[i].charCodeAt(0) === 32;
    if (isSpace && len) {
      break;
    }
    if (!isSpace) {
      len += 1;
    }
  }

  return len;
}
