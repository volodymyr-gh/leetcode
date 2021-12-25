/**
 * @param {number} rowIndex
 * @return {number[]}
 */
function getRow(rowIndex) {
  if (rowIndex === 0) {
    return [1];
  }

  if (rowIndex === 1) {
    return [1,1];
  }

  const prevRow = getRow(rowIndex - 1);

  const res = [1];
  for (let i = 0; i < prevRow.length - 1; i++) {
    res.push(prevRow[i] + prevRow[i+1]);
  }
  res.push(1);

  return res;
}
