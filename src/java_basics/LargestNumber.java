package java_basics;

public class LargestNumber {
    public static void main(String[] args) {
        int a= 123;
        int b= 312;
        int c= 231;
        int result= Math.max(Math.max(a,b), c);
        System.out.println(result);
    }
}
