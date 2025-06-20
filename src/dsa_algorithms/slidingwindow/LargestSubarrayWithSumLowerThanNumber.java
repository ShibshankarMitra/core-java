package dsa_algorithms.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class LargestSubarrayWithSumLowerThanNumber {
    public static void main(String[] args) {
        int[] arr = {11, 3, 2, 4, 5, 6, 7, 5, 3, 2, 6, 1,1,1,1,1,1,3, 2, 4, 8, 1, 3, 1};
        largestSubArrayWithLowerSum(arr, 10);
    }

    public static void largestSubArrayWithLowerSum(int[] arr, int k) {
        int left= 0;
        int right = 0;
        int sum=0;
        int maxSize = 0;
        while (right < arr.length) {
            sum+=arr[right];
            while(left <= right && sum>=k) {
                sum -= arr[left];
                left++;
            }
            maxSize = Math.max(maxSize, right - left + 1);
            right++;
        }
        System.out.println("Largest subarray with sum lower than " + k + " has size: " + maxSize);
    }
}
