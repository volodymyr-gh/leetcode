function isLetter(ch) {
  const code = ch.charCodeAt(0);
  return (code >= 65 && code <= 90) ||
    (code >= 97 && code <= 122);
}

/**
 * @param {string} s
 * @return {string}
 */
function reverseOnlyLetters(s) {
  const res = [];
  let i = 0;
  let j = s.length - 1;

  while (i <= j) {
    if (isLetter(s[i]) && isLetter(s[j])) {
      res[i] = s[j];
      res[j] = s[i];
      i += 1;
      j -= 1;
      continue;
    }

    if (!isLetter(s[i])) {
      res[i] = s[i];
      i += 1;
    } else {
      res[j] = s[j];
      j -= 1;
    }
  }

  return res.join('');
}
