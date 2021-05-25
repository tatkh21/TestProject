package day32_arrays_split;
import java.util.*;

public class MaxMinClass {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println(Arrays.toString(items));
        double max = 0;
        String maxItem = "";
        double min = prices[0];
        String minItem = "";
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                maxItem = items[i];
            } else if (prices[i] < min) {
                min = prices[i];
                minItem = items[i];
            }
        } System.out.println("Max Price is $"  + max + " for " + maxItem);
        System.out.println("Min Price is $"  + min + " for " + minItem);


    }
}
