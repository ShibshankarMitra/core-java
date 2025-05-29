package OopsConcepts.inheritance;

public class Multiple {
    public static void main(String[] args) {
        D d= new D();
        d.m1();
    }
}

interface A{
    default void m1(){
        System.out.println("A-> m1()");
    }
}

interface B extends A{
    default void m1(){
        System.out.println("B-> m1()");
    }
}

interface C extends A{
    default void m1(){
        System.out.println("C-> m1()");
    }
}


class D implements B, C{
    public void m1(){
        B.super.m1();
    }
}

