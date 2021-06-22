package office_hours.practice_06_22_2021;

public class Target extends Shopping implements Shipping{

    @Override
    public void buyItem() {
        System.out.println("Buying items from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from Target");

    }

    @Override
    public boolean payForShipping(double price) {
        return false;
    }
}
