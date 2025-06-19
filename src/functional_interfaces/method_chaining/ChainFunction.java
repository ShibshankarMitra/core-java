package functional_interfaces.method_chaining;

import java.util.function.Function;

public class ChainFunction {
    public static void main(String[] args) {
        Function<String, Integer> stringToInt = Integer::parseInt;
        Function<Integer, Integer> multiplyByTwo = i -> i * 2;
        Function<Integer, String> convertToString = Object::toString;

        String result = stringToInt.andThen(multiplyByTwo).andThen(convertToString).apply("110");
        System.out.println("Result of method chaining: " + result);
    }
}
