package day58_polimorphism.online_shoping;

public abstract class OnlineShopping {
    public abstract void buy ();
    public abstract void sell ();
    public  void ship () {
        System.out.println("Shipping the purchase item");
    }
}
