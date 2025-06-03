package java_8_streams;

import java.util.Arrays;
import java.util.Optional;

// Find the last element of a given array

public class LastElementOfAnArray {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 12;
        intArray[2] = 8;
        intArray[3] = 21;
        intArray[4] = 5;

        Optional<Integer> first = Arrays.stream(intArray).boxed().skip(intArray.length - 1).findFirst();
        first.ifPresent(System.out::println);
    }
}
