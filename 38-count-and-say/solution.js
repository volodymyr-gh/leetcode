/**
 * @param {number} n
 * @return {string}
 */
function countAndSay(n) {
  if (n === 1) {
    return '1';
  }

  const prev = countAndSay(n - 1);

  let currCount = 0;
  let res = '';
  for (let i = 0; i < prev.length; i++) {
    currCount += 1;
    if (prev[i] !== prev[i+1]) {
      res += `${currCount}${prev[i]}`;
      currCount = 0;
    }
  }

  return res;
}
