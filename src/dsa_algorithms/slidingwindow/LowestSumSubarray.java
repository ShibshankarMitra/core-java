package dsa_algorithms.slidingwindow;

public class LowestSumSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6, 7, 5, 3, 2, 6, 1, 3, 2, 4, 8, 1, 3, 1};
        int sum = lowestSumSubarray(arr, 3);
        System.out.println("Lowest sum of subarray of size 3 is: " + sum);
    }

    public static int lowestSumSubarray(int[] arr, int k) {
        int left=0;
        int right=2;
        int sum = 100000;
        while(right < arr.length){
            int value=0;
            for(int i=left; i<=right; i++){
                value+=arr[i];
            }
            if(value<sum){
                sum=value;
            }
            right++;
            left++;

        }
        return sum;
    }
}
