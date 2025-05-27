package Test;

import java.util.Optional;

public class StreamApi {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String ("abc");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));



        String name1 = null;
        System.out.println("name1  " + Optional.of(name1));
    }
}
