package open_closed_principle;

public class Nurse extends Employee {

    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("nurse in action...");
    }

    private void checkVitalSigns(){
        System.out.println("checking vital signs");
    }
    private void drawBlood(){
        System.out.println("drawing blood");
    }
    private void cleanPatientArea(){
        System.out.println("cleaning patient area");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }
}
