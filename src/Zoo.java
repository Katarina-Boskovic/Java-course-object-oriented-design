public class Zoo {

    public static void main(String args[]){

        Bird bird1 = new Bird("bird", 1, "m");
        bird1.eat();

        Chicken chicken1 = new Chicken("bird", 2, "f");

        Sparrow sparrow1 = new Sparrow("bird", 1, "f");
        sparrow1.fly();

        // can use Animal as type, the object is of type sparrow but variable is of type animal
        Animal sparrow2 = new Sparrow("bird", 3, "m");
        sparrow2.move();

        Fish fish1 = new Fish("fish", 1, "m");

        moveAnimal(fish1);
        moveAnimal(sparrow1);

        // only has one method: fly
        Flyable flyingBird = new Sparrow("bird", 1, "male");
        flyingBird.fly();

        // will not work, Bird doesn't implement Flyable type
        // Flyable flyingBird2 = new Bird("bird", 3, "female");
    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }

}