package dsa_algorithms.arrays;

public class LeadersInArray {
    //Given an array arr[] of size n, the task is to find all the Leaders in the array.
    // An element is a Leader if it is greater than or equal to all the elements to its right side.
    public static void main(String[] args) {
        int[] arr= {16, 17, 4, 3, 5, 2};
        int max= Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>max){
                max= arr[i];
                System.out.println(max);
            }
        }
    }
}
