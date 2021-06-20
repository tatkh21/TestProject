package day01;

public class my_first_class {
    static String color;
//    static{
//        System.out.println("Static block");
//    }

    public static void main (String[] args){
        System.out.println("Hello World!");
        String a = new String("2");
        String b = new String("2");
        String c = a;
        System.out.println(c==a);
        my_first_class class1 = new my_first_class();
        String color;
        color = "red";
     System.out.println(class1.color);
        System.out.println(class1.color);
        my_first_class class2 = new my_first_class();
        System.out.println(class2.color);



    }
    static {
        System.out.println("Static");
    }
}
