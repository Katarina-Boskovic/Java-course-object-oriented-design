package dependency_injection;

public class SmallEngine implements Engine {

    private int horsePower;

    public SmallEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("started small " + horsePower + "hp engine");
    }
}
