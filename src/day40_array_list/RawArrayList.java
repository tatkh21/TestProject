package day40_array_list;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //Declare raw arraylist
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();
        //add values
        list1.add("java");
        list1.add("coffee");
        list1.add(true);
        list1.add(2345);
        list1.add(34.7);
        list1.add("wooden spoon");
        System.out.println(list1);
        System.out.println("size = " + list1.size());


    }
}
