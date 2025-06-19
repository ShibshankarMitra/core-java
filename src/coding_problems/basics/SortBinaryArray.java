package coding_problems.basics;

public class SortBinaryArray {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,0,1,0,1};
        int i=0;
        int j=1;
        while (j < arr.length) {
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[i]==arr[j]){
                j++;
            }
        }
        for (int k : arr) {
            System.out.print(k);
        }
    }
}
