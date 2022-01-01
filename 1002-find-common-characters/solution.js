/**
 * @param {string[]} words
 * @return {string[]}
 */
function commonChars(words) {
  let counts = {};

  const firstWord = words[0];
  for (let i = 0; i < firstWord.length; i++) {
    const char = firstWord[i];
    if (char in counts) {
      counts[char] += 1;
    } else {
      counts[char] = 1;
    }
  }

  for (let i = 1; i < words.length; i++) {
    const word = words[i];
    const tmpCounts = {};
    for (let j = 0; j < word.length; j++) {
      const char = words[i][j];
      if (!(char in counts)) {
        continue;
      }
      if (char in tmpCounts) {
        tmpCounts[char] = Math.min(
          counts[char],
          tmpCounts[char] + 1
        );
      } else {
        tmpCounts[char] = 1;
      }
    }
    counts = tmpCounts;
  }

  const res = [];
  for (const key in counts) {
    for (let i = 0; i < counts[key]; i++) {
      res.push(key);
    }
  }

  return res;
}
