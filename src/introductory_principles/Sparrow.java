package introductory_principles;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(String type, int age, String gender) {
        super(type, age, gender);
    }

    public void fly() {
        System.out.println("introductory_principles.Sparrow flying...");
    }
}
