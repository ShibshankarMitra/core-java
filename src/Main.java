import java.util.*;
import java.util.stream.Collectors;

class Main {
    //impl function here

    public Map.Entry<Integer, String> findLongestUniqueSubstring(String str){
        Set<Character> charSet= new HashSet<>();
        List<String> collect = str.chars().mapToObj(c -> (char) c).filter(c -> charSet.add(c))
                .map(c->c.toString())
                .collect(Collectors.toList());
        Integer count = (int) collect.stream().count();
        String reduce = collect.stream().reduce("", (s1, s2) -> s1 + s2, String::concat);
        System.out.println(collect);
        Map<Integer, String> map= new HashMap<>();
        map.put(count,reduce);
        return map.entrySet().stream().findFirst().get();
    }


    public static void main(String[] args) {
        Main finder = new Main();
        Map.Entry<Integer, String> result = finder.findLongestUniqueSubstring("abcabcbb");
        System.out.println("Longest substring without repeating characters: " + result); // Expected output: (3, "abc")
    }
}

