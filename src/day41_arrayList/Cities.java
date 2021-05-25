package day41_arrayList;

import java.util.ArrayList;

public class Cities {
    public static void main(String[]args){
        //declair array list alt/option + enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabad to first index
        cities.add(0,"Ashgabad");
        // print all values in same line
        System.out.println(cities);
        //print first and last cities
        System.out.println("first city " + cities.get(0));
        System.out.println("last city "+ cities.get(5));
        // find last index using size
        System.out.println("last city = " + cities.get(cities.size() - 1));
        System.out.println("count of items = " + cities.size());
        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");
        // for loop and print all values in same line
        for (int i = 0; i < cities.size()/2; i++) {
            System.out.print(cities.get(i) + " " );
        }
        System.out.println();
        for(String each: cities) {
            System.out.print(each + " ");
        }
        //delete item from arraylist
        //1) remove using index. delete value at index 3
        cities.remove(3);
        // 2) remove using object/vallue
        cities.remove("New York");
        System.out.println("after remove " + cities);
        // delete /remove all values
        cities.clear();
        //1)print|spit it out
        System.out.println("cities = " + cities);
        //2)using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }
        //3) check size() == 0;
        if (cities.size() == 0 ){
            System.out.println("list is empty");
        }


    }
}
