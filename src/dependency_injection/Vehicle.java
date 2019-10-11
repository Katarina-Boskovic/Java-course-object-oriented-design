package dependency_injection;

public class Vehicle {

    // implement dependency injection
    Engine myEngine;

    public Vehicle(Engine anEngine){
        myEngine = anEngine;

    }

    public void crankIgnition(){

        myEngine.startEngine();
        System.out.println("vehicle is running");
    }
}
