package coding_problems.streams;


// Find the Strings that start with a number

import java.util.List;

public class StringStartingWithNumber {
    public static void main(String[] args) {
        List<String> strings = List.of("1wer", "ww1", "ww");
        strings.forEach(s->{
            String substring = s.substring(0, 1);
            if( Character.isDigit(substring.charAt(0))){
                System.out.println(s);
            }
        });
    }
}
