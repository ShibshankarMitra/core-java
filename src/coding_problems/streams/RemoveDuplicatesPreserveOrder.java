package coding_problems.streams;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//return true if list contains duplicates
//Remove Duplicate Elements from integers, Preserve Order
public class RemoveDuplicatesPreserveOrder {
    public static void main(String[] args) {
        List<Integer> integers= List.of(1,2,3,1,3,4,2,5,10,6,4,3,6,9,10,7);
        Set<Integer> set = new LinkedHashSet<>();
        integers.stream().filter(set::add).forEach(System.out::println);
        //return true if list contains duplicates
        boolean b = integers.stream().anyMatch(i -> !set.add(i));
    }
}
