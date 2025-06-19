package coding_problems.basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.println(checkLeapYear(year));
    }

    public static boolean checkLeapYear(int year) {
        boolean isLeap = false;
        if(year % 400 == 0) {
            isLeap = true;
        }
        else if(year % 100 != 0 && year % 4 == 0) {
            isLeap = true;
        }
        return isLeap;
    }
}
