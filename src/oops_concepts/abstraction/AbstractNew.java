package oops_concepts.abstraction;

public abstract class AbstractNew {

    //can have solid or abstract methods (Solid methods can be default private or public) and only public abstract methods

    // can have final static non-final private and public fields
    public String str;
    private Integer i;
    public static final String CONSTANT ="constant";

    public AbstractNew(){
        //Even though it has a constructor It can not be instantiated
    }
    public abstract void m1();
    private void m2(){
        System.out.println("hello");
    };
}
