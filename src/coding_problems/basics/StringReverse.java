package coding_problems.basics;

public class StringReverse {

    public static void main(String[] args) {
        String s= "Shibsankar";
        System.out.println(reverse(s));
    }

    public static String reverse(String str) {
        String reduce = str.chars().mapToObj(c -> (char) c).reduce("", (c1, c2) -> c2 + c1, String::concat);
        return reduce;
    }
}
