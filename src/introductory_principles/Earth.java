package introductory_principles;

public class Earth {

    // entry point for all java applications, code executed sequentially
    public static void main(String args[]){

        /*
        // define a variable (instance variable - points to the object) of type introductory_principles.Human
        introductory_principles.Human tom;

        // assign values to variable - object is created here
        // new: used when calling the constructor method when creating a new object
        tom = new introductory_principles.Human("Tom", 5, 72, "brown");

        // when constructor not explicitly defined need to assign values separately

        tom.age = 5;
        tom.eyeColour = "brown";
        tom.heightInches = 72;
        tom.name = "Tom Zsabo";

        tom.speak();    // invoke speak method on the object
        tom.walk();
        */

        Human human2 = new Human("Tom", 25 , 72, "brown");
        Human human1 = new Human("Joe", 22 , 69, "blue");

        human1.speak();
        human2.speak();
    }
}
