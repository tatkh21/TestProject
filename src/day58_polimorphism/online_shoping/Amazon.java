package day58_polimorphism.online_shoping;

public class Amazon extends OnlineShopping implements Prime{
    @Override
    public void buy() {
        System.out.println("Buying items on Amazon");

    }

    @Override
    public void sell() {
        System.out.println("Selling things on Amazon");

    }

    @Override
    public void primeShipping() {
        System.out.println("Free-2day shipping for prime users");
    }
}
