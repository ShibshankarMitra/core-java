package oops_concepts.inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        D d= new D();
        d.m1();
    }
}

@FunctionalInterface
interface A{
    default void m1(){
        System.out.println("A-> m1()");
    }
    void m2();
}

@FunctionalInterface
interface B extends A{
    default void m1(){
        System.out.println("B-> m1()");
    }
}

@FunctionalInterface
interface C extends A{
    default void m1(){
        System.out.println("C-> m1()");
    }
}


class D implements B, C{
    //you can either override the method or call the super method of one of the interfaces
    // this way we can achieve multiple inheritance in Java
    public void m1(){
        B.super.m1();
    }

    //this one is not example of multiple inheritance as you are simply implementing the method
    // no feature is being inherited from the Interfaces
    public void m2() {
        System.out.println("D-> m2()");
    }
}

