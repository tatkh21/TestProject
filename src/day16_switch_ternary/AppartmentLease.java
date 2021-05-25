package day16_switch_ternary;

public class AppartmentLease {
    public static void main(String[] args) {
        System.out.println("**************Welcome to Adaire Appartments************");
        int numberOfBedrooms = 3;
        double startingPrice = 0;
        switch (numberOfBedrooms){
            case 0:
                startingPrice = 1454;
                System.out.println("Studio appartment selected for price: $" + startingPrice);
                break;
            case 1:
                startingPrice = 1670;
                System.out.println( numberOfBedrooms + "-bedroom appartments were selected for the price: $" + startingPrice);
                break;
            case 2:
                startingPrice = 2000;
                System.out.println(numberOfBedrooms + "-bedroom appartments were selected for the price : $" + startingPrice);
                break;
            default:
                System.out.println(numberOfBedrooms + "-bedroom appartments are not available right now");
                //return; exit main methode
        }



    }
}
