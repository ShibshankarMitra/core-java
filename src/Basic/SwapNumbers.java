package Basic;

public class SwapNumbers {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;
        swap(a, b);
    }
    private static void swap(int a, int b){
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(a);
        System.out.println(b);
    }
}
