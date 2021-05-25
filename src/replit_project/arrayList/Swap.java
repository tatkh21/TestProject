package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","c","b","d","e"));
        int position1 = 0;
        int position2 = 3;
        System.out.println(swap(list,position1,position2));

    }
    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {
        String temp1 = list.get(pos1);
        list.set(pos1,list.get(pos2));
        list.set(pos2,temp1);

//        String temp2 = "";
//        for (int i = 0; i < list.size(); i++) {
//            if (i == pos1) {
//                temp1 = list.get(i);
//            } if (i == pos2) {
//                temp2 = list.get(i);
//            }
//        }
//        list.add(pos2,temp1);
//        list.remove(pos1);
//        list.add(pos1,temp2);
//        list.remove(++pos2);
        return list;
    }



    }
