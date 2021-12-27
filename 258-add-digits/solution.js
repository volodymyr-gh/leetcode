/**
 * @param {number} num
 * @return {number}
 */
function addDigits(num) {
  let digitalRoot = 0;

  while (num > 0) {
    digitalRoot += num % 10;
    num = Math.floor(num / 10);

    if ((num === 0) && (digitalRoot > 9)) {
      num = digitalRoot;
      digitalRoot = 0;
    }
  }

  return digitalRoot;
}
