package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        counters(7);
        int num2 = 999;
       // counters(num2);
        String word = "wooden spoon";
        counters(word.length());
        printAge(1977);


    }
    public static void printAge (int year) {
        int age = 2021 - year;
        System.out.println("Birth year : " +year + ". Age : " + age);
    }


    public static void counters (int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
