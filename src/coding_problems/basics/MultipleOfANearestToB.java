package coding_problems.basics;

import java.util.Scanner;

public class MultipleOfANearestToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A : ");
        int a = sc.nextInt();
        System.out.println("Enter the number B : ");
        int b = sc.nextInt();
        int result=0;

        int rem= b%a;
        if(rem<=a/2){
            result=b-rem;
        }
        else{
            result=b+a-rem;
        }
        System.out.println(result);
    }
}
