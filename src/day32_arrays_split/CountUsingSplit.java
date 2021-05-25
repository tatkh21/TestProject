package day32_arrays_split;

import java.util.Arrays;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no cat here";
        int count = 0;
        String[] catArray = catTypes.split("cat");
        System.out.println(Arrays.toString(catArray));
        System.out.println("number of 'cat' = " + (catArray.length-1));
        for (String type : catArray) {
            System.out.println(type);
        }








//        for (int i = 0; i < cats.length() - 2; i++) {
//            if (cats.substring(i, i + 3).equals("cat")) {
//                count++;
//            }
//        }
    }
}
