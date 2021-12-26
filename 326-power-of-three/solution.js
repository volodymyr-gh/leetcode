/**
 * @param {number} n
 * @return {boolean}
 */
function isPowerOfThree(n) {
  if (n < 1) {
    return false;
  }

  let curr = n;
  while (curr % 3 === 0) {
    curr /= 3;
  }

  return curr === 1;
}
