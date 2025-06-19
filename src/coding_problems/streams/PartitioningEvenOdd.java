package coding_problems.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningEvenOdd {
    public static void main(String[] args) {
        List<Integer> first= List.of(2,4,5,1,2,3,1,3,4,2,5,10,6,4,3,6,9,10,7);
        Map<Boolean, List<Integer>> collect = first.stream().distinct().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(collect);
    }
}
