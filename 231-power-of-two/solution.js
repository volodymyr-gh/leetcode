/**
 * @param {number} n
 * @return {boolean}
 */
function isPowerOfTwo(n) {
  if (n === 1) {
    return true;
  }

  if (n % 2 > 0) {
    return false;
  }

  let curr = n;
  while (curr >= 1) {
    curr = curr / 2;
    if (curr === 1) {
      return true;
    }
  }

  return false;
}
