package day21_string_manipulation;

public class StringIngexOf {
    public static void main(String[] args) {
        String word = "github project";
        System.out.println(word.indexOf("g"));//0
        System.out.println(word.indexOf("u"));//4
        System.out.println(word.indexOf("hub"));//3 give only position of first letter
        System.out.println(word.indexOf("java"));//-1 if can not find
        System.out.println(word.indexOf("t"));//2 only gives index of first letter
        System.out.println(word.lastIndexOf("t"));//13 gives the index of last "t"
        System.out.println(word.indexOf("t"));//2 gives the index of first "t"


    }
}
