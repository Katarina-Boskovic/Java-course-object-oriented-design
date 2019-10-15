package factory_design_pattern;

public class Bus implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("started large engine of bus");
    }
}
