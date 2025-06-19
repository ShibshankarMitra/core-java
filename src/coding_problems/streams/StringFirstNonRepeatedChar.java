package coding_problems.streams;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFirstNonRepeatedChar {
    public static void main(String[] args) {
        String str= "swiss";
        LinkedHashSet<String> charSet= new LinkedHashSet<>();
        List<Character> chars = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).toList();
        Character reduce = chars.stream().reduce(null, (c1, c2) -> {
            if(c1==null){
                return c2;
            }
            else if (str.indexOf(c1) < str.indexOf(c2)) {
                return c1;
            } else {
                return c2;
            }
        });
        System.out.println(reduce);
    }
}
