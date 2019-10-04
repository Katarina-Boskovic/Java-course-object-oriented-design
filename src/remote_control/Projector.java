package remote_control;

public class Projector implements Device {

    public void turnOn(){
        pullDownProjectorScreen();
        System.out.println("projector is on");
    }

    public void turnOff(){
        pullUpProjectorScreen();
        System.out.println("projector is off");
    }

    public void pullDownProjectorScreen(){
        System.out.println("screen pulled down");
    }

    public void pullUpProjectorScreen(){
        System.out.println("screen raised back up");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
