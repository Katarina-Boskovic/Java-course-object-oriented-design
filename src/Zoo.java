public class Zoo {

    public static void main(String args[]){

        Animal animal1 = new Animal("tiger", 5, "female");
        animal1.info();
        animal1.eat();

        Bird bird1 = new Bird("bird", 1, "m");
        bird1.eat();

        Chicken chicken1 = new Chicken("bird", 2, "f");

        Sparrow sparrow1 = new Sparrow("bird", 1, "f");
        sparrow1.fly();
    }

}