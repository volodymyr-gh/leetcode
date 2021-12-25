const bracketsMap = {
  ')': '(',
  '}': '{',
  ']': '['
};

function isOpenBracket(ch) {
  return ch === '(' || ch === '{' || ch === '[';
}

/**
 * @param {string} s
 * @return {boolean}
 */
function isValid(s) {
  const open = [];

  for (let i = 0; i < s.length; i++) {
    const curr = s[i];

    if (isOpenBracket(curr)) {
      open.push(curr);
      continue;
    }

    if (!open.length) {
      return false;
    }

    const lastOpen = open[open.length - 1];
    if (bracketsMap[curr] !== lastOpen) {
      return false;
    }

    open.pop();
  }

  return !open.length;
}
