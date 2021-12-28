function isVowel(ch) {
  ch = ch.toLowerCase();

  return ch === 'a' ||
    ch === 'e' ||
    ch === 'i' ||
    ch === 'o' ||
    ch === 'u';
}

/**
 * @param {string} s
 * @return {string}
 */
function reverseVowels(s) {
  let res = [];
  let i = 0
  let j = s.length - 1;

  while (i <= j) {
    const ch1 = s[i];
    const ch2 = s[j];

    if (!isVowel(ch1)) {
      res[i] = ch1;
      i += 1;
      continue;
    }

    if (!isVowel(ch2)) {
      res[j] = ch2;
      j -= 1;
      continue;
    }

    res[i] = ch2;
    res[j] = ch1;
    i += 1;
    j -= 1;
  }

  return res.join('');
}
