package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TieBreaker {
    public static void main(String[] args) {
        String[] arr = {"Turin", "Nick", "Turin", "Nick"};
        int left=0;
        int right=0;
        Map<String, Integer> map = new HashMap<>();
        while(right<arr.length){
            if(map.containsKey(arr[right])){
                map.put(arr[right], map.get(arr[right]) + 1);
            }
            else{
                map.put(arr[right], 1);
            }
            right++;
        }
        System.out.println(map);
    }
}
