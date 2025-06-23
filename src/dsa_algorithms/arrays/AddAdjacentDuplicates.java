package dsa_algorithms.arrays;

import java.util.Arrays;

public class AddAdjacentDuplicates {
    public static void main(String[] args) {
        int[] arr= {7, 10, 1, 3, 6, 9, 2, 1, 6, 1};
        int index= 0;
        while(index<arr.length-1){
            if(arr[index] == 1){
                for(int i=arr.length-2; i>=index+1; i--){
                    arr[i+1]=arr[i];
                }
                arr[index+1]=1;
                index+=2;
            }
            else{
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
