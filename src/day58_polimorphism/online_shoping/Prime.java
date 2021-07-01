package day58_polimorphism.online_shoping;

public interface Prime {
    void primeShipping();
    default void freeOfCharge(double price) {
        if (price > 50.00) {
            System.out.println("Your shipping is free");
        } else {
            System.out.println("your shipping is not free");
        }


    }
}
