package factory_design_pattern;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("started simple engine of car");
    }
}
