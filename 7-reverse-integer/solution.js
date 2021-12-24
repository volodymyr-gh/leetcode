const max = Math.pow(2, 31) - 1;

/**
 * @param {number} x
 * @return {number}
 */
function reverse(x) {
  let temp = Math.abs(x);
  let res = 0;

  while (temp >= 1) {
    const remainder = temp % 10;
    temp = (temp - remainder) / 10;
    res = (res * 10) + remainder;

    if (res > max) {
      return 0;
    }
  }

  return x < 0 ? res * -1 : res;
}
