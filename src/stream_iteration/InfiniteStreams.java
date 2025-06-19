package stream_iteration;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {

        //ways to generate a finite stream
        IntStream.range(1, 10).forEach(System.out::println);
        LongStream.range(1, 10).forEach(System.out::println);

        //ways to generate an infinite stream
        IntStream.iterate(1, i -> i + 1).limit(10).forEach(System.out::println);
        IntStream.generate(() -> 1).limit(10).forEach(System.out::println);
        Stream.iterate("        ", s -> s.substring(0, s.length()-2) + "A").limit(5).forEach(System.out::println);
    }
}
