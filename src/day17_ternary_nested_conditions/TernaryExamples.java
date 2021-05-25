package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main (String[]args){
        int score = 65;
        String quality = "good";
        String result = (score > 60) ? "pass" : "fail";
        System.out.println(quality.equals("good") ? 100 : 0);
        int x = (quality.equals("good")) ? 100 : 0;
        char grade = (score > 90) ? 'A' : 'B';
        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println("result = " + result);
        System.out.println("quality = " + quality);

        int score3 = 100;

        char grade1 = (score3 == 100) ? 'A' : 'B';



    }
}
