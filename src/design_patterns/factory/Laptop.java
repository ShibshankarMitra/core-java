package design_patterns.factory;

public class Laptop extends Computer {
    public Laptop(String ram, String cpu, String storage) {
        super(ram, cpu, storage);
    }

    @Override
    public void display() {
        System.out.println("Displaying Laptop with RAM: " + getRam() + ", CPU: " + getCpu() + ", Storage: " + getStorage());
    }
}
