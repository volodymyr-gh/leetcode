function isCapital(ch) {
  if (!ch) return false;
  const charCode = ch.charCodeAt(0);
  return charCode >= 65 && charCode <= 90;
}

/**
 * @param {string} word
 * @return {boolean}
 */
function detectCapitalUse(word) {
  let isAbbr = isCapital(word[0]) && isCapital(word[1]);

  if (isAbbr) {
    for (let i = 2; i < word.length; i++) {
      if (!isCapital(word[i])) {
        return false;
      }
    }
  } else {
    for (let i = 1; i < word.length; i++) {
      if (isCapital(word[i])) {
        return false;
      }
    }
  }

  return true;
}
