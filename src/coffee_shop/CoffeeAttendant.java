package coffee_shop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<Customer> customerList;
    private List<String> completedDrinks;


    public CoffeeAttendant() {
        customerList = new ArrayList<Customer>();
        completedDrinks = new ArrayList<String>();
    }

    public void takeOrder(Customer customer){
        customerList.add(customer);
        System.out.println("Coffee Attendant: '" + customer.getName() + ", I've started working on your order of " +
                customer.getDrinkOrdered() + "'");
    }

    public void prepareDrink(String drinkToBePrepared){
        double timeTaken = Math.random() * 10; // value between 1 and 50
        try{
            Thread.sleep((long) (timeTaken)*1000);
            completedDrinks.add(drinkToBePrepared);
        }
        catch (InterruptedException e){
            System.out.println("For some reason drink was not prepared");
        }
    }

    public void callOutCompletedOrder(){
        for(String readyDrink: completedDrinks){
            System.out.println("Order up: " + readyDrink);
            for(Customer customer: customerList){
                customer.orderReady(readyDrink);
            }
        }
    }
}
