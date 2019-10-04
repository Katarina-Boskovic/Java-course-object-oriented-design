package OO_design_principles;

// driver depends on vehicle, needs a car to drive - association: relationship between classes
// here dependency association (driver depends on a car)
// have composition association: object composed of other objects, it implies ownership
// and aggregation association: does not apply ownership

public class Driver {
    public void drive(Vehicle raceCar){
        raceCar.accelerate();
    }
}
