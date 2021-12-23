function isAlphaNum(ch) {
  const code = ch.charCodeAt(0);

  return (code >= 48 && code <= 57) ||
    (code >= 97 && code <= 122)
}

/**
 * @param {string} s
 * @return {boolean}
 */
function isPalindrome(s) {
  let i = 0;
  let j = s.length - 1;

  while (i < j) {
    const ch1 = s[i].toLowerCase();
    const ch2 = s[j].toLowerCase();

    if (!isAlphaNum(ch1)) {
      i++;
      continue;
    }

    if (!isAlphaNum(ch2)) {
      j--;
      continue;
    }

    if (ch1 !== ch2) {
      return false;
    }

    i++;
    j--;
  }

  return true;
}
