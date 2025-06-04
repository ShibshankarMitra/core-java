package java_basics;

import java.util.Scanner;

public class SwapNumbers {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number: ");
int num1 = sc.nextInt();
System.out.println("Enter the second number: ");
int num2 = sc.nextInt();
num2= num1+num2;
num1=num2-num1;
num2=num2-num1;
System.out.println("num1="+num1);
System.out.println("num2="+num2);
}
}
