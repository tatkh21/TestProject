package my_Practice.saim_practice2;

public class ReplaceCharacters {
    public static void main (String[]args){
        String sentense = "Lets go outside, the weather is nice";
        int num = 3;

        if (num == 1) {
            System.out.println(sentense.replace("a", "e"));
        } else if (num == 2) {
            System.out.println(sentense.replace("s", "r"));
        } else if (num == 3){
            System.out.println(sentense.replace("o","z"));
        }


    }
}
