package day36_methods;
/*
method name:
    checkEligible
input/parameter:
    int creditScore

if creditScore is 700 or more
    you are eligible for leasing this car
otherwise
    Sorry, you are not eligible for leasing this car
 */

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(670);
        checkEligible(760);
        //System.out.println(checkEligible(711));//ERROR
        System.out.println(getCreditScore());
        System.out.println("Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }
    public static int getCreditScore() {
        return 800;
    }
    public static void  checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("You are eligible to lease this car");
        } else {
            System.out.println("You are not eligible");
        }

    }
    

}
