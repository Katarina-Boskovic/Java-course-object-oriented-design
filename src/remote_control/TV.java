package remote_control;

public class TV implements Device {

    public void turnOn(){
        System.out.println("tv is on");
    }

    public void turnOff(){
        System.out.println("tv is off");
    }

    @Override
    public String toString() {
        return "TV";
    }
}
