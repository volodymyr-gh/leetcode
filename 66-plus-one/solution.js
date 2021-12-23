/**
 * @param {number[]} digits
 * @return {number[]}
 */
function plusOne(digits) {
  for (let i = digits.length - 1; i >= 0; i--) {
    const curr = digits[i];
    if (curr < 9) {
      digits[i] = curr + 1;
      return digits;
    }
    digits[i] = 0;
  }

  digits.unshift(1);

  return digits;
}
