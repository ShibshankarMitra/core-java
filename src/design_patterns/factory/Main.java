package design_patterns.factory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("Laptop", "16GB", "Intel i7", "512GB SSD");
        Objects.requireNonNull(laptop).display();

        Computer desktop = ComputerFactory.getComputer("Desktop", "32GB", "AMD Ryzen 9", "1TB HDD");
        Objects.requireNonNull(desktop).display();
    }
}
