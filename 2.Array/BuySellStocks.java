public class BuySellStocks {

    public static int buyAndSellStocks(int prices[]) {
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0;i < n;i++){
            if(buyPrice < prices[i]){ // prices = [7,1,5,3,6,4]
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("The Profit will be "+ buyAndSellStocks(prices));
    }
}
