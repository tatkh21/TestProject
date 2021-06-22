package office_hours.practice_06_22_2021;
/*
Create a concrete class Ebay
- Inherit OnlineShopping and implement all abstract methods
 */
public class Amazon extends OnlineShopping implements AllowUsersToSell {

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {

    }

    @Override
    public void returnItem() {
        System.out.println("Returning itema to Amazon");
    }

    @Override
    public void viewCart() {
        System.out.println("Adding items to Cart");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Amazon seller");
    }
}
