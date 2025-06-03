package java_8_streams;

// If a String is palindrome or not
public class StringPalindrome {
    public static void main(String[] args) {
        String str= "daddy";
        String reduce = str.chars().mapToObj(c -> (char) c).map(Object::toString).reduce("", (s1, s2) -> s2 + s1, String::concat);
        System.out.println(reduce.equals(str));
    }
}
