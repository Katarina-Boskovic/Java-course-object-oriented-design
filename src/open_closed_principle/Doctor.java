package open_closed_principle;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("doctor in action...");
    }

    private void prescribeMedicine(){
        System.out.println("prescribing medicine");
    }
    private void diagnosePatients(){
        System.out.println("diagnosing patient");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
}
