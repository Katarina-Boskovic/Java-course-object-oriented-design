package singleton_design_pattern;

public class PerformanceStage {

    private static PerformanceStage INSTANCE = null;
    private static int counter;

    // singletons don't have a public constructor
    // private constructor:
    private PerformanceStage(){
        counter++;
    }

    public synchronized static PerformanceStage getInstance(){
        if(INSTANCE == null){
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights(){
        System.out.println("turned on lights...");
    }

    public int getCounter(){
        return counter;
    }
}
