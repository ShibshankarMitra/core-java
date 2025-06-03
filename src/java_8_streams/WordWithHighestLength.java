package java_8_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


//Find words from a sentence with the 3rd highest length
public class WordWithHighestLength {
    public static void main(String[] args) {
        String sentence = "I am an indian, and I am proud about it. I love my country.";
        String newSentence = sentence.replaceAll("\\.", "").replaceAll(",", "");
        List<String> strings = Arrays.asList(newSentence.split(" "));
        Optional<Integer> min = strings.stream().map(String::length).sorted(Comparator.reverseOrder()).limit(3).min(Comparator.naturalOrder());
        int count = min.orElse(0);
        strings.stream().filter(s->s.length()==count).forEach(System.out::println);
    }

    public static int getLength(String str) {
        return str.length();
    }
}
