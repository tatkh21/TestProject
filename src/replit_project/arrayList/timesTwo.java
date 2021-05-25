package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class timesTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 7, 9, 4, 0));

        System.out.println(timesTwo(list));

    }

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
           list.set(i, list.get(i) * 2);


        } return list;


    }
}
