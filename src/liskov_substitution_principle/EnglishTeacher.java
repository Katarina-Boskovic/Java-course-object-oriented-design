package liskov_substitution_principle;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor {
    @Override
    public void teach() {
        System.out.println("taught english");
    }
}
