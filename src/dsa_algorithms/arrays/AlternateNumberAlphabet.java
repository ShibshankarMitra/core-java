package dsa_algorithms.arrays;

import java.util.Stack;

public class AlternateNumberAlphabet {
    public static void main(String[] args) {
        String str= "1b2cdd3c5g4f120xyz";
        Stack<Character> chars = new Stack<>();
        Stack<Integer> integers = new Stack<>();
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                integers.push(c-'0');
            }
            else if(Character.isAlphabetic(c)) {
                chars.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!chars.isEmpty() || !integers.isEmpty()) {
            if(!chars.isEmpty()) {
                sb.append(chars.pop());
            }
            if(!integers.isEmpty()) {
                sb.append(integers.pop());
            }
        }
        System.out.println(sb);
    }
}
