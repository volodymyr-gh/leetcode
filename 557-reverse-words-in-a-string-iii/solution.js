/**
 * @param {string} s
 * @return {string}
 */
function reverseWords(s) {
  let res = '';
  let currWord = '';

  for (let i = 0; i < s.length; i++) {
    if (s[i] === ' ') {
      currWord = currWord + s[i];
    } else {
      currWord = s[i] + currWord;
    }

    if ((s[i] === ' ') || (i === s.length - 1)) {
      res += currWord;
      currWord = '';
    }
  }

  return res;
}
