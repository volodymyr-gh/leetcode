/**
 * @param {number} n
 * @return {boolean}
 */
function isHappy(n) {
  let prevSums = {};
  let sum = n;

  while (true) {
    let curr = sum;
    sum = 0;
    while (curr > 0) {
      const digit = curr % 10;
      curr = Math.floor(curr / 10);
      sum += digit * digit;
    }

    if (prevSums[1] && (sum === 1)) {
      return true;
    }

    if (prevSums[sum]) {
      break;
    }

    prevSums[sum] = true;
  }

  return false;
}
