package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsString {

    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>(Arrays.asList("one apple","two orange"," four banana"));
        String find = "f";
        System.out.println(search(r,find));

    }
    public static String search(ArrayList<String> r, String find) {
        String searchResult = "";
        for (String word : r) {
            if (word.contains(find)) {
                searchResult = word;
                break;
            } else {
                searchResult = "search failed";
            }

            } return searchResult;
    }

}
