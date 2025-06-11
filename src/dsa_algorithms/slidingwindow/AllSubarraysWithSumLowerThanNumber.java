package dsa_algorithms.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class AllSubarraysWithSumLowerThanNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6, 7, 5, 3, 2, 6, 1, 3, 2, 4, 8, 1, 3, 1};
        allSubArrayWithLowerSum(arr, 10);
    }

    public static void allSubArrayWithLowerSum(int[] arr, int k) {
        int left= 0;
        int right = 0;
        int sum=0;
        while (right < arr.length) {
            if(sum+arr[right]<k){
                sum+=arr[right];
                List<Integer> subArray = new ArrayList<>();
                for(int i = left; i <= right; i++) {
                    subArray.add(arr[i]);
                }
                System.out.println("Subarray with sum less than " + k + ": " + subArray);
                right++;
            }
            else{
                sum-=arr[left];
                left++;
            }
        }
    }
}
