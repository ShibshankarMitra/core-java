package design_patterns.singleton;

public enum SingletonEnum {

    INSTANCE;
    public void execute() {
        System.out.println("Executing SingletonEnum method.");
    }

    public static void main(String[] args) {
        // Accessing the singleton instance
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        // Calling a method on the singleton instance
        singleton.execute();

        // Demonstrating that the same instance is returned
        SingletonEnum anotherSingleton = SingletonEnum.INSTANCE;
        System.out.println(singleton == anotherSingleton); // Should print true
    }
}
