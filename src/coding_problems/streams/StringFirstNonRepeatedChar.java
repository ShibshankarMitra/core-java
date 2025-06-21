package coding_problems.streams;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringFirstNonRepeatedChar {
    public static void main(String[] args) {
        String str= "swiss";
        Set<Character> set = new LinkedHashSet<>();
        str.chars().mapToObj(c->(char)c).forEach(
                c->{
                    if(!set.contains(c)){
                        set.add(c);
                    }
                    else{
                        set.remove(c);
                    }
                }
        );
        set.stream().findFirst().ifPresent(System.out::println);
    }
}
