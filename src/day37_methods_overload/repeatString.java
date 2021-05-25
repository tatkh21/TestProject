package day37_methods_overload;

public class repeatString {
    public static void main(String[] args) {
        System.out.println(repeatString("hi", 3, '|'));
        System.out.println(repeatString( "java", 10, '='));
    }
    public static String repeatString(String word, int num, char delimeter) {
        String retValue = "";

        for (int i = 1; i <= num; i++) {


            if (i == num) {
                retValue += word;
            } else {
                retValue += word + delimeter;
            }

        }return retValue;
    }
    }
