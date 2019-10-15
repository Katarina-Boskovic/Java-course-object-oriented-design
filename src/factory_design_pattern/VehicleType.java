package factory_design_pattern;

public enum VehicleType {
    CAR{
        public Vehicle getVehicle(){
            return new Car();
        }
    },
    TRUCK{
        public Vehicle getVehicle(){
            return new Truck();
        }
    },
    ELECTRIC{
        public Vehicle getVehicle(){
            return new ElectricCar();
        }
    },
    BUS{
        public Vehicle getVehicle(){
            return new Bus();
        }
    };

    abstract Vehicle getVehicle();
}
