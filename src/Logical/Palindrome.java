package Logical;

public class Palindrome {
    public static void main(String[] args) {
        Integer number= 1001;
        Integer reverse=0;
        while (number>0){
            reverse= reverse*10+number%10;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
