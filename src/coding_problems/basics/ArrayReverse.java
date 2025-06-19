package coding_problems.basics;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(array)));
    }

    private static int[] reverse(int[] array){
        int len = array.length;
        int[] reversed= new int[len];
        for(int i= len-1; i>=0; i--){
            reversed[len-1-i]= array[i];
        }
        return reversed;
    }
}
