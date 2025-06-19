package design_patterns.decorator;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a basic car.");
    }
}
