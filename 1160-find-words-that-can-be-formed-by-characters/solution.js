/**
 * @param {string[]} words
 * @param {string} chars
 * @return {number}
 */
function countCharacters(words, chars) {
  const charsMap = {};
  for (let i = 0; i < chars.length; i++) {
    const curr = chars[i];
    if (curr in charsMap) {
      charsMap[curr] += 1;
    } else {
      charsMap[curr] = 1;
    }
  }

  let res = 0;
  for (let i = 0; i < words.length; i++) {
    const currWord = words[i];
    const currWordCharsMap = {};
    let isGood = true;

    for (let j = 0; j < currWord.length; j++) {
      const currChar = currWord[j];
      if (!(currChar in charsMap)) {
        isGood = false;
        break;
      }
      if (currChar in currWordCharsMap) {
        currWordCharsMap[currChar] += 1;
      } else {
        currWordCharsMap[currChar] = 1;
      }
      if (currWordCharsMap[currChar] > charsMap[currChar]) {
        isGood = false;
        break;
      }
    }

    if (isGood) {
      res += currWord.length;
    }
  }

  return res;
}
