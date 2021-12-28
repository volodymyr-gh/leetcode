function buildCipher(seq) {
  let res = '';
  let seen = {};
  for (let i = 0; i < seq.length; i++) {
    const curr = seq[i];
    const idx = seen[curr];
    if (idx === undefined) {
      res += i;
      seen[curr] = i;
    } else {
      res += idx;
    }
  }

  return res;
}

/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
function wordPattern(pattern, s) {
  const words = s.split(' ');
  if (words.length !== pattern.length) {
    return false;
  }

  return buildCipher(pattern) === buildCipher(words);
}
