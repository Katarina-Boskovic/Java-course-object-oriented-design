// parent class / superclass
public class Animal {

    String type;
    int age;
    String gender;

    public Animal(String type, int age, String gender){
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    public void info(){
        System.out.println("This animal is a " + gender + " " + type);
        System.out.println("it is " + age + " years old");
    }

    public void eat(){
        System.out.println("It's running...");
    }

    public void sleep(){
        System.out.println("It's swimming...");
    }
}
