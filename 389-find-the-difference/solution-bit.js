/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
function findTheDifference(s, t) {
  let b = 0;

  for (const ch of s) {
    b = b ^ ch.charCodeAt(0);
  }

  for (const ch of t) {
    b = b ^ ch.charCodeAt(0);
  }

  return String.fromCharCode(b);
}
