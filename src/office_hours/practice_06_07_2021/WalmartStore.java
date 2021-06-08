package office_hours.practice_06_07_2021;

import java.util.ArrayList;

public class WalmartStore {
    /*
      -> Instance variables:
        - location (String), totalWorth (double)
        - inventory (List of Items)

    -> Static variables:
        - company name (String),

    -> Constructor:
        - Accepts and initializes location, has an empty inventory

        - Overloaded: Accepts and initializes location, also accepts an ArrayList of Items for starting inventory

    -> Instance methods:

        - calculateWorth() -> Checks inventory, totals up amount of money all the items are worth.
         (each times price * quantity). Stores to the totalWorth variable

        - restockInventory(List of Item) -> Adds the given items to the store inventory.
            Challenge: If the item exists in the inventory already (same item name and price)
        - toString(): returns information about Item
     */
    String location;
    double totalWorth;
    ArrayList<Item> inventory;
    static String companyName;
    static {
        companyName = "Walmart";
    }

    public WalmartStore(String location) {
        this.location = location;
        this.inventory = new ArrayList<>();
    }
    public WalmartStore (String location, ArrayList<Item> allItems) {
        this.location = location;
       // this.inventory = allItems;
        this.inventory = new ArrayList<>(allItems);
        calculateWorth();
    }
    public void calculateWorth() {
        for (Item eachItem : inventory) {
            totalWorth += (eachItem.price * eachItem.quantity);
        }
    }


}
