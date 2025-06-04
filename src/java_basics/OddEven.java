package java_basics;

import java.util.List;
import java.util.stream.IntStream;

public class OddEven {
    public static void main(String[] args) {
        //create a list of Integers from 1 to 20
        List<Integer> list = IntStream.range(1, 20).boxed().toList();
        list.forEach(i->System.out.println(i%2==0?"Even: "+i:"Odd: "+i));
    }
}
