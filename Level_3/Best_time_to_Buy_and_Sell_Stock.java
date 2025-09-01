package GFG_Level_3;

public class Best_time_to_Buy_and_Sell_Stock {
   public static void main(String[] args) {
	
	   
       int[] prices = {7, 1, 5, 3, 6, 4};
       
       int minPrice = prices[0];
       int maxProfit = 0;
       
       for(int price:prices) 
       {
    	   minPrice=Math.min(minPrice,price);
    	   int profit=price-minPrice;
    	   maxProfit=Math.max(maxProfit, profit);
       }
       System.out.println("Maximum profit = " + maxProfit);


  }
}
