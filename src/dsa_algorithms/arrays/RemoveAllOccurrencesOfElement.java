package dsa_algorithms.arrays;

public class RemoveAllOccurrencesOfElement {
    public static void main(String[] args) {
        int[] arr= {7, 10, 1, 3, 6, 9, 2, 1, 6, 1};
        //remove element 1
        int index= 0;
        for(int i: arr){
            if (i!=1){
                arr[index++]=i;
            }
        }
        System.out.println(index);
    }
}
