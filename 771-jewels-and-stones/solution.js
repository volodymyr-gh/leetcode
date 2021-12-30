/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
function numJewelsInStones(jewels, stones) {
  const jewelsMap = {};
  for (const j of jewels) {
    jewelsMap[j] = true;
  }

  let jewelsCount = 0;
  for (const s of stones) {
    if (jewelsMap[s]) {
      jewelsCount += 1;
    }
  }

  return jewelsCount;
}
