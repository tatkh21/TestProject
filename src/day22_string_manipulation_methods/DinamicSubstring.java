package day22_string_manipulation_methods;

public class DinamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(++colonIndex));
        System.out.println();
        System.out.println(result.substring(result.indexOf(":") + 1));

        String today = "i learned [java] today";
        System.out.println(today.indexOf("[") + 1);
        System.out.println(today.indexOf("]"));
        System.out.println(today.substring(11,15));
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));
    }
}
