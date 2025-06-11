package dsa_algorithms;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String input = "2[a]3[d]";
        String s = decodeString(input);
        System.out.println(s);
    }

    public static String decodeString(String s) {
        int n = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> integers = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n=n*10 + (c - '0');
            } else if (c == '[') {
                integers.push(n);
                n = 0;
                strings.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k= integers.pop();
                StringBuilder temp = sb;
                sb= strings.pop();
                while (k-->0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
