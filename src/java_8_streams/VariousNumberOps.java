package java_8_streams;

import java.util.Comparator;
import java.util.List;

public class VariousNumberOps {
    public static void main(String[] args) {
        List<Integer> integerList= List.of(12,15,19,10,12,20,20,1,5,1,3,20);
        //limiting to first 2
        integerList.stream().limit(2);
        //skipping first 2
        integerList.stream().skip(2);
        //transforming all values
        integerList.stream().map(i-> i+100);
        integerList.stream().map(Math::sqrt);
        //filtering few
        integerList.stream().filter(i-> i%2==0);
        //min max sort count avg
        integerList.stream().min(Comparator.naturalOrder());
        integerList.stream().max(Comparator.naturalOrder());
        integerList.stream().sorted(Comparator.naturalOrder());
        integerList.stream().count();
        integerList.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();

        Integer reduce = integerList.stream().distinct().reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
