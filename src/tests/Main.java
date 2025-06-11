package tests;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        removeAlternateChars();
        printDeque();
        sumOfFirstKNumbers(5);
        System.out.println(gcd(24, 36));
        System.out.println(lcm(24, 36));
        System.out.println(ifAnagram("listen", "silent"));
    }

    public static void removeAlternateChars() {
        String str = "GeeksforGeeks";
        StringBuilder builder = new StringBuilder();
        int index=0;
        while(index<str.length()){
            if(index%2==0){
                builder.append(str.charAt(index));
            }
            index++;
        }
        System.out.println(builder.toString());
    }

    public static void printDeque() {
        java.util.Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        System.out.println("Elements in Deque: " + deque);
    }

    public static void sumOfFirstKNumbers(int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + k + " numbers is: " + sum);
    }

    public static int gcd(int a, int b) {
       if(a == b) {
           return a;
       } else if(a > b) {
           return gcd(a-b, b);
       } else {
           return gcd(a, b-a);
       }
    }

    public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        while(true){
            if(max%a ==0 && max%b == 0) {
                return max;
            }
            max++;
        }
    }

    public static boolean ifAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        } else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            String sorted1 = new String(charArray1);
            String sorted2 = new String(charArray2);
            if(sorted1.equals(sorted2)) {
                return true;
            }
        }
        return false;
    }

}
