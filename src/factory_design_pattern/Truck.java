package factory_design_pattern;

public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("started a large engine of truck");
    }
}
