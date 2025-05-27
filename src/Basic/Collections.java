package Basic;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SSM");
        list.add("BARCA");
        list.add("Inter");
        Set<String> set = new HashSet<>(list);

        Map<String, Object> map= new HashMap<>();
    }
}
