package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentense = "java strings are fun";
        System.out.println(sentense);
        System.out.println(sentense.replace("a", "u"));
        System.out.println(sentense.replace("java", "python"));
        System.out.println(sentense.replace("java", ""));
    }
}
