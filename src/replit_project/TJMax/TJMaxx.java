package replit_project.TJMax;

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {
    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        this.regularItems = new ArrayList<>();
        this.onSaleItems = new ArrayList<>();

    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);


    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);


    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {

        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {

        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
        List <String> allItemsNames = new ArrayList<>();

       for (int i = 0; i < regularItems.size() ; i++) {
           allItemsNames.add(regularItems.get(i).getName());
       }
       for (int j= 0; j< onSaleItems.size(); j++ ) {
           allItemsNames.add(onSaleItems.get(j).getName());
       }
       return allItemsNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        for (int i = 0; i < regularItems.size(); i++) {
            if ( regularItems.get(i).getCatalogNumber() == catalogNumber) {
                return regularItems.get(i).getPrice();
            }
        }

        for (int i = 0; i < onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                return onSaleItems.get(i).getPrice();
           }
        }

        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        OnSaleItem onSale = null;
        for (int i = 0; i < onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getName().equals(name)) {
                onSale = onSaleItems.get(i);
            }
        } return onSale;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

        for (int i = 0; i < regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                regularItems.remove(regularItems.get(i));
            }
        }
        for (int i = 0; i < onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                onSaleItems.remove(regularItems.get(i));
                }
            }
        }


    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        for (int i = 0; i < regularItems.size() || i < onSaleItems.size(); i++) {
            if (i < regularItems.size()) {
                if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                    regularItems.get(i).setQuantity(regularItems.get(i).getQuantity() - 1);
                }
                if (regularItems.get(i).getCatalogNumber() == 0) {
                    removeItem(regularItems.get(i).getCatalogNumber());
                }
                if (i < onSaleItems.size()) {
                    if (onSaleItems.get(i).getPrice() == catalogNumber) {
                        onSaleItems.get(i).setQuantity(onSaleItems.get(i).getQuantity() - 1);
                    } if (onSaleItems.get(i).getQuantity() == 0) {
                        removeItem(onSaleItems.get(i).getCatalogNumber());
                    }
                }
            }
        }



    }


}
