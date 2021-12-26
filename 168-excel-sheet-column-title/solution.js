const letters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

/**
 * @param {number} columnNumber
 * @return {string}
 */
function convertToTitle(columnNumber) {
  let res = '';
  while (columnNumber > 0) {
    const remainder = (columnNumber - 1) % 26;
    res = letters[remainder] + res;
    columnNumber = Math.floor((columnNumber - 1) / 26);
  }

  return res;
}
