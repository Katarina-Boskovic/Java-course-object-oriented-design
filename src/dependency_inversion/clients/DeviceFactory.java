package dependency_inversion.clients;

import dependency_inversion.processes.GeneralManufacturingProcess;
import dependency_inversion.processes.LaptopManufacturingProcess;
import dependency_inversion.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String args[]){

        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("iPhone process");
        manufacturer.launchProcess();

        GeneralManufacturingProcess manufacturer2 = new LaptopManufacturingProcess("Mac process");
        manufacturer2.launchProcess();
    }
}
