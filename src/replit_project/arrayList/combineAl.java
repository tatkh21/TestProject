package replit_project.arrayList;

import day41_arrayList.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class combineAl {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>( Arrays.asList(1,34,56));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(11,384,563,45));



        System.out.println(combineAl(arr1, arr2));
    }
    public static ArrayList<Integer> combineAl(ArrayList<Integer> a, ArrayList<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < a.size() || i < b.size(); i++) {
            if (i < a.size()) {
                arr3.add(a.get(i));
            }
            if (i < b.size()) {
                arr3.add(i + 1, b.get(i));
            }

            System.out.println(arr3);
        }


        return arr3;
    }
}
