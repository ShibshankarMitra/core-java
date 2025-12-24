package dsa_algorithms.slidingwindow2;

public class LargestSubarrayWithsum {
    public static void main(String[] args) {
        int[] arr= new int[]{11, 3, 2, 4, 5, 6, 7, 5, 3, 2, 6, 1,1,1,1,1,1,3, 2, 4, 8, 1, 3, 1};
        int limit=10;
        int maxSize=0;
        int sum=0;
        int right=0;
        int left=0;
        while(right< arr.length){
            sum+=arr[right];
            if(sum>limit){
                sum-=arr[left];
                left++;
            }
            else{
                maxSize++;
            }
            right++;
        }
        System.out.println(maxSize);
    }
}
