package oops_concepts.abstraction;

public abstract class AbstractNew {

    // can have final static non-final private and public fields
    public String str;
    private Integer i;
    public static final String CONSTANT ="constant";

    //Even though it has a constructor It can not be instantiated
    public AbstractNew(){
    }

    //can have non-abstract or abstract methods (Solid methods can be static default private or public) and only public abstract methods
    // can not have final or static abstract methods
    public abstract void m1();
    public static void m3(){
        System.out.println("hello static");
    }
    private void m2(){
        System.out.println("hello");
    };
}
