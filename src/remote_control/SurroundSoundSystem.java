package remote_control;

public class SurroundSoundSystem implements Device {

    public void turnOn(){
        System.out.println("sound is on");
    }
    public void turnOff(){
        System.out.println("sound is off");
    }

    @Override
    public String toString() {
        return "SurroundSoundSystem";
    }
}
