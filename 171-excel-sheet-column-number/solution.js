/**
 * @param {string} columnTitle
 * @return {number}
 */
function titleToNumber(columnTitle) {
  const len = columnTitle.length;
  let res = 0;
  for (let i = len - 1; i >= 0; i--) {
    const idx = columnTitle[i].charCodeAt(0) - 64;
    res = res + (idx * Math.pow(26, len - i - 1));
  }

  return res;
}
