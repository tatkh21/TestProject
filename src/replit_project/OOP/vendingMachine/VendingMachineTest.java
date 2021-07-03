package replit_project.OOP.vendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        DrinkVendingMachine vending = new DrinkVendingMachine(
                new Drink("Iced Coffee",4.50,10),
                new Drink("Iced Tea",2.50,5),
                new Drink("Smart Water",4.0,20),
                new Drink("Coke",2.30,13),
                new Drink("Bottle Water", 1.5, 0));
        System.out.println(vending.toString());

    }
}
