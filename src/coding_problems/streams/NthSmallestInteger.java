package coding_problems.streams;

import java.util.Comparator;
import java.util.List;

// nth smallest number in the list of integers
public class NthSmallestInteger {
    public static void main(String[] args) {
        List<Integer> integers= List.of(1,2,3,1,3,4,2,5,10,6,4,3,6,9,10,7);
        Integer i = integers.stream().distinct().sorted(Comparator.naturalOrder()).limit(3).max(Comparator.naturalOrder()).orElse(0);
        System.out.println(i);
    }
}
