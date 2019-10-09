package liskov_substitution_principle;

public class SchoolStaff {

    private void makeAnnouncements(){
        System.out.println("made announcements");
    }
    private void takeAttendance(){
        System.out.println("took attendance");
    }
    private void collectPaperwork(){
        System.out.println("collected paperwork");
    }
    private void conductHallwayDuties(){
        System.out.println("conducted hallway duties");
    }
    public void performOtherResponsibilities(){
        makeAnnouncements();
        takeAttendance();
        collectPaperwork();
        conductHallwayDuties();
    }

    public static void main(String args[]){
        MathTeacher mathTeacher1 = new MathTeacher();
        mathTeacher1.performOtherResponsibilities();
        mathTeacher1.teach();
    }
}
