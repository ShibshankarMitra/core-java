package java_basics;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;
        while(sum<100){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
    }
}
