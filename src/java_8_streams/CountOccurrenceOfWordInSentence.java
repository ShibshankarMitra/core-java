package java_8_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceOfWordInSentence {
    public static void main(String[] args) {
        String sentence = "I am an indian, and I am proud about it. I love my country.";
        String newSentence = sentence.replaceAll("\\.", "").replaceAll(",", "");
        List<String> strings = Arrays.asList(newSentence.split(" "));
        Map<String, Long> collect = strings.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(collect);
    }
}
