package office_hours.practice_05_05_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class LookAtArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two"));

//        for (String each : list) {
//            System.out.println(each);
//            if (each.length() == 3){
//                list.remove(each);
//            }
//        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (list.get(i).length()==3) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);

    }
    public static ArrayList<Integer> method1(){
        return new ArrayList<>();
    }
    public static int method2(ArrayList<String>words) {
        return 0;
    }
    public static ArrayList<Integer> method1(ArrayList<String>words){
        return null;
    }
}
