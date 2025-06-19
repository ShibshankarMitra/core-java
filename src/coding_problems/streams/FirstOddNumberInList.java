package coding_problems.streams;

import java.util.List;

public class FirstOddNumberInList {
    public static void main(String[] args) {
        List<Integer> integers= List.of(2,4,5,1,2,3,1,3,4,2,5,10,6,4,3,6,9,10,7);
        integers.stream().filter(i-> i%2!=0).limit(1).forEach(System.out::print);
    }
}
