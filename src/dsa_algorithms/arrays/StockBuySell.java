package dsa_algorithms.arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] stocks= {7, 10, 1, 3, 6, 9, 2};
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int price: stocks){
            if(price<min_price){
                min_price = price;
            }
            max_profit = Math.max(max_profit, price - min_price);
        }
        System.out.println(max_profit);
    }
}
