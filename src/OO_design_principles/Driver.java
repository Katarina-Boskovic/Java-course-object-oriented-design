package OO_design_principles;

// driver depends on vehicle - association: relationship between classes
// here dependency association
// have composition association: object composed of other objects
// and aggregation association: does not apply ownership

public class Driver {
    public void drive(Vehicle raceCar){
        raceCar.accelerate();
    }
}
