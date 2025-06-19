package design_patterns.factory;

public class Desktop extends Computer {
    public Desktop(String ram, String cpu, String storage) {
        super(ram, cpu, storage);
    }

    @Override
    public void display() {
        System.out.println("Displaying Desktop with RAM: " + getRam() + ", CPU: " + getCpu() + ", Storage: " + getStorage());
    }
}
