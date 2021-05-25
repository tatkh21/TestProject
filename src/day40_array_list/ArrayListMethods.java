package day40_array_list;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String>shoppingList = new ArrayList();
        System.out.println(("size = " + shoppingList.size()));
        System.out.println("isEmpty = " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("Code Java and go to mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("Java book");
        shoppingList.add("sun glasses");
        shoppingList.add("tesla");
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("Code Java and go to mall");
        }
        int count = shoppingList.size();

        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));

        if (shoppingList.contains("mask")) {
            System.out.println("Don't forget to buy mask");
        } else {
            System.out.println("Mask is not on the list dont forget to add it");
        }
        System.out.println("Buying mask .....$5 ");
        shoppingList.remove("mask");
        System.out.println(shoppingList);
        shoppingList.clear();
        System.out.println(shoppingList);




    }
}
