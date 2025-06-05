package dsa_algorithms.slidingwindow;

import java.util.*;

class LongestNonRepeatingSubstring {

    public Map.Entry<Integer, String> findLongestUniqueSubstring(String str){
        Set<Character> existing= new HashSet<>();
        int left=0;
        int right=0;
        int maxSize=0;
        while(right<str.length()){
            if(!existing.contains(str.charAt(right))){
                existing.add(str.charAt(right));
                if((right-left+1)>maxSize){
                    maxSize=right-left+1;
                    System.out.println(str.substring(left,right+1));
                }
                right++;
            }
            else{
                existing.remove(str.charAt(left));
                left++;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        LongestNonRepeatingSubstring finder = new LongestNonRepeatingSubstring();
        Map.Entry<Integer, String> result = finder.findLongestUniqueSubstring("abcdabcbb");
        System.out.println("Longest substring without repeating characters: "); // Expected output: (3, "abc")
    }
}

