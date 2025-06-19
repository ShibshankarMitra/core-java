package design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .display("4K Monitor")
                .keyboard("Mechanical Keyboard")
                .graphicsCard("NVIDIA RTX 3080")
                .cooler("Liquid Cooler")
                .build();

        System.out.println(computer);
    }
}
