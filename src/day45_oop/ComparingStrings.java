package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";//in string pool
        String word2 = "java";//re-use from string pool
        String word3 = new String("java"); //create in HEAP, outside String pool
        String word4 = new String ("java");//create in HEAP, outside String pool

        System.out.println(word1 == word2);//TRUE
        System.out.println(word1 == word3); //FALSE
        System.out.println(word3 == word4);//FALSE -> point to different objects in HEAP

        System.out.println(word1.equals(word2));//true it checks the data
        System.out.println(word1.equals(word3));//true it checks the data
        System.out.println(word3.equals(word4));//true it checks the data


    }

}
