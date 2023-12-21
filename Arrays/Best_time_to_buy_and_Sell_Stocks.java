import java.util.*;

public class Arrayinjava {
    public static int buyandsellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            if (buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;         // Today's Profit
                maxprofit= Math.max(maxprofit, profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxprofit;
    }
    
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));
    } 
}   
