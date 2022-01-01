/**
 * @param {string} s
 * @return {string}
 */
function removeDuplicates(s) {
  const res = [];
  for (let i = 0; i < s.length; i++) {
    const char = s[i];
    if (res[res.length - 1] === char) {
      res.pop();
    } else {
      res.push(char);
    }
  }

  return res.join('');
}
