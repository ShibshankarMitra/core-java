package design_patterns.factory;

public class Main {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("Laptop", "16GB", "Intel i7", "512GB SSD");
        laptop.display();

        Computer desktop = ComputerFactory.getComputer("Desktop", "32GB", "AMD Ryzen 9", "1TB HDD");
        desktop.display();
    }
}
