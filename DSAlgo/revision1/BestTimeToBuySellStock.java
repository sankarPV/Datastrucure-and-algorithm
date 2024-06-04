package DSAlgo.revision1;

//Best time to buy and sell stock

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int mini = prices[0], maxProfit = 0;

        for(int i =1; i<prices.length;i++) {
            int profit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] arg) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}