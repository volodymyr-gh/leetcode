const rows = [
  'qwertyuiop',
  'asdfghjkl',
  'zxcvbnm'
];

const rowsMap = {};
for (let i = 0; i < rows.length; i++) {
  for (let j = 0; j < rows[i].length; j++) {
    rowsMap[rows[i][j]] = i;
  }
}

/**
 * @param {string[]} words
 * @return {string[]}
 */
function findWords(words) {
  const res = [];

  for (let i = 0; i < words.length; i++) {
    const w = words[i];
    let wRow = rowsMap[w[0].toLowerCase()];

    for (let j = 1; j < w.length; j++) {
      const ch = w[j].toLowerCase();
      if (rowsMap[ch] !== wRow) {
        wRow = -1;
        break;
      }
    }

    if (wRow > -1) {
      res.push(w);
    }
  }

  return res;
}
