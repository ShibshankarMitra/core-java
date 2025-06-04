package dsa_algorithms.slidingwindow;

import java.util.*;
import java.util.stream.Collectors;

public class StringFirstNonRepeatedChar {
    public static void main(String[] args) {
        String str= "swissw";
        List<String> charList = str.chars().mapToObj(c -> (char) c).map(Objects::toString).toList();
        List<String> window= new ArrayList<>();
        for (String s : charList) {
            if(!window.contains(s)){
                window.add(s);
            }
            else{
                window.remove(s);
                window.add(s);
            }
        }
        System.out.println(window.getFirst());
    }
}
