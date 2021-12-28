/**
 * @param {string} s
 * @return {number}
 */
function countSegments(s) {
  let segsCount = 0;
  for (let i = 0; i < s.length; i++) {
    if ((i === 0 || s[i-1] === ' ') && (s[i] !== ' ')) {
      segsCount += 1;
    }
  }

  return segsCount;
}
