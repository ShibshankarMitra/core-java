package coding_problems.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Duplicate Elements from integers
public class DuplicateElementsInIntegerList {

    public static void main(String[] args) {
        List<Integer> integers= List.of(1,2,3,1,3,4,2,5,6,4,3,6,9,10,7,5);
        integers.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
