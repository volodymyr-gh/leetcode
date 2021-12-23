/**
 * @param {number[]} prices
 * @return {number}
 */
function maxProfit(prices) {
  let boughtAt = null;
  let profit = 0;

  for (let i = 0; i < prices.length; i++) {
    const currPrice = prices[i];
    const nextPrice = prices[i+1];

    if (boughtAt === null) {
      if (nextPrice > currPrice) {
        boughtAt = currPrice;
      }
    } else {
      if ((nextPrice < currPrice) || (nextPrice === undefined)) {
        profit += currPrice - boughtAt;
        boughtAt = null;
      }
    }
  }

  return profit;
}
