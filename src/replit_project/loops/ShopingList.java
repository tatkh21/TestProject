package replit_project.loops;
import java.util.Scanner;
public class ShopingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        do {  System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            countinue = "Item" + count + ": " + item +
                    " Price:" + price + ", ";
            totalPrice += price;
            shoppingListReport +=countinue;
            System.out.println("Add one more item?");
            String answer = scan.next();
            if (answer.equals("yes")){
                count++;
            } else {
                shoppingListReport = shoppingListReport.substring(0, shoppingListReport.lastIndexOf(","));
                break;
            }
        } while (count <= 10);

        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);
    }

}
