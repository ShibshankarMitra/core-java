package arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        //runner.kthLargestElement(new int[]{3, 2, 1, 5, 6, 4,9}, 2);
        //runner.maximumSumOfkElements(new int[]{3, 2, 1, 5, 6, 4,9}, 2);
        //runner.maxConsecutiveBinary(new int[]{1,0,1,0,0,0,0,1});
        //runner.moveAllZerosToEnd(new int[]{1,2,0,3,0,4,5,0,0,9});
        //runner.reverseArrayInGroups(new int[]{1,2,0,3,0,4,5,0,0}, 3);
        //runner.rotateArrayLeft(new int[]{1,2,0,3,0,4,5,0,0}, 3);
        //runner.reArrangePositiveNegative(new int[]{1,-2,7,3,10,4,-5,-3,-8});
        //runner.numberOfSubarraysWithSumLessThanK(new int[]{1, 3, 4, 2}, 7);
    }

    void kthLargestElement(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - k]);
    }

    void maximumSumOfkElements(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i <arr.length-(k-1); i++) {
            int sum = 0;
            for(int j=i; j<=i+k-1;j++){
                sum= sum+arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }

    void maxConsecutiveBinary(int[] arr) {
        int count = 1;
        int running = arr[0];
        int maxCount = 0;
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (running == current) {
                count++;
            }
            else {
                running = current;
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }

    void moveAllZerosToEnd(int[] arr) {
        int left = 0;
        while (left < arr.length) {
            for (int i = left; i < arr.length-1; i++) {
                if (arr[i] == 0) {
                    int temp= arr[i+1];
                    arr[i+1]= arr[i];
                    arr[i]= temp;
                }
            }
            left++;
        }
        System.out.println(Arrays.toString(arr));
    }

    void reverseArrayInGroups(int[] arr, int k) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length-k+1; i=i+k) {
            for(int j=k-1; j>=0; j--){
                reversedArray[i+j]=arr[i+k-1-j];
            }
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    void rotateArrayLeft(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 1; j< arr.length; j++) {
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    void reArrangePositiveNegative(int[] arr) {
        Queue<Integer> positive = new ArrayDeque<>();
        Queue<Integer> negative = new ArrayDeque<>();
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                positive.add(arr[i]);
            }
            else {
                negative.add(arr[i]);
            }
        }
        System.out.println(positive);
        int index=0;
        while (!positive.isEmpty() || !negative.isEmpty()) {
            if(positive.isEmpty()){
                newArr[index]=negative.remove();
            }
            else if(negative.isEmpty()){
                newArr[index]=positive.remove();
            } else if (index%2==0) {
                newArr[index]=positive.remove();
            }
            else {
                newArr[index]=negative.remove();
            }
            index++;
            System.out.println(Arrays.toString(newArr));
        }
        System.out.println(Arrays.toString(newArr));
    }

    void numberOfSubarraysWithSumLessThanK(int[] arr, int k) {
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
        }
        int sum =0;
        for(int left = 0, right=0; right < arr.length; right++){
            sum+=arr[right];
            //System.out.println(sum);
            while(left <= right && sum>k){
                //System.out.println(sum);
                sum=sum-arr[left];
                left++;
            }
            int[] tmp= new int[right-left+1];
            for(int i=left; i<=right; i++){
                tmp[i-left]=arr[i];
            }
            System.out.println(Arrays.toString(tmp));
        }
    }
}
