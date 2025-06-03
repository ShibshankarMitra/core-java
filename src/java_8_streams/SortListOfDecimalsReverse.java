package java_8_streams;

import java.util.Comparator;
import java.util.List;
// Sort list of decimals in reverse order

public class SortListOfDecimalsReverse {

    public static void main(String[] args) {
        List<Double> decimals = List.of(2.234, 0.003, 1.45, 12.23, 0.1, 0.14);
        List<Double> sortedDecimals = decimals.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedDecimals);
    }
}
