package builder_pattern.exercise;

public class Vehicle {

    private double price;
    private String type;
    private String make;
    private int horsePower;
    private  String model;
    private  String colour;
    private int doors;

    private Vehicle(Builder builder){
        this.price = builder.price;
        this.type = builder.type;
        this.make = builder.make;
        this.horsePower = builder.horsePower;
        this.model = builder.model;
        this.colour = builder.colour;
        this.doors = builder.doors;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", doors=" + doors +
                '}';
    }

    public static class Builder{

        private double price;
        private String type;
        private String make;
        private int horsePower;
        private  String model;
        private  String colour;
        private int doors;

        public Builder(){
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder type(String value){
            this.type = value;
            return this;
        }

        public Builder make(String value){
            this.make = value;
            return this;
        }

        public Builder horsePower(int value){
            this.horsePower = value;
            return this;
        }

        public Builder model(String value){
            this.model = value;
            return this;
        }

        public Builder colour(String value){
            this.colour = value;
            return this;
        }

        public Builder doors(int value){
            this.doors = value;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }

    }

}
