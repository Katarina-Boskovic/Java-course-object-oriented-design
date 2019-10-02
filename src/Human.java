public class Human {

    String name;
    int age;
    int heightInches;
    String eyeColour;

    // constructor method (same name as class) - do not have to define it explicitly
    public Human(String name, int age, int heightInches, String eyeColour) {
        // this: variable pointing to the current object
        this.name = name;
        this.age = age;
        this.heightInches = heightInches;
        this.eyeColour = eyeColour;
    }

    // methods
    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInches + " tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye colour is " + eyeColour);
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("working...");
    }
}
