/**
 * @param {number} n
 * @return {number}
 */
function fib(n) {
  if (n < 1) {
    return 0;
  }

  let a = 0;
  let b = 1;
  while (--n) {
    let temp = b;
    b = a + b;
    a = temp;
  }

  return b;
}
