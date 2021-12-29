/**
 * @param {string} s
 * @return {boolean}
 */
function checkRecord(s) {
  let absentDays = 0;
  let lateDays = 0;

  for (let i = 0; i < s.length; i++) {
    if (s[i] === 'L') {
      lateDays += 1;
    } else if (s[i] === 'A') {
      lateDays = 0;
      absentDays += 1;
    } else {
      lateDays = 0;
    }

    if (absentDays >= 2 || lateDays >= 3) {
      return false;
    }
  }

  return true;
}
