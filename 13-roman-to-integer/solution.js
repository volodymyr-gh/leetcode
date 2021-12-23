const romanToIntMap = {
  i: 1,
  v: 5,
  x: 10,
  l: 50,
  c: 100,
  d: 500,
  m: 1000
};

/**
 * @param {string} s
 * @return {number}
 */
function romanToInt(s) {
  let res = 0;
  let last = 0;

  for (let i = s.length - 1; i >= 0; i--) {
    let intNum = romanToIntMap[s[i].toLowerCase()];
    if (intNum < last) {
      res -= intNum;
    } else {
      res += intNum;
    }
    last = intNum;
  }

  return res;
}
