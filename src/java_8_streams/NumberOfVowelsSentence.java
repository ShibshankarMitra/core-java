package java_8_streams;

import java.util.Arrays;
import java.util.List;

//Find the words with k number of vowels in a given sentence
public class NumberOfVowelsSentence {
    public static void main(String[] args) {
        int k= 2;
        String sentence = "I am an indian, and I am proud about it. I love my country.";
        String newSentence = sentence.replaceAll("\\.", "").replaceAll(",", "");
        List<String> strings = Arrays.asList(newSentence.split(" "));
        strings.stream().filter(s->hasKVowels(s, k)).forEach(System.out::println);
    }

    public static boolean hasKVowels(String s, int k){
        long count = s.chars().mapToObj(c -> (char) c)
                .map(c -> c.toString().toUpperCase())
                //.distinct()
                .filter(NumberOfVowelsSentence::isVowel)
                .count();
        return count==k;
    }

    public static boolean isVowel(String s){
        List<String> vowels= List.of("A", "E", "I", "O", "U");
        return vowels.contains(s.toUpperCase());
    }
}
