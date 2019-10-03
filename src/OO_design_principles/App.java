package OO_design_principles;

public class App {
    public static void main(String args[]){
        Vehicle myCar = new Vehicle();
        Vehicle anotherCar = new Vehicle();

        myCar.accelerate();
        anotherCar.accelerate();
    }
}
