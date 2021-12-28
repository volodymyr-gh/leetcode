/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
function canConstruct(ransomNote, magazine) {
  const magazineChars = {};
  for (const ch of magazine) {
    if (ch in magazineChars) {
      magazineChars[ch] += 1;
    } else {
      magazineChars[ch] = 1;
    }
  }

  for (const ch of ransomNote) {
    if (!(ch in magazineChars) || magazineChars[ch] < 1) {
      return false;
    }
    magazineChars[ch] -= 1;
  }

  return true;
}
