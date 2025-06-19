package functional_interfaces.constructor_chaining;

public class ConstructorChaining {
    private int a;
    private String s;

    public ConstructorChaining() {
    }

    public ConstructorChaining(int a, String s) {
        // this is an example of constructor chaining
        this();
        this.a = a;
        this.s = s;
    }

    public ConstructorChaining(int a) {
        this(a, "default");
    }

    public static void main(String[] args) {
        ConstructorChaining obj1 = new ConstructorChaining();
        ConstructorChaining obj2 = new ConstructorChaining(10, "Hello");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
