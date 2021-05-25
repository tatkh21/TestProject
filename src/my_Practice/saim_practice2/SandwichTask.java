package my_Practice.saim_practice2;
/*
A sandwich is two pieces of bread with something in between. Print the string that is
 between the first and last appearance of "bread" in the given string, or return string
 "nothing" if there are not two pieces of bread.
 input:breadjambread
 output:jam
 input:xxbread
 output:nothing
 */

public class SandwichTask {
    public static void main(String[] args) {
        String str = "breadjambread";
        boolean isValid = false;
        if (str.contains("bread")) {
            int firstBread = str.indexOf("bread");
            if (str.substring(firstBread+5).contains("bread")) {//jambread
                //int secondBread = str.substring(firstBread+5).indexOf("bread");
                int secondBread = str.lastIndexOf("bread");
                String result = str.substring(firstBread + 5, secondBread);
                if (result.isEmpty()) {
                    System.out.println("nothing");
                }else {
                    System.out.println(result);
                }
            }


        } else{
            System.out.println("nothing");

        }


    }
}
