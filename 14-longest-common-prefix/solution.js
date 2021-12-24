/**
 * @param {string[]} strs
 * @return {string}
 */
function longestCommonPrefix(strs) {
  const firstStr = strs[0];
  let prefix = '';

  for (let i = 0; i < firstStr.length; i++) {
    const currChar = firstStr[i];
    let isCommon = true;

    for (let j = 1; j < strs.length; j++) {
      if (strs[j][i] !== currChar) {
        isCommon = false;
        break;
      }
    }

    if (isCommon) {
      prefix += currChar;
    } else {
      break;
    }
  }

  return prefix;
}
