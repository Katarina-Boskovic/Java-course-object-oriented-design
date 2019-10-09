package liskov_substitution_principle;

public class MathTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("taught math");
    }
}
