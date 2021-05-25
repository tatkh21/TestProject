package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstanses {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,1,1,1,2,3,1,1,1,1,4,1));
        int n = 1;
        System.out.println(removeInstanse(list,n));
    }
    public static ArrayList<Integer> removeInstanse (ArrayList<Integer> list, Integer n) {
        int size = list.size();
        for (int i = 0; i < size ;i++) {
            if (list.get(i) == n) {
                list.remove(i);
                size -= 1;
                --i;
            }
        }
        return list;
    }
}
