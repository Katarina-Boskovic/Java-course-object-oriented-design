package liskov_substitution_principle;

public abstract class Teacher {

    public abstract void teach();

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
        performOtherResponsibilities();
    }

}
