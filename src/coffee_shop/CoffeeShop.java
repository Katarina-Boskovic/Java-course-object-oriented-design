package coffee_shop;

public class CoffeeShop {

    public static void main(String[] args) {

        Customer bob = new Customer("Bob", "coffee");
        Customer bill = new Customer("Bill", "latte");

        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();

        coffeeAttendant.takeOrder(bob);
        coffeeAttendant.takeOrder(bill);

        coffeeAttendant.prepareDrink("coffee");

        Customer joe = new Customer("Joe", "tea");
        coffeeAttendant.takeOrder(joe);

        coffeeAttendant.prepareDrink("latte");
        coffeeAttendant.prepareDrink("tea");

        coffeeAttendant.callOutCompletedOrder();
    }
}
