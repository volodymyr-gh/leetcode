/**
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
function rotateString(s, goal) {
  if (s.length !== goal.length) {
    return false;
  }

  const len = s.length;
  let n = len;

  while (n) {
    let curr = [];
    for (let i = 0; i < len; i++) {
      const newIdx = (i + n - 1) % len;
      curr[newIdx] = s[i];
    }

    if (curr.join('') === goal) {
      return true;
    }

    n -= 1;
  }

  return false;
}
