package java_8_streams;

import java.util.List;

public class PrimeNumbersStreams {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 9973);
        integers.stream().filter(PrimeNumbersStreams::isPrime).forEach(System.out::println);
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        for (int i = number/2; i > 1; i--) {
            if(number%i==0){
                result=false;
                break;
            }
        }
        return result;
    }
}
