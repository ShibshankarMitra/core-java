package dsa_algorithms.slidingwindow;

import java.util.*;

class LongestNonRepeatingSubstring {

    public Map.Entry<Integer, String> findLongestUniqueSubstring(String str){
        Set<Character> existing= new HashSet<>();
        List<String> substrings = new ArrayList<>();
        int left=0;
        int right=0;
        int maxSize=0;
        while(right<str.length()){
            char currentChar = str.charAt(right);
            if(!existing.contains(currentChar)) {
                existing.add(currentChar);
                if(maxSize<right-left+1) {
                    substrings.add(str.substring(left,right+1));
                    maxSize=right-left+1;
                }
                right++;
            }
            else {
                while(existing.contains(currentChar)) {
                    existing.remove(str.charAt(left));
                    left++;
                }
            }
        }
        System.out.println(substrings.getLast());
        return null;
    }


    public static void main(String[] args) {
        LongestNonRepeatingSubstring finder = new LongestNonRepeatingSubstring();
        Map.Entry<Integer, String> result = finder.findLongestUniqueSubstring("abcdabcbb");
        System.out.println("Longest substring without repeating characters: "); // Expected output: (3, "abc")
    }
}

