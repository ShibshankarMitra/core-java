package dsa_algorithms.slidingwindow;

import java.util.*;

class LongestNonRepeatingSubstring {
    //impl function here

    public Map.Entry<Integer, String> findLongestUniqueSubstring(String str){
        List<String> window= new ArrayList<>();
        List<String> charList = str.chars().mapToObj(c -> (char) c).map(Object::toString).toList();
        Map<String, Integer> subStringMap= new LinkedHashMap<>();
        for (String s : charList) {
            if (!window.contains(s)) {
                window.add(s);
            } else {
                int repeatedIndex = window.indexOf(s);
                window.subList(0, repeatedIndex + 1).clear();
                window.add(s);
            }
            String concat = window.stream().reduce("", (a, b) -> a + b);
            subStringMap.put(concat, concat.length());
        }
        subStringMap.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(e -> System.out.println(e.getKey()));
        return null;
    }


    public static void main(String[] args) {
        LongestNonRepeatingSubstring finder = new LongestNonRepeatingSubstring();
        Map.Entry<Integer, String> result = finder.findLongestUniqueSubstring("abcabcbb");
        int i = 'c' - 'b';
        System.out.println(i);
        System.out.println("Longest substring without repeating characters: "); // Expected output: (3, "abc")
    }
}

