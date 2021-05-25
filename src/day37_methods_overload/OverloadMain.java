package day37_methods_overload;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello from real main method");
        main(10);
        System.out.println(Arrays.toString(args));
        main(true);
    }
    public static void main (int num) {
        System.out.println("num = " + num);
        /*
        overloading main method:
        same name +different parameters
        JDK does not look for this one to run
         */

    }
    public static void main (boolean b) {
        System.out.println("b = " + b);
    }
}
