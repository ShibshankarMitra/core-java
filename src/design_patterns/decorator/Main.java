package design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar= new SportsCar(new LuxuryCar(new BasicCar()));
        sportsCar.assemble();
    }
}
