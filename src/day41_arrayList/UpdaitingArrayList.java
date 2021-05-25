package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdaitingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        //jeep, lada, yugo, toyta, mazda, ford, moskvich, tesla

        System.out.println(myCars.toString());// pints all cars
        String  allCarsIn1St = myCars.toString();// save all caars in 1 string variable
        System.out.println("allCArsIn1St = " + allCarsIn1St);
        System.out.println("---------------------");

        //change index 0 to Lamborghini
        System.out.println(myCars.set(0, "Lamborghini"));

        System.out.println("after set = " + myCars.toString());
        //change index 4 to honda
        myCars.set(4, "honda");
        System.out.println("after set = " + myCars.toString());

        /*
        How would you do that if myCars was array
        myCars[4] = "Honda";
         */
        //find the index number of "ford"
       // String str = "java";
       // str.indexOf("v")==> 2;
        System.out.println("index of ford = " + myCars.indexOf("ford"));
          int moskvichIndex = myCars.indexOf("moskvich") ;
        System.out.println("moskvichIndex = " + moskvichIndex);
        //change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");
        System.out.println("myCars = " + myCars);
        // replacce ford with trabant using one single statment
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println(myCars);
        //lada ==> bugatti

        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti") ;
            System.out.println("New list is " + myCars);
        } else {
            System.out.println("Lada is not found");
        }
        /*
        lamborghini -> prius
        lada -> lexus
        trabant -> audi
         */
        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                myCars.set(i , "prius");
                }
            else if (myCars.get(i).equals("yugo")) {
                    myCars.set(i , "lexus");
            }
            else if (myCars.get(i).equals("trabant")) {
                myCars.set(i , "audi");
            }
        }
        System.out.println("My new list is " + myCars);


    }

}
