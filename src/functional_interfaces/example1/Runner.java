package functional_interfaces.example1;

public class Runner {
    public static void main(String[] args) {
        MathOperator multiplyOperator = (a, b) -> a*b;
        double result = multiplyOperator.operate(20, 30);
        System.out.println(result);

        CommandExecutor executor= ()-> {
            System.out.println("Executing Hello World");
        };
        executor.execute();
    }
}
