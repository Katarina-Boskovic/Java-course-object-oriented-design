package OO_design_principles;

// objects have identity, state and behaviour
// objects carry out behaviour in response to messages they receive

public class App {
    public static void main(String args[]){

        Vehicle myCar = new Vehicle();
        Vehicle anotherCar = new Vehicle();

        myCar.accelerate();
        anotherCar.accelerate();

        Driver aDriver = new Driver();
        aDriver.drive(myCar);
    }
}
