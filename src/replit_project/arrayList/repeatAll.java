package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class repeatAll {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true,false,false));
        repeatAll(list);

    }
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean>list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.add(list.size(), list.get(i));
        }
        return list;
    }
}
