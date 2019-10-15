package builder_pattern.exercise;

public class App {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle.Builder()
                .price(10000)
                .type("car")
                .make("Honda")
                .horsePower(150)
                .model("Accord")
                .colour("red")
                .doors(4)
                .build();

        System.out.println(myVehicle);
    }
}
