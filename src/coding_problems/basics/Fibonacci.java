package coding_problems.basics;

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

        System.out.println("Recursive Fibonacci:"+ fibonacciRecursive(3));
    }

    private static int fibonacciRecursive(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }
}
