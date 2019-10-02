// child class
public class Bird extends Animal{


    public Bird(String type, int age, String gender) {
        super(type, age, gender);
    }

    public void fly() {
        System.out.println("flying...");
    }

}
