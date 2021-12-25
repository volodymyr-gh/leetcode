/**
 * @param {number[]} prices
 * @return {number}
 */
function maxProfit(prices) {
  let lowestPrice = Number.MAX_VALUE;
  let profit = 0;
  for (const p of prices) {
    if (p < lowestPrice) {
      lowestPrice = p;
    } else if (p - lowestPrice > profit) {
      profit = p - lowestPrice;
    }
  }

  return profit;
}
