package day32_arrays_split;

public class MaxMinPrice2 {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        double maxPrice = prices[0];// assume first price is max
        int indexOfMaxPrice = 0;// assume max prise is at index 0

        for (int i = 0; i < prices.length; i++) {
            if (maxPrice < prices[i]) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }
        System.out.println("Max price = " + maxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + maxPrice + " - #" + itemIDs[indexOfMaxPrice]);



    }
}
