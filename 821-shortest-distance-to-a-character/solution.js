/**
 * @param {string} s
 * @param {character} c
 * @return {number[]}
 */
function shortestToChar(s, c) {
  const cIndices = [];
  for (let i = 0; i < s.length; i++) {
    if (s[i] === c) {
      cIndices.push(i);
    }
  }

  const res = [];
  let currCIdx = 0;
  for (let i = 0; i < s.length; i++) {
    const distance1 = Math.abs(i - cIndices[currCIdx]);
    const distance2 = Math.abs(i - cIndices[currCIdx + 1]);
    if (distance1 >= distance2) {
      currCIdx += 1;
      res.push(distance2);
    } else {
      res.push(distance1);
    }
  }

  return res;
}