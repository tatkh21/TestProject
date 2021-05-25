package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class blogDb {
    public static void main(String[] args) {
        ArrayList<String[]> r = new ArrayList<String[]>();
        r.add (new String[]{"1","title","content1"});
        r.add(new String[]{"2","another title","content2"});
        r.add(new String[] {"3","yet another title","content3"});
        String id = "3";
        System.out.println(blogDbt(r, id));

    }
    public static String blogDbt(ArrayList<String[]> r, String id) {
        String result = "";
        for (String[] each : r) {
            if (each[0].equals(id)) {
                result = each[1] +"\n"+ each[2];
            }


        }return result;
    }
}
