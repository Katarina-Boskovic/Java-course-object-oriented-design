package dependency_inversion.processes;

public abstract class GeneralManufacturingProcess {

    public String processName;
    public GeneralManufacturingProcess(String name){
        processName = name;
    }

    // protected scope: only children of GenManProcess will have access to these methods
    // in java if there are classes in the same package as this class but are not children will still have access to
    // these methods - make sure classes that don't need visibility to these methods are in a different package
    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    // template method - used for abstracting workflows, defines the program skeleton in the method
    // defines the general flow
    public void launchProcess(){

        if(processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        }
        else{
            System.out.println("no process name was specified");
        }
    }
}
