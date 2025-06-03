package java_8_streams;

import java.util.List;

public class IntersectionLists {
    public static void main(String[] args) {
        List<Integer> first= List.of(2,4,5,1,2,3,1,3,4,2,5,10,6,4,3,6,9,10,7);
        List<Integer> second= List.of(101,201,301,401,1,2,3);
        first.stream().distinct().filter(i->second.contains(i)).forEach(System.out::println);
    }
}
