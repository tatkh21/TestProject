package replit_project.OOP.creditCard;

public class CardObject {
    public static void main(String[] args) {
        Discover discover = new Discover();
        System.out.println(discover);

        CapitalOne capitalOne = new CapitalOne(12345676544L, 2345.0);
        capitalOne.useCard();
        System.out.println(capitalOne);

        Chase chase = new Chase();

    }
}
