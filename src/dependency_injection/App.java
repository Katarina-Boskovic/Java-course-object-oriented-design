package dependency_injection;

public class App {

    public static void main(String args[]){

        // dependency injection: instantiate an engine when creating Vehicle
        // can become messy if Vehicle has too many variables (e.g. tire, colour, etc)
        // rely on framework to handle dependency management for us: spring
        Vehicle raceCar = new Vehicle(new SmallEngine(100));
        raceCar.crankIgnition();
    }
}
