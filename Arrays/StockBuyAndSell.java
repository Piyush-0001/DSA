package Arrays;

import java.util.Scanner;

public class StockBuyAndSell {
    
    static int stockBuySell(int price[]){
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            for(int j=i+1; j<price.length; j++){
                int profit = price[j] - price[i];  // Selling Price - Buying Price
                maxProfit = Math.max(maxProfit, profit);
            }
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
        System.out.println("max profit: "+ stockBuySell(a));
        sc.close();
    }
}
