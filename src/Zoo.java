public class Zoo {

    public static void main(String args[]){

        Animal animal1 = new Animal("tiger", 5, "female");
        animal1.info();
        animal1.eat();

        Bird bird1 = new Bird("bird", 1, "m");
        bird1.eat();
        bird1.fly();
    }

}