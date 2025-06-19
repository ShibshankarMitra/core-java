package design_patterns.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String cpu, String storage) {
        if ("Laptop".equalsIgnoreCase(type)) {
            return new Laptop(ram, cpu, storage);
        } else if ("Desktop".equalsIgnoreCase(type)) {
            return new Desktop(ram, cpu, storage);
        }
        return null; // or throw an exception
    }
}
