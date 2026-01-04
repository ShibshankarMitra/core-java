package design_patterns.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String cpu, String storage) {
        switch (type){
            case "Desktop" : {
                return new Desktop(ram, cpu, storage);
            }
            case "Laptop" : {
                return new Laptop(ram, cpu, storage);
            }
            default: return null;
        }
    }
}
