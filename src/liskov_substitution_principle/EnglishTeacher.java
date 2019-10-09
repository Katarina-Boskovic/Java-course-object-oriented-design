package liskov_substitution_principle;

public class EnglishTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("taught english");
    }
}
