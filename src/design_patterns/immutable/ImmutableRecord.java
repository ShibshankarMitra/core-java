package design_patterns.immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * @param name immutable members with parameterized constructor and public getters, but no setters
 * @param lis  for mutable field members, you need to set using a deep copy during construction,as well as return a deep copy during getter
 */
public record ImmutableRecord(String name, Integer number, List<String> lis) {

    //Custom constructor for deep copy
    public ImmutableRecord(String name, Integer number, List<String> lis) {
        this.name = name;
        this.number = number;
        this.lis = new ArrayList<>(lis);
    }

    //Custom getter for lis() with deep copy
    @Override
    public List<String> lis() {
        return new ArrayList<>(lis);
    }

    public static void main(String[] args) {
        ImmutableRecord obj1 = new ImmutableRecord("a", 100, List.of("ssm"));
    }
}
