package office_hours.practice_06_22_2021;

public class Practice {
    public static void main(String[] args) {
        /*
        create a method that gives you l;ast three chars
         */
        String s = "Hello";
        System.out.println(returnLastThree(s));

    }
    public static String returnLastThree(String s ) {
        String str = s.substring(s.length()-3);
        return str;

    }
}
