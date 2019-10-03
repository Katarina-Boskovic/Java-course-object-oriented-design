public class Chicken extends Bird {

    public Chicken(String type, int age, String gender) {
        super(type, age, gender);
    }

    // overriding the method inherited from Bird
    public void fly(){
        System.out.println("not able to fly");
    }

}
