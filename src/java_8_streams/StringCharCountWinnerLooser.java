package java_8_streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringCharCountWinnerLooser {
    public static void main(String[] args) {
        String str= "swiss";
        LinkedHashSet<String> charSet= new LinkedHashSet<>();
        Map<Character, Long> charCount = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        List<Long> counts = charCount.entrySet().stream().map(Map.Entry::getValue).toList();
        System.out.println(counts);
        Long maxCount = counts.stream().max(Long::compareTo).orElse(0L);
        System.out.println(maxCount);
        Long minCount = counts.stream().min(Long::compareTo).orElse(0L);
        System.out.println(minCount);
        if(Collections.frequency(counts, maxCount)==1){
            charCount.entrySet().stream()
                    .filter(e -> Objects.equals(e.getValue(), maxCount))
                    .forEach(e -> {System.out.println(e.getKey());});
        }
        if(Collections.frequency(counts, minCount)==1){
            charCount.entrySet().stream()
                    .filter(e -> Objects.equals(e.getValue(), minCount))
                    .forEach(e -> {System.out.println(e.getKey());});
        }
    }
}
