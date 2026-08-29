package Arrays;

import java.util.Scanner;

public class StockBuyAndSellOptimal {
    static int stockBuyAndSell(int prices[]){
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            int profit = prices[i] - minPrice;
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("max profit: "+ stockBuyAndSell(a));
        sc.close();
    }
}
