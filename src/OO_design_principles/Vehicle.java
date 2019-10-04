package OO_design_principles;

public class Vehicle {

    // vehicles respond to 3 messages by carrying out that behaviour
    public void startEngine(){
        System.out.println("Starting my engine");
    }
    public void stopEngine(){
        System.out.println("Stopping my engine");
    }
    public void accelerate(){
        System.out.println("accelerating myself...");
    }
}
