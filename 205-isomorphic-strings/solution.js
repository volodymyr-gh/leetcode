function buildCipher(str) {
  const seen = {};
  let res = '';
  for (let i = 0; i < str.length; i++) {
    let idx = seen[str[i]];
    if (!idx) {
      idx = i + 1;
      seen[str[i]] = idx;
    }
    res = res + '' + idx;
  }

  return res;
}

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
function isIsomorphic(s, t) {
  return buildCipher(s) === buildCipher(t);
}
