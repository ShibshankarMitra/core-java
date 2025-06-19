package coding_problems.basics;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printAllPrimeUpto(n);
    }
    public static void printAllPrimeUpto(int n) {
        for (int i = 1; i < n; i++) {
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
