/**
 * @param {number} n
 * @return {string[]}
 */
function fizzBuzz(n) {
  let res = [];
  for (let i = 1; i <= n; i++) {
    let el;
    if ((i % 3 === 0) && (i % 5 === 0)) {
      el = 'FizzBuzz';
    } else if (i % 3 === 0) {
      el = 'Fizz';
    } else if (i % 5 === 0) {
      el = 'Buzz';
    } else {
      el = '' + i;
    }
    res.push(el);
  }

  return res;
}
