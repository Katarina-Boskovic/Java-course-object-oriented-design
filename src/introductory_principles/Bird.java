package introductory_principles;

// child class
public class Bird extends Animal{


    public Bird(String type, int age, String gender) {
        super(type, age, gender);
    }

    public void move() {
        System.out.println("flapping wings...");
    }

}
