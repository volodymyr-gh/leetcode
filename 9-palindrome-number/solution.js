/**
 * @param {number} x
 * @return {boolean}
 */
function isPalindrome(x) {
  if (x < 0) {
    return false;
  }

  let curr = x;
  let reversed = 0;
  while (curr >= 1) {
    const remainder = curr % 10;
    curr = (curr - remainder) / 10;
    reversed = (reversed * 10) + remainder;
  }

  return reversed === x;
}
