package office_hours.practice_06_07_2021;

import java.util.ArrayList;

public class WalmartTest {
    public static void main(String[] args) {
        WalmartStore storeOne = new WalmartStore("VA");
        System.out.println(storeOne);

        Item pen = new Item ("pen", 1.4, 10);
        Item hat = new Item("hat", 3.5, 20);
        ArrayList<Item> allItem = new ArrayList<>();
        allItem.add(pen);
        allItem.add(hat);
        WalmartStore storeTwo = new WalmartStore("IL",allItem);
        System.out.println(storeTwo);

        System.out.println(WalmartStore.companyName);
    }
}
