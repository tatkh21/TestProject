package replit_project.arrayList;

import java.util.ArrayList;
import java.util.List;

public class combineRs {
    public static void main(String[] args) {
        String[] str1 = {"f","o","o"};
        String[] str2 = {"b","a","r"};
        System.out.println(combineArs(str1,str2));

    }
    public static ArrayList<String> combineArs(String[] str1,String[] str2) {
        ArrayList<String> str3 = new ArrayList<>();
        for (int i = 0; i < str1.length; i++) {

                str3.add(str1[i]);
            }
            for (int i = 0; i < str2.length; i++) {
                str3.add(str2[i]);
            } return str3;
        }



    }

