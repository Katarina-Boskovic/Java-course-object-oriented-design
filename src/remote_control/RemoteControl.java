package remote_control;

public class RemoteControl {

    private Device device = null;
    private static final RemoteControl INSTANCE =   new RemoteControl();

    private RemoteControl(){}

    public static RemoteControl getInstance(){
        return INSTANCE;
    }

    public void connectToDevice(Device aDevice){
        this.device = aDevice;
        System.out.println("connected to " + device);
    }
    public void switchOn(){
        device.turnOn();
    }
    public void switchOff(){
        device.turnOff();
    }
}
