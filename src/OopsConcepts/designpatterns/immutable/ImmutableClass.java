package OopsConcepts.designpatterns.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    //immutable members with parameterized constructor and public getters, but no setters
    private final String name;
    private final Integer number;

    //for mutable field members, you need to set using a deep copy during construction,
    //as well as return a deep copy during getter
    private final List<String> lis;

    public ImmutableClass(String name, Integer number,List<String> lis ) {
        this.name = name;
        this.number = number;
        this.lis= new ArrayList<>(lis);
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public List<String> getLis() {
        return new ArrayList<>(lis);
    }

    public static void main(String[] args) {
        ImmutableRecord obj1= new ImmutableRecord("a", 100, List.of("ssm"));
    }
}
