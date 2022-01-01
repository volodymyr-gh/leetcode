/**
 * @param {string} text
 * @return {number}
 */
function maxNumberOfBalloons(text) {
  const charsMap = {};
  for (let i = 0; i < text.length; i++) {
    const curr = text[i];
    if (curr in charsMap) {
      charsMap[curr] += 1;
    } else {
      charsMap[curr] = 1;
    }
  }

  if (charsMap['l']) {
    charsMap['l'] = Math.floor(charsMap['l'] / 2);
  }

  if (charsMap['o']) {
    charsMap['o'] = Math.floor(charsMap['o'] / 2);
  }

  let balloonsCount = charsMap['b'] || 0;
  balloonsCount = Math.min(balloonsCount, charsMap['a'] || 0);
  balloonsCount = Math.min(balloonsCount, charsMap['l'] || 0);
  balloonsCount = Math.min(balloonsCount, charsMap['o'] || 0);
  balloonsCount = Math.min(balloonsCount, charsMap['n'] || 0);

  return balloonsCount;
}
