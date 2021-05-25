package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 2,56, 67,75,87,230, 45);
        System.out.println("nums = " + nums);
        //nums.add(100);UnsupportedOperationException
        //nums.remove(0);UnsupportedOperationException
        //nums.clear();UnsupportedOperationException
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 34, 56, 89, 33));
        numsList.add(34);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(33));
        System.out.println("numsList = " + numsList);
        List <String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke",
                "pepsi", "mdew", "kambucha", "celsius"));
                int caffeinAmount = 0;
                for (String drink : drinksWithCaffeine){
                if (drink.equals("monster")|| drink.equals("red bull")|| drink.equals("celsius")) {
                    caffeinAmount = 150;
                    System.out.println(drink + " --> " + caffeinAmount);
                } else if(drink.equals("coffee") || drink.equals("kambucha")) {
                    caffeinAmount = 112;
                    System.out.println(drink + " --> " + caffeinAmount);
                } else if (drink.equals("tea")|| drink.equals("pepsi") || drink.equals("pepsi") || drink.equals("mdew")) {
                    caffeinAmount = 35;
                    System.out.println(drink + " --> " + caffeinAmount);
                }
    }
                for (String drink : drinksWithCaffeine) {
                    switch (drink) {
                        case"monster":
                            case "red bull":
                                case "celsius":
                            caffeinAmount = 150;
                            System.out.println(drink + " --> " + caffeinAmount);
                            break;
                        case "coffee" : case "kambucha":
                            caffeinAmount = 112;
                            System.out.println(drink + " --> " + caffeinAmount);
                            break;
                        case "tea": case"coke": case"pepsi": case"mdew":
                            System.out.println(drink + " --> " + caffeinAmount);
                            break;
                    }
        }
                drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
                drinksWithCaffeine.forEach(drink-> {
                    System.out.println("this is foreach block");
                    System.out.println("drink = " + drink);
                    System.out.println("----------------");
                });

    }

}
