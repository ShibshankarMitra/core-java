package java_basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Palindrome {

    public static void main(String[] args) {
        String str= "AD " +
                " IDAS";
        System.out.println(isPalindrome(str));
        getDistinctChar(str);
        List<Integer> integers= List.of(1,2, 13,34,2,5,8);
        Integer reduce = integers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        Optional<Integer> min = integers.stream().sorted(Comparator.reverseOrder()).limit(2).min(Comparator.naturalOrder());
        System.out.println(min.get());
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        System.out.println(format);
        HashMap<String, Integer> map= new HashMap<>();
        map.put("A", 400);
        map.put("B", 300);
        map.put("C", 500);
        map.put("D", 100);
        TreeMap<Integer, String> sortedMap= new TreeMap<>();
        map.entrySet().stream().forEach(e->{
            sortedMap.put(e.getValue(), e.getKey());
        });
        System.out.println(sortedMap);
    }

    private static boolean isPalindrome(String s){
        boolean result= false;
        String reduce = s.chars().mapToObj(c -> (char) c).reduce("", (c1, c2) -> c2 + c1, String::concat);
        return reduce.equals(s);
    }

    private static void getDistinctChar(String s){
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

    }
}

