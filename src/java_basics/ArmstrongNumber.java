package java_basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range number: ");
        int x = sc.nextInt();
        System.out.print("Enter upper range number: ");
        int y = sc.nextInt();
        calculateArmstrong(x,y);
    }
    private static void calculateArmstrong(int x, int y) {
        for (int i = x; i <= y; i++) {
            if(checkArmstrong(i)){
                System.out.println(i);
            };
        }
    }
    private static boolean checkArmstrong(int num) {
        int sum = 0;
        int order= getOrder(num);
        int i= num;
        while(i> 0){
            sum= sum +(int) Math.pow(i%10, order);
            i= i/10;
        }
        return sum==num;
    }

    private static int getOrder(int num) {
        int order = 0;
        while(num > 0){
            num=num/10;
            order++;
        }
        return order;
    }
}
