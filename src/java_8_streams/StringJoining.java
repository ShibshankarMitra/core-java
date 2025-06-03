package java_8_streams;

import java.util.List;

// Join the String elements of a list with a prefix and suffix and comma-delimited

public class StringJoining {
    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c");
        List<String> list = strings.stream().map(s -> "[" + s + "]").toList();
        String join = String.join(",", list);
        System.out.println(join);
    }
}
