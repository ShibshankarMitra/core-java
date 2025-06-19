package coding_problems.basics;

public class GcdNumbers {
    public static void main(String[] args) {
        int a = 24;
        int b = 60;
        System.out.println(gcd(a,b));
    }

    public static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return y;
        }
        if (x == y) {
            return x;
        }
        if (x > y) {
            return gcd(x-y, y);
        }
        else return gcd(x, y-x);
    }
}
