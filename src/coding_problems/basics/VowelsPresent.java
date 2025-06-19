package coding_problems.basics;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class VowelsPresent {

    public static void main(String[] args) {
        String word= "sad";
        System.out.println(vowelsPresent(word));
    }
    private static boolean vowelsPresent(String s){
        AtomicBoolean result = new AtomicBoolean(false);
        List<String> vowels= List.of("A", "E", "I", "O", "U");
        s.chars().mapToObj(c->(char)c).forEach(c->{
            if(vowels.contains(c.toString().toUpperCase())){
                result.set(true);
            }
        });
        return result.get();
    }
}
