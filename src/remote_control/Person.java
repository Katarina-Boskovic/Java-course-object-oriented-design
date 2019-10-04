package remote_control;

public class Person {
    public static void main(String args[]){

        RemoteControl remoteControl = RemoteControl.getInstance();
        Device myTV= new TV();
        Device myProjector = new Projector();
        Device mySoundSystem = new SurroundSoundSystem();

        remoteControl.connectToDevice(myProjector);
        remoteControl.switchOn();
        remoteControl.connectToDevice(myTV);
        remoteControl.switchOn();
        remoteControl.switchOff();
        remoteControl.connectToDevice(mySoundSystem);
    }
}
