package day32_arrays_split;

public class MallItem {
    public static void main (String[]args){
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,     150.0,   9.99,     250.0 ,   439.50,     39.99};
        int[] itemIDs =   {12345 ,    12346,   12347,    12348,     12349,     12350};

        System.out.println("--------------FIND THE INDEX OF 'GLOVES' IN ITEMS ARRAY'----------");
         for(int i = 0; i< items.length; i++) {
             if (items[i].contains("Gloves") ){
                 System.out.println(items[i] + " found at index " + i);
                 break;
             }
         }
        System.out.println("-------Set boolean to true if first 'IPad' if found--------");
         boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("IPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExists = " + iPadExists);

        System.out.println("-------Print report for each item--------");

        for (int i = 0; i < items.length; i++) {
            System.out.println(i+1 + "." + items[i] + " $" + prices[i] + " -#" + itemIDs[i] );
        }
        System.out.println("-----------LOOK FOR JACKET IN ITEMS AND PRINT ALL DETAILS");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println( items[i] + " - $" + prices[i] + " - #" + itemIDs[i] );
                break;
        }

        }


    }
    }


