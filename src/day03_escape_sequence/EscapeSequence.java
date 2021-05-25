package day03_escape_sequence;

public class EscapeSequence {
    public static void main (String[]args){
        System.out.println ("I love \"java\" programming");
        System.out.println ("Lets buy \"coffee\" and \"tea\".");
        System.out.println ("\\");
        System.out.println ("java\nintellij");
        System.out.println ("\tjava\tsalenium\tapi");
        System.out.println ("\t\tjava\t\tsalenium\t\tapi");
        System.out.println("***\t***\t***");
        System.out.println("\t***\t***\t***");
        String topic1 = "Java";
        String topic2 = "SQL";

        System.out.println("I will learn \"" + topic1 + "\" and \"" + topic2 +
                "\" at CybertekSchool.");

    }
}
