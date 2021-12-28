/**
 * @param {string} s
 * @return {number}
 */
function longestPalindrome(s) {
  const chars = {};
  for (const ch of s) {
    if (ch in chars) {
      chars[ch] += 1;
    } else {
      chars[ch] = 1;
    }
  }

  let sum = 0;
  let highestOddCount = 0;
  for (const ch in chars) {
    const count = chars[ch];
    if ((count % 2 > 0) && (count > highestOddCount)) {
      sum += highestOddCount - (highestOddCount % 2);
      highestOddCount = count;
    } else {
      sum += count - (count % 2);
    }
  }

  return sum + highestOddCount;
}
