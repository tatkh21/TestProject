package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEveryOther {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","book", "boo"));
        System.out.println(removeEveryOther(list));

    }
    public static ArrayList<String> removeEveryOther(ArrayList<String> word) {
        int size = word.size()/2;
        if (word.size() % 2 == 0) {
            size--;
        }
        for (int i = 0; i <= size; i++ ) {
            word.remove(i);
        }

        return word;

    }
}
