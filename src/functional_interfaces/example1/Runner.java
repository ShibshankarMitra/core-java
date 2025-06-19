package functional_interfaces.example1;

public class Runner {
    public static void main(String[] args) {
        MathOperator multiplyOperator = (a, b) -> a*b;
        double result = multiplyOperator.operate(20, 30);
        System.out.println(result);

        //can be defined as a lambda expression
        CommandExecutor executor= ()-> {
            System.out.println("Executing Hello World from Lambda expression");
        };
        executor.execute();

        //Or can be defined as an anonymous class
        CommandExecutor executor2 = new CommandExecutor() {
            @Override
            public void execute() {
                System.out.println("Executing Hello World from anonymous class");
            }
        };
        executor2.execute();
    }
}
