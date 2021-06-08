package day1;

public class New {
    public static void main(String[] args) {
        String str1 ="AAABBBCCCDEF";
        String unique = "";
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            count = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i)==str1.charAt(j)) {
                    count++;
                }

                }
            if ((count == 1)){
                unique += "" + str1.charAt(i);
            }

        }
        System.out.println(unique);
    }
}
