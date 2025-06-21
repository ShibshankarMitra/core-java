package dsa_algorithms.stacks;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String input = "2[a]3[d]";
        String s = decodeString(input);
        System.out.println(s);
    }

    public static String decodeString(String str) {
        Stack<StringBuffer> chars = new Stack<>();
        Stack<Integer> ints = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int num=0;
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)){
                num= num*10+(c-'0');
            } else if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else if (c=='[') {
                ints.push(num);
                chars.push(sb);
                sb = new StringBuffer();
                num=0;
            } else if (c==']') {
                StringBuffer temp = sb;
                System.out.println(sb);
                sb = chars.pop();
                int k= ints.pop();
                sb.append(String.valueOf(temp).repeat(k));
            }
        }
        return sb.toString();
    }
}
