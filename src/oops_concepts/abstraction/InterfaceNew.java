package oops_concepts.abstraction;

@FunctionalInterface
public interface InterfaceNew {

    // can have public static final fields (constants) defaulted
    String CONSTANT= "constant";
    //public int i; not allowed

    //can have public abstract methods, default and static methods
    //Default methods in interfaces allow an interface to provide a default implementation for a method, without requiring implementing classes to override it.
    // This is a feature introduced in Java 8 and similar features exist in other languages like C#.
    // They enable interfaces to evolve and add new functionality without breaking compatibility with existing implementations.

    void m1();

    default Integer m2(){
        return 100;
    }

    static void m3(){
        System.out.println("inside Interface");
    }
}
