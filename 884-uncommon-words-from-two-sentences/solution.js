function collectWordCounts(s, words) {
  let currWord = '';
  for (let i = 0; i < s.length; i++) {
    if (s[i] !== ' ') {
      currWord += s[i];
    }
    if ((s[i] === ' ') || (i === s.length - 1)) {
      if (currWord in words) {
        words[currWord] += 1;
      } else {
        words[currWord] = 1;
      }
      currWord = '';
    }
  }
}

/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[]}
 */
function uncommonFromSentences(s1, s2) {
  const wordCounts = {};
  collectWordCounts(s1, wordCounts);
  collectWordCounts(s2, wordCounts);

  let uncommon = [];
  for (const word in wordCounts) {
    if (wordCounts[word] === 1) {
      uncommon.push(word);
    }
  }

  return uncommon;
}
