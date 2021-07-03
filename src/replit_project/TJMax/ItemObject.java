package replit_project.TJMax;

public class ItemObject {
    static TJMaxx store = new TJMaxx();
    public static void main(String[] args) {
        Item item1 = new Item("hat", 10, 125, 3.5);
        Item item2 = new Item("cap", 5, 127, 3.5);
        Item item3 = new Item("dress", 5, 120, 3.5);
        Item item4 = new Item("pants", 5, 121, 3.5);
        int itemRegularQuantity = 4;
        TJMaxx tjMaxx = new TJMaxx();
        tjMaxx.addRegularItem(item1);
        tjMaxx.addRegularItem(item2);
        tjMaxx.addRegularItem(item3);
        tjMaxx.addRegularItem((item4));
        System.out.println(tjMaxx.getRegularItems().get(1).getCatalogNumber());
        System.out.println(tjMaxx.onSaleItemsCount());




    }
}
