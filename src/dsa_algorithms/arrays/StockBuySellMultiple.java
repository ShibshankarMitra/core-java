package dsa_algorithms.arrays;

public class StockBuySellMultiple {
    public static void main(String[] args) {
        int[] arr = new int[] {100, 180, 260, 310, 40, 535, 695};
        int right=0;
        int currentMin=Integer.MAX_VALUE;
        int buy=0;
        int sell=0;
        int total_profit=0;
        while(right<arr.length){
            int current=arr[right];
            if(current<=currentMin){
                currentMin=current;
                if(right>0){
                    sell=arr[right-1];
                    total_profit+=(sell-buy);
                }
                buy=currentMin;
            }
            else if(right==arr.length-1){
                sell=arr[right];
                total_profit+=(sell-buy);
            }
            right++;
        }
        System.out.println(total_profit);
    }
}
