package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class NanukMethod {
    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>(Arrays.asList("4", "0", "5", "1", "2"));
        int way_stones = 3;
        int boast = 5;
        System.out.println(nanuk(r, way_stones, boast));

    }

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {
        int countNanuk = 0;
        int sumOfArray = 0;
        for (String each : r) {
            if (each.equals("nanuk")) {
                countNanuk++;
            } else {
                sumOfArray += Integer.parseInt(each);
            }
        }
        if (way_stones >= countNanuk && boast <= sumOfArray) {
            return true;
        } else {
            return false;
        }


    }
}
