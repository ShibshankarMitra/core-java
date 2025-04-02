package Basic;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Give a number");
        int i = new Scanner(System.in).nextInt();
        System.out.println(fact(i));
    }

    private static int fact(int i) {
        if (i == 1 || i == 0) {
            return 1;
        } else {
            return fact(i - 1) * i;
        }
    }
}
