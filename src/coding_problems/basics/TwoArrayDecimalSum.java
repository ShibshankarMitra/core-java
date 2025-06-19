package coding_problems.basics;

import java.util.Arrays;

public class TwoArrayDecimalSum {
    public static void main(String[] args) {
        int[] arr1= {3,4,4};
        int[] arr2= {2,6};
        int[] arr3= new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            int top;
            int bottom;
            try{
                top = arr1[arr1.length-1 - i];
            }
            catch(Exception e){
                top=0;
            }
            try{
                bottom = arr2[arr2.length-1 - i];
            }
            catch(Exception e){
                bottom=0;
            }
            if(top!=0 || bottom!=0){
                arr3[arr3.length-1-i]+=(top+bottom)%10;
                if((top+bottom)/10>0) {
                    arr3[arr3.length - 1 - i - 1] = (top + bottom) / 10;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
