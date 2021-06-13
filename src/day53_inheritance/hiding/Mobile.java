package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";
    /*
    Method hiding
    we are hiding use() static
     */
    public static void use() {
        System.out.println("Using mobile phone");
    }
    public void text() {
        use();
        System.out.println("and sending a text message");
    }
    @Override
    public void call() {
        use();
        System.out.println(" and callind on mobile");
    }

}
